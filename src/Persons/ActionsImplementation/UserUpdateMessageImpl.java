package Persons.ActionsImplementation;

import Messages.Message;
import Persons.ActionInterfaces.UpdateMessage;
import Persons.AdminActionFactory;
import Persons.ModeratorActionFactory;
import Storage.MessageData;

import java.util.UUID;

public class UserUpdateMessageImpl implements UpdateMessage {
    @Override
    public void updateMessage(UUID messageID, Message message) {
        Message messageToUpdate = MessageData.readByID(messageID);
        if(!messageToUpdate.getSender().getRole().equals(new AdminActionFactory()) &&
                !messageToUpdate.getSender().getRole().equals(new ModeratorActionFactory())) {
            MessageData.updateData(messageID, message);
        }
    }
}
