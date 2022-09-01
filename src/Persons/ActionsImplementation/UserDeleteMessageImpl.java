package Persons.ActionsImplementation;

import Messages.Message;
import Persons.ActionInterfaces.DeleteMessage;
import Persons.AdminActionFactory;
import Persons.ModeratorActionFactory;
import Storage.MessageData;

import java.util.UUID;

public class UserDeleteMessageImpl implements DeleteMessage {
    @Override
    public void deleteMessage(UUID messageID) {
        Message messageToDelete = MessageData.readByID(messageID);
        if(!messageToDelete.getSender().getRole().equals(new AdminActionFactory()) &&
                !messageToDelete.getSender().getRole().equals(new ModeratorActionFactory())) {
            MessageData.deleteData(messageID);
        }
    }
}
