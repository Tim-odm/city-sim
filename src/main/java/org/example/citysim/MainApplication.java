package org.example.citysim;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.example.citysim.game.Game;
import org.example.citysim.layout.BaseController;
import org.w3c.dom.Text;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("base" +
                ".fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1200, 800);
        Game game = new Game();

        BaseController controller = fxmlLoader.getController();
        controller.setGame(game);

        game.init();
        stage.setTitle("City Simulator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
