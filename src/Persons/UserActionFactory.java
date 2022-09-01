package Persons;

import Persons.ActionInterfaces.*;
import Persons.ActionsImplementation.*;

public class UserActionFactory implements ActionAbstractFactory {

    @Override
    public CreateMessage getMessageCreator() {
        return new CreateMessageImpl();
    }

    @Override
    public ReadMessage getMessageReader() {
        return new UserReadMessageImpl();
    }

    @Override
    public UpdateMessage getMessageUpdater() {
        return new UserUpdateMessageImpl();
    }

    @Override
    public DeleteMessage getMessageDeleter() {
        return new UserDeleteMessageImpl();
    }

    @Override
    public BanPerson getPersonBanner() {
        throw new RuntimeException("Action not available");
    }

    @Override
    public AddPerson getPersonAdder() {
        throw new RuntimeException("Action not available");
    }

    @Override
    public DeletePerson getPersonDeleter() {
        throw new RuntimeException("Action not available");
    }
}
