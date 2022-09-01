package Persons;

import Persons.ActionInterfaces.*;
import Persons.ActionsImplementation.*;

public class AdminActionFactory implements ActionAbstractFactory {

    @Override
    public CreateMessage getMessageCreator() {
        return new CreateMessageImpl();
    }

    @Override
    public ReadMessage getMessageReader() {
        return new AdminReadMessageImpl();
    }

    @Override
    public UpdateMessage getMessageUpdater() {
        return new AdminUpdateMessageImpl();
    }

    @Override
    public DeleteMessage getMessageDeleter() {
        return new AdminDeleteMessageImpl();
    }

    @Override
    public BanPerson getPersonBanner() {
        return new AdminBanPersonImpl();
    }

    @Override
    public AddPerson getPersonAdder() {
        return new AdminAddPersonImpl();
    }

    @Override
    public DeletePerson getPersonDeleter() {
        return new AdminDeletePersonImpl();
    }
}
