package example;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class SeventhExampleEvents extends Application {

    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setAlignment(Pos.TOP_CENTER);

        Label nameLabel = new Label("Name:");
        Label emailLabel = new Label("Email:");
        Label countryLabel = new Label("Country:");

        TextField nameTextField = new TextField();
        nameTextField.setMaxWidth(100);

        TextField emailTextField = new TextField();
        emailTextField.setMaxWidth(100);

        ComboBox<String> countryComboBox = new ComboBox<>();
        countryComboBox.getItems().addAll("Lithuania", "Estonia", "Latvia");

        Button addUserButton = new Button("Add user");
        gridPane.add(nameLabel, 0, 0);
        gridPane.add(nameTextField, 1, 0);
        gridPane.add(emailLabel, 0, 1);
        gridPane.add(emailTextField, 1, 1);
        gridPane.add(countryLabel, 0, 2);
        gridPane.add(countryComboBox, 1, 2);
        gridPane.add(addUserButton, 1, 3);
        //setOnMouseClicked method defines what happens when the button is clicked.
        addUserButton.setOnMouseClicked(event -> {
            System.out.println("Add users button WAS CLICKED!");
            String name = nameTextField.getText();
            System.out.println("Entered name was: " + name);

            String email = emailTextField.getText();
            System.out.println("Entered email was: " + email);
            String country = countryComboBox.getValue();
            System.out.println("Entered country was: " + country);

            Label label = new Label("Nice!");
            gridPane.add(label, 0, 3);
        });

        Scene scene = new Scene(gridPane);
        primaryStage.setWidth(900);
        primaryStage.setHeight(500);
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
