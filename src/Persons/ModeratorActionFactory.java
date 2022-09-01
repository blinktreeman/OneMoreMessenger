package Persons;

import Persons.ActionInterfaces.*;
import Persons.ActionsImplementation.*;

public class ModeratorActionFactory implements ActionAbstractFactory {

    @Override
    public CreateMessage getMessageCreator() {
        return new CreateMessageImpl();
    }

    @Override
    public ReadMessage getMessageReader() {
        return new ModeratorReadMessageImpl();
    }

    @Override
    public UpdateMessage getMessageUpdater() {
        return new ModeratorUpdateMessageImpl();
    }

    @Override
    public DeleteMessage getMessageDeleter() {
        return new ModeratorDeleteMessageImpl();
    }

    @Override
    public BanPerson getPersonBanner() {
        return new ModeratorBanPersonImpl();
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
