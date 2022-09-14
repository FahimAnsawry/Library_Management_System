module com.example.librarymanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.librarymanagementsystem to javafx.fxml;
    exports com.example.librarymanagementsystem;
}