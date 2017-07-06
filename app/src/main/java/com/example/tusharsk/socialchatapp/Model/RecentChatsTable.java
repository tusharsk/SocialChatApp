package com.example.tusharsk.socialchatapp.Model;

/**
 * Created by tusharsk on 6/7/17.
 */

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecentChatsTable implements Serializable {
    String name;
    int chatId;
    String phone;

    public String getName() {
        return name;
    }

    public RecentChatsTable(String name, int chatId, String phone) {
        this.name = name;
        this.chatId = chatId;
        this.phone = phone;
    }

    public int getChatId() {
        return chatId;
    }

    public String getPhone() {
        return phone;
    }
}