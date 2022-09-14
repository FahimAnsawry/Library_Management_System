package com.example.librarymanagementsystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("HomePage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Library Management System");
        stage.setScene(scene);
        stage.resizableProperty().setValue(false);  // fixed the window
        stage.getIcons().add(new Image(Objects.requireNonNull(App.class.getResourceAsStream("bookshelf.png"))));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);  // launch the app
    }
}