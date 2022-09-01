package Storage;

import Messages.Message;
import Persons.Person;

import java.util.Date;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;

public class MessageData {
    private static final Map<UUID, Message> messageData = new TreeMap<>();

    private MessageData() {
    }

    public static void createData(Person recipient, String message) {
        if (!Community.getCurrentUser().isBanned()) {
            messageData.put(UUID.randomUUID(), new Message(Community.getCurrentUser(), recipient, message));
        }
    }

    public static Message readByID(UUID messageID) {
        return messageData.get(messageID);
    }

    public static void updateData(UUID messageID, Message message) {
        message.setUpdateDate(new Date());
        messageData.put(messageID, message);
    }

    public static void deleteData(UUID messageID) {
        messageData.remove(messageID);
    }


    public static Map<UUID, Message> getMessageData() {
        return messageData;
    }
}
