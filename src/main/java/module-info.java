module com.shamilla.mcdonaldmenu {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.shamilla.mcdonaldmenu to javafx.fxml;
    exports com.shamilla.mcdonaldmenu;
}