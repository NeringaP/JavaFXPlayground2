package example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;


public class EigthExampleTableView extends Application {

    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        TableView tableView = new TableView();
        TableColumn modelColumn = new TableColumn("Model");

        modelColumn.setCellValueFactory(new PropertyValueFactory<>("model"));
        TableColumn brandColumn = new TableColumn("Brand");
        brandColumn.setCellValueFactory(new PropertyValueFactory<>("brand"));
        tableView.getColumns().addAll(modelColumn, brandColumn);
        Car bmw = new Car("BMW", "3 series");
        Car mercedes = new Car("Mersas" , "GL");
        Car toyota = new Car("Toyota", "Prius");
        tableView.getItems().addAll(bmw, mercedes, toyota);
        Scene scene = new Scene(tableView);
        primaryStage.setWidth(900);
        primaryStage.setHeight(500);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
