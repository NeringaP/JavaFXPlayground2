package example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FirstExample extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox rootBox = new VBox();

        Label firstLabel = new Label("Hello world");
        Label secondLabel = new Label("Second line");
        Label firdLabel = new Label("Another line");

        rootBox.getChildren().addAll(firstLabel,secondLabel,firdLabel);

        Scene firstScene = new Scene(rootBox);

        primaryStage.setTitle("This is my first scene");
        primaryStage.setScene(firstScene);
        primaryStage.show();
    }
}
