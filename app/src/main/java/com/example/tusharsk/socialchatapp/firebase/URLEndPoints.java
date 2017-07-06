package com.example.tusharsk.socialchatapp.firebase;

/**
 * Created by tusharsk on 6/7/17.
 */

public class URLEndPoints {
    public interface EndPoints {
        String HOST = "";
        String NEW_USER = "http://"+HOST+"/user/login";
        String UPDATE_FCM_ID = "http://"+HOST+"/user/";
        String GET_USER = "http://"+HOST+"/user/";
        String GET_CHATS = "http://"+HOST+"/messages/";
        String GET_CHAT_ID = "http://"+HOST+"/find_chat/_send_/chat_id/_receive_";
        String NEW_MESSAGE = "http://"+HOST+"/find_chat/_CHAT_ID_/message";

    }
}