package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        GridPane root = new GridPane();
//        root.setAlignment(Pos.TOP_LEFT);
//        root.setVgap(30);
//        root.setHgap(30);
//
//        Label label = new Label();
//        label.setText("Label hello inside");
//        label.setTextFill(Color.RED);
//        label.setFont(Font.font("Consolas",FontWeight.BOLD, 20));
//        root.getChildren().add(label);

        primaryStage.setTitle("Tool set");
        primaryStage.setScene(new Scene(root, 600, 500));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
