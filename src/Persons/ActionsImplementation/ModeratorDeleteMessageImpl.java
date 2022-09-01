package Persons.ActionsImplementation;

import Messages.Message;
import Persons.ActionInterfaces.DeleteMessage;
import Persons.AdminActionFactory;
import Storage.MessageData;

import java.util.UUID;

public class ModeratorDeleteMessageImpl implements DeleteMessage {

    @Override
    public void deleteMessage(UUID messageID) {
        Message messageToDelete = MessageData.readByID(messageID);
        if(!messageToDelete.getSender().getRole().equals(new AdminActionFactory())) {
            MessageData.deleteData(messageID);
        }
    }
}
