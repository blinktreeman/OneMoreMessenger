package Persons.ActionsImplementation;

import Messages.Message;
import Persons.ActionInterfaces.ReadMessage;
import Storage.MessageData;

import java.util.UUID;

public class ModeratorReadMessageImpl implements ReadMessage {
    @Override
    public Message readMessage(UUID messageID) {
        return MessageData.readByID(messageID);
    }
}

