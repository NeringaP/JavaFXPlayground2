package example;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SixthExampleGridPlane extends Application {
    public static void main(String[] args) {
        launch();
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane rootGridPane = new GridPane();

        rootGridPane.setHgap(10);
        rootGridPane.setVgap(10);
        rootGridPane.setAlignment(Pos.TOP_CENTER);

        Label firstLabel = new Label("hello world");
        Button button = new Button("Click");
        CheckBox checkBox  = new CheckBox("Yes/no");

    }
}
