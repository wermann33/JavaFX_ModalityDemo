module net.jwizard.javafx_modalitydemo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens net.jwizard.javafx_modalitydemo to javafx.fxml;
    exports net.jwizard.javafx_modalitydemo;
}