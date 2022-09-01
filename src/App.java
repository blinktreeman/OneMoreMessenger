import Messages.Message;
import Persons.AdminActionFactory;
import Persons.ModeratorActionFactory;
import Persons.Person;
import Persons.UserActionFactory;
import Storage.Community;
import Storage.MessageData;

public class App {
    public static void main(String[] args) {

        Community.createPerson(new Person("Bob", new AdminActionFactory()));
        Community.setCurrentUser(Community.getPersonByAlias("Bob"));

        Person currentUser = Community.getCurrentUser();

        currentUser.getRole().getPersonAdder().addPerson("Nick", new UserActionFactory());
        currentUser.getRole().getPersonAdder().addPerson("Jack", new ModeratorActionFactory());

        Person Jack = Community.getPersonByAlias("Jack");
        currentUser.getRole().getMessageCreator().createMessage(Jack, "Hi, Jack!");

        MessageData.getMessageData().forEach((key, value) -> {
            if (value.getRecipient().equals(Jack)) {
                Message message = Jack.getRole().getMessageReader().readMessage(key);
                System.out.println(message.getMessage());
            }
        });

        try {
            Jack.getRole().getPersonDeleter().deletePerson(Community.getPersonByAlias("Nick"));
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }

        currentUser.getRole().getPersonBanner().banPerson(Jack);

        Community.getCommunity().forEach(System.out::println);
    }
}

/*
    Output:
    Action not available
    Hi, Jack!
    Person{alias='Bob', accountCreationDate=Thu Sep 01 18:26:43 ICT 2022,
        role=Persons.AdminActionFactory@3f8f9dd6, banLabel=false}
    Person{alias='Nick', accountCreationDate=Thu Sep 01 18:26:43 ICT 2022,
        role=Persons.UserActionFactory@aec6354, banLabel=false}
    Person{alias='Jack', accountCreationDate=Thu Sep 01 18:26:43 ICT 2022,
        role=Persons.ModeratorActionFactory@1c655221, banLabel=true}
 */