package usingCode;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class UseGridPaneAsGroup extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        Label label = new Label();
        label.setText("Label hello inside");
        label.setTextFill(Color.RED);
        label.setFont(Font.font("Consolas", FontWeight.BOLD, 20));

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.TOP_LEFT);
        gridPane.setVgap(30);
        gridPane.setHgap(30);

        gridPane.getChildren().add(label);

        stage.setTitle("Tool set");
        stage.setScene(new Scene(gridPane, 600, 500));

        stage.show();

//        Thread.sleep(2000);
//
//        stage.close();
//        stage.setHeight(1000.0f);
//        stage.setWidth(1200.0f);
//
//        gridPane.setAlignment(Pos.TOP_RIGHT);
//
//        stage.show();
////        stage.setScene(new Scene(gridPane, 300, 300));
    }


    public static void main(String[] args) {
        launch(args);
    }
}
