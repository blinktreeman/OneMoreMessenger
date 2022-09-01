package Persons.ActionsImplementation;

import Persons.ActionAbstractFactory;
import Persons.ActionInterfaces.AddPerson;
import Persons.Person;
import Storage.Community;

public class AdminAddPersonImpl implements AddPerson {
    @Override
    public void addPerson(String alias, ActionAbstractFactory actionAbstractFactory) {
        Community.createPerson(new Person(alias, actionAbstractFactory));
    }
}
