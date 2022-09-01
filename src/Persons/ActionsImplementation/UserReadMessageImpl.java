package Persons.ActionsImplementation;

import Messages.Message;
import Persons.ActionInterfaces.ReadMessage;
import Persons.AdminActionFactory;
import Persons.ModeratorActionFactory;
import Persons.UserActionFactory;
import Storage.MessageData;

import java.util.UUID;

public class UserReadMessageImpl implements ReadMessage {
    @Override
    public Message readMessage(UUID messageID) {
        Message messageToRead = MessageData.readByID(messageID);
        if (messageToRead.getSender().getRole().equals(new AdminActionFactory())
                || messageToRead.getSender().getRole().equals(new ModeratorActionFactory())
                && messageToRead.getRecipient().getRole().equals(new AdminActionFactory())
                || messageToRead.getRecipient().getRole().equals(new ModeratorActionFactory())) {
            throw new RuntimeException("Access denied");
        } else
            return MessageData.readByID(messageID);
    }
}