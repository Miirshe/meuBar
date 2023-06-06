module com.example.dropdownmenu {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dropdownmenu to javafx.fxml;
    exports com.example.dropdownmenu;
}