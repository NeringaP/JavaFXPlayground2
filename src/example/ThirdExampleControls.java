package example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ThirdExampleControls extends Application {

    public static void main(String[] args) {
        System.out.println("Start");
        launch();
        System.out.println("Finish");
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox vBox = new VBox();
        Label firstLabel = new Label("Hi hi again");

        Button firstButton = new Button("Click me!");

        CheckBox firstCheckbox = new CheckBox("Yeah/noo");

        ComboBox firstComboBox = new ComboBox();
        firstComboBox.getItems().addAll("1st", "2nd", "3rd");

        TextField textField = new TextField("write a line");
        TextArea textArea = new TextArea("Write few lines here");

        vBox.getChildren().addAll(firstButton, firstCheckbox, firstLabel, firstComboBox, textField, textArea);



        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        Scene scene = new Scene(vBox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
