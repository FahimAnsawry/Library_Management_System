module com.example.librarymanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.librarymanagementsystem to javafx.fxml;
    exports com.example.librarymanagementsystem;
}