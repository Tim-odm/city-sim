module org.example.citysim {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens org.example.citysim to javafx.fxml;
    exports org.example.citysim;
    exports org.example.citysim.layout;
    opens org.example.citysim.layout to javafx.fxml;
}
