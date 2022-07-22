module com.example.workshopjavafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.workshopjavafxjdbc to javafx.fxml;
    exports com.example.workshopjavafxjdbc;
    opens com.example.workshopjavafxjdbc.model.entities to javafx.graphics, javafx.fxml, javafx.base;
    opens com.example.workshopjavafxjdbc.model.services to javafx.graphics, javafx.fxml;
    opens com.example.workshopjavafxjdbc.gui.listeners to javafx.graphics, javafx.fxml, javafx.base;
}