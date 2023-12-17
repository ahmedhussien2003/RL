module com.example.donor333 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.donor333 to javafx.fxml;
    exports com.example.donor333;
}