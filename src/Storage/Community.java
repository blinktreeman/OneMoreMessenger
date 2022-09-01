package Storage;

import Persons.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Community {
    private static final List<Person> community = new ArrayList<>();
    private static Person currentUser = null;

    private Community() {
    }

    public static List<Person> getCommunity() {
        return community;
    }

    public static Person getCurrentUser() {
        return currentUser;
    }
    public static void setCurrentUser(Person person) {
        currentUser = person;
    }

    public static void createPerson(Person person) {
        community.add(person);
    }

    public static void deletePerson(Person person) {
        community.remove(person);
    }

    public static Person getPersonByID(UUID personID) {
        return community.stream().filter(person ->
                person.getPersonID().equals(personID)).findFirst().orElseThrow(() ->
                new RuntimeException("Person not found"));
    }

    public static Person getPersonByAlias(String alias) {
        return community.stream().filter(person ->
                person.getAlias().equals(alias)).findFirst().orElseThrow(() ->
                new RuntimeException("Person not found"));
    }

}
