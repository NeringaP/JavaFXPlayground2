package example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SecondExampleLifeCycle extends Application {

    public static void main(String[] args) {

        System.out.println("Entering main...");

        launch();

        System.out.println("Exiting main...");
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("Entering start method...");

        VBox rootBox = new VBox();
        Label firstLabel = new Label("Hello again");
        rootBox.getChildren().add(firstLabel);

        Scene firstScene = new Scene(rootBox);
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        primaryStage.setScene(firstScene);
        primaryStage.show();
    }
}
