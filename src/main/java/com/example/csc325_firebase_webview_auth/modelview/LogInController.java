package com.example.csc325_firebase_webview_auth.modelview;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LogInController {

    @FXML
    private final TextField usernameField;

    @FXML
    private final PasswordField passwordField;

    public LogInController(TextField usernameField, PasswordField passwordField) {
        this.usernameField = usernameField;
        this.passwordField = passwordField;
    }

    @FXML
    private void signInAction(ActionEvent event) throws IOException {
        String userName = usernameField.getText();
        sharedData.setUserName(userName);
        String password = passwordField.getText();
    }

}