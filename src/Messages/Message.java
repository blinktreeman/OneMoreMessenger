package Messages;

import Persons.Person;

import java.util.Date;
import java.util.UUID;

public class Message {
    private final Person sender;
    private final Person recipient;
    private String message;
    private final Date creationDate;
    private Date updateDate;

    public Message(Person sender, Person recipient, String message) {
        this.sender = sender;
        this.recipient = recipient;
        this.message = message;
        this.creationDate = new Date();
        this.updateDate = new Date();
    }

    public Person getSender() {
        return sender;
    }

    public Person getRecipient() {
        return recipient;
    }

    public String getMessage() {
        return message;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "Message{" +
                ", sender=" + sender +
                ", recipient=" + recipient +
                ", message='" + message + '\'' +
                ", creationDate=" + creationDate +
                ", updateDate=" + updateDate +
                '}';
    }
}
