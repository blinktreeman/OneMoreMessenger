package Persons.ActionsImplementation;

import Persons.ActionInterfaces.CreateMessage;
import Persons.Person;
import Storage.Community;
import Storage.MessageData;

public class CreateMessageImpl implements CreateMessage {
    @Override
    public void createMessage(Person recipient, String message) {
        if (!Community.getCurrentUser().equals(recipient)) {
            MessageData.createData(recipient, message);
        }
    }
}
