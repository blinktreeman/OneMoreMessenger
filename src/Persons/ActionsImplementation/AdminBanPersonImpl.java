package Persons.ActionsImplementation;

import Persons.ActionInterfaces.BanPerson;
import Persons.Person;

public class AdminBanPersonImpl implements BanPerson {

    @Override
    public void banPerson(Person person) {
        person.setBanLabel();
    }
}
