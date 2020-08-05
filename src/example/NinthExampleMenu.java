package example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class NinthExampleMenu extends Application {
    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox rootBox = new VBox();
        MenuBar menuBar = new MenuBar();

        Menu menu = new Menu("Cars");
        Menu menuDrivers = new Menu("Drivers");

        MenuItem addCarMenuItem = new MenuItem("Add car");
        MenuItem listCars = new MenuItem("List Cars");
        MenuItem addDriver = new MenuItem("Add Driver");
        menu.getItems().addAll(addCarMenuItem, listCars);
        menuDrivers.getItems().addAll(addDriver);
        menuBar.getMenus().addAll(menu, menuDrivers);
        rootBox.getChildren().addAll(menuBar, new Label("TEST"));
        Scene scene = new Scene(rootBox);
        primaryStage.setWidth(900);
        primaryStage.setHeight(500);
        primaryStage.setScene(scene);
        primaryStage.show();



    }
}
