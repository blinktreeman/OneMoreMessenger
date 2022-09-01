package Persons.ActionsImplementation;

import Messages.Message;
import Persons.ActionInterfaces.UpdateMessage;
import Persons.AdminActionFactory;
import Storage.MessageData;

import java.util.UUID;

public class ModeratorUpdateMessageImpl implements UpdateMessage {

    @Override
    public void updateMessage(UUID messageID, Message message) {
        Message messageToUpdate = MessageData.readByID(messageID);
        if(!messageToUpdate.getSender().getRole().equals(new AdminActionFactory())) {
            MessageData.updateData(messageID, message);
        }
    }
}

