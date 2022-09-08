package com.example.librarymanagementsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AppController implements Initializable {

    @FXML
    private Button Linbutton;

    @FXML
    private TextField aid;

    @FXML
    private Button cancelButton;

    @FXML
    private PasswordField pass;

    @FXML
    private Button logoutButton;

    public void cancelButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    public void Linbutton(ActionEvent event) throws IOException {

        if(!aid.getText().isBlank() && !pass.getText().isBlank()) {
            FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("adminpanel.fxml"));
            Stage stage = (Stage) Linbutton.getScene().getWindow();
            stage.setScene(new Scene(fxmlLoader.load()));
        }
        else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Login");
            alert.setContentText("Please Provide id and password");
            alert.setHeaderText("Login Alert!!");
            alert.showAndWait();
        }
    }
    public void logoutButton() throws IOException {

            FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("login.fxml"));
            Stage stage = (Stage) logoutButton.getScene().getWindow();
            stage.setScene(new Scene(fxmlLoader.load()));
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Logout");
            alert.setContentText("Successfully Logout!!!");
            alert.show();

    }

}


