package com.example.tusharsk.socialchatapp.Model;

/**
 * Created by tusharsk on 6/7/17.
 */

public class ContactData {
    private String name;
    private String phone;

    public ContactData(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}