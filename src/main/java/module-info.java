module com.example.lauregistration {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires org.seleniumhq.selenium.api;
    requires org.seleniumhq.selenium.chrome_driver;

    opens com.example.lauregistration to javafx.fxml;
    exports com.example.lauregistration;
}