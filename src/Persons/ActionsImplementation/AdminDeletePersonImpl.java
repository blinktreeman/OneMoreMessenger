package Persons.ActionsImplementation;

import Persons.ActionInterfaces.DeletePerson;
import Persons.Person;
import Storage.Community;

public class AdminDeletePersonImpl implements DeletePerson {
    @Override
    public void deletePerson(Person person) {
        Community.deletePerson(person);
    }
}
