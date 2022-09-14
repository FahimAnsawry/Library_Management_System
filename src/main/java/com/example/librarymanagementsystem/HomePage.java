package com.example.librarymanagementsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class HomePage {

    @FXML
    private Button adminbutton;

    // connect with login page
    @FXML
    public void adminbutton(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("login.fxml"));
        Stage stage = (Stage) adminbutton.getScene().getWindow();
        stage.setScene(new Scene(fxmlLoader.load()));
    }

}
