module co.edu.uniquindio.actividad1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.actividad1 to javafx.fxml;
    exports co.edu.uniquindio.actividad1;
}