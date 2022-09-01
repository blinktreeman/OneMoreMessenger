package Persons.ActionsImplementation;

import Persons.ActionInterfaces.BanPerson;
import Persons.Person;
import Persons.UserActionFactory;

public class ModeratorBanPersonImpl implements BanPerson {

    @Override
    public void banPerson(Person person) {
        if (person.getRole().equals(new UserActionFactory())) {
            person.setBanLabel();
        }
    }
}
