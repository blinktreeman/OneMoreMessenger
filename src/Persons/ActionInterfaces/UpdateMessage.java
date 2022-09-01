package Persons.ActionInterfaces;

import Messages.Message;

import java.util.UUID;

public interface UpdateMessage {
    void updateMessage(UUID messageID, Message message);
}
