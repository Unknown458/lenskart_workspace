module org.demoproject.demogol {
    requires javafx.controls;
    requires javafx.fxml;
    requires MaterialFX;

    requires org.kordamp.bootstrapfx.core;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires javafx.media;
    requires AnimateFX;
    requires mysql.connector.java;
    requires com.h2database;
    requires GNAvatarView;
    requires javafx.graphics;

    opens org.demoproject.demogol to javafx.fxml;
    exports org.demoproject.demogol;
}