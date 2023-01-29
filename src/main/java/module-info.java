module com.example.niversaver {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;


    opens com.example.niversaver to javafx.fxml;
    exports com.example.niversaver;
    exports com.example.niversaver.Controller;
    opens com.example.niversaver.Controller to javafx.fxml;
}