package Persons.ActionsImplementation;

import Persons.ActionInterfaces.DeleteMessage;
import Storage.MessageData;

import java.util.UUID;

public class AdminDeleteMessageImpl implements DeleteMessage {

    @Override
    public void deleteMessage(UUID messageID) {
        MessageData.deleteData(messageID);
    }
}
