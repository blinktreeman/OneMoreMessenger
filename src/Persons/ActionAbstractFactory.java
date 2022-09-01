package Persons;

import Persons.ActionInterfaces.*;

public interface ActionAbstractFactory {
    CreateMessage getMessageCreator();
    ReadMessage getMessageReader();
    UpdateMessage getMessageUpdater();
    DeleteMessage getMessageDeleter();
    BanPerson getPersonBanner();
    AddPerson getPersonAdder();
    DeletePerson getPersonDeleter();
}
