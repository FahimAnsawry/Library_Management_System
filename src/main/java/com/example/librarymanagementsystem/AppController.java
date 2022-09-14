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
import javafx.scene.image.ImageView;
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
    private PasswordField pass;
    @FXML
    private Button signup;

    @FXML
    private Button logoutbtn;
    @FXML
    private Button home;

    /* public void cancelButtonOnAction(ActionEvent event) {
       // Stage stage = (Stage) cancelButton.getScene().getWindow();
        //stage.close();
    }*/

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    // login for admin *************************************************
    @FXML
    public void Linbutton(ActionEvent event) throws IOException {

        if(!aid.getText().isBlank() && !pass.getText().isBlank()) {
            FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("adminpanel.fxml"));
            Stage stage = (Stage) Linbutton.getScene().getWindow();
            stage.setScene(new Scene(fxmlLoader.load()));
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Login");
            alert.setContentText("Login Successful !!!");
            alert.show();
        }
        else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Login");
            alert.setContentText("Please Provide id and password");
            alert.setHeaderText("Login Alert!!");
            alert.showAndWait();
        }
    }
    // logout button ****************************************************
    public void logoutbtn() throws IOException {

            FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("login.fxml"));
            Stage stage = (Stage) logoutbtn.getScene().getWindow();
            stage.setScene(new Scene(fxmlLoader.load()));
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Logout");
            alert.setContentText("Successfully Logout !!!");
            alert.show();

    }
    // back to home ***********************************************
    @FXML
    public void home() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("HomePage.fxml"));
        Stage stage = (Stage) home.getScene().getWindow();
        stage.setScene(new Scene(fxmlLoader.load()));
    }

    // sign up button **************************************************
    @FXML
    private TextField email;
    @FXML
    public void signup() throws IOException {

        if(!email.getText().isEmpty()) {
            FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("login.fxml"));
            Stage stage = (Stage) signup.getScene().getWindow();
            stage.setScene(new Scene(fxmlLoader.load()));
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Sign Up");
            alert.setContentText("Registration is Successful !!!!");
            alert.show();
        }
        else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Sign Up");
            alert.setContentText("Please Provide Email!!");
            alert.show();
        }

    }

    @FXML Button back1;
    @FXML
    public void back1() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("login.fxml"));
        Stage stage = (Stage) back1.getScene().getWindow();
        stage.setScene(new Scene(fxmlLoader.load()));
    }

    // admin sign up page **********************************************************
    @FXML
    private Button signupbtn;
    @FXML
    public void signupbtn() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("admin_signup.fxml"));
        Stage stage = (Stage) signupbtn.getScene().getWindow();
        stage.setScene(new Scene(fxmlLoader.load()));
    }

    // admin Panel ************************************************************************************
    @FXML
    private Button mngst;
    @FXML
    private Button mngbook;
    @FXML
    private Button searchbook;
    @FXML
    private Button mngbrwr;
    @FXML
    private Button adminstng;

    @FXML
    public void mngst() throws IOException {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Manage Students");
        alert.setContentText("Working On");
        alert.show();
    }
    @FXML
    public void mngbook() throws IOException {

    }
    @FXML
    public void searchbook() throws IOException {

    }
    @FXML
    public void mngbrwr() throws IOException {

    }
    @FXML
    public void adminstng() throws IOException {

    }

}


