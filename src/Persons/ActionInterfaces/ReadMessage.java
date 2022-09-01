package Persons.ActionInterfaces;

import Messages.Message;

import java.util.UUID;

public interface ReadMessage {
    Message readMessage(UUID messageID);
}
