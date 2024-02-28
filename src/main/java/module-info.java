module utc.mx.tallermecanicodb {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    //requires org.kordamp.ikonli.fontawesome;

    opens utc.mx.tallermecanicodb to javafx.fxml;
    exports utc.mx.tallermecanicodb;
}