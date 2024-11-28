module com.gchaldu.javafxcalculators {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.gchaldu.javafxcalculators.calculators.controller to javafx.fxml;
    exports com.gchaldu.javafxcalculators;
}