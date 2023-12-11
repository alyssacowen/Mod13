package com.example.csc325_firebase_webview_auth.modelview;

public class sharedData {
    private static String userName;

    public static String getUserName() {
        return userName;
    }

    public static void setUserName(String name) {
        userName = name;
    }
}