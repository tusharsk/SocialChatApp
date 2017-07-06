package com.example.tusharsk.socialchatapp.Model;

/**
 * Created by tusharsk on 6/7/17.
 */

import java.io.Serializable;
import java.util.ArrayList;

public class ChatMessages implements Serializable {

    int messageId;
    String message;
    String time;
    String sender;

    public ChatMessages(int messageId, String message, String time, String sender) {
        this.messageId = messageId;
        this.message = message;
        this.time = time;
        this.sender = sender;
    }

    public int getMessageId() {
        return messageId;
    }

    public String getMessage() {
        return message;
    }

    public String getTime() {
        return time;
    }

    public String getSender() {
        return sender;
    }
}