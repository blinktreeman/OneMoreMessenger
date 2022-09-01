package Persons;

import java.util.Date;
import java.util.UUID;

public class Person {
    private final UUID personID;
    private final String alias;
    private String name;
    private String surname;
    private int age;
    private final Date accountCreationDate;
    private boolean banLabel = false;
    private ActionAbstractFactory role = null;

    public Person(String alias, ActionAbstractFactory role) {
        this.personID = UUID.randomUUID();
        this.alias = alias;
        this.accountCreationDate = new Date();
        this.role = role;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRole(ActionAbstractFactory role) {
        this.role = role;
    }

    public void setBanLabel() {
        this.banLabel = true;
    }

    public void removeBanLabel() {
        this.banLabel = false;
    }

    public boolean isBanned() {
        return banLabel;
    }

    public UUID getPersonID() {
        return personID;
    }

    public String getAlias() {
        return alias;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public Date getAccountCreationDate() {
        return accountCreationDate;
    }

    public ActionAbstractFactory getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Person{" +
                "alias='" + alias + '\'' +
                ", accountCreationDate=" + accountCreationDate +
                ", role=" + role +
                ", banLabel=" + banLabel +
                '}';
    }
}
