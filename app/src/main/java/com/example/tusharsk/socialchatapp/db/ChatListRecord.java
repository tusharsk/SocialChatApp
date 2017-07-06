package com.example.tusharsk.socialchatapp.db;

/**
 * Created by tusharsk on 6/7/17.
 */
import android.provider.BaseColumns;
public class ChatListRecord extends SQLQueryCommands {
    public static final String TABLE_NAME = "ChatListRecord";
    public interface Columns {
        String ID="id";
        String NAME = "name";
        String PHONE = "phone";
        String CHAT_ID = "chat_id";
    }

    public static final String TABLE_CREATE_CMD =
            "CREATE TABLE IF NOT EXISTS " + TABLE_NAME
                    + LBR
                    + Columns.ID + TYPE_INT_PK + COMMA
                    + Columns.NAME + TYPE_TEXT + COMMA
                    + Columns.CHAT_ID + TYPE_TEXT + COMMA
                    + Columns.PHONE + TYPE_TEXT
                    + RBR + SEMI_COLON;

}