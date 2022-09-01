package Persons.ActionsImplementation;

import Messages.Message;
import Persons.ActionInterfaces.UpdateMessage;
import Storage.MessageData;

import java.util.UUID;

public class AdminUpdateMessageImpl implements UpdateMessage {

    @Override
    public void updateMessage(UUID messageID, Message message) {
        MessageData.updateData(messageID, message);
    }
}

