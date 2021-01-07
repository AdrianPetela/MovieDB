package com.pl;

import com.pl.fxUtils.FxmlUtils;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    public static final String SPLASH_FXML_BORDER_PANE = "/fxml/SplashScreen.fxml";

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception{
        Pane borderPane = FxmlUtils.fxmlLoader(SPLASH_FXML_BORDER_PANE);

        Scene scene = new Scene(borderPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("");
        primaryStage.show();
    }

}
