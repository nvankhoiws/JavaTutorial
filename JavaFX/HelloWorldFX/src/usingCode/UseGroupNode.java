package usingCode;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class UseGroupNode extends Application {

    @Override
    public void start(Stage stage) throws Exception{
//        Group group = new Group();

        Parent group = new Group();

        Label label = new Label();
        label.setText("Label hello inside");
        label.setTextFill(Color.RED);
        label.setFont(Font.font("Consolas", FontWeight.BOLD, 20));

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.TOP_LEFT);
        gridPane.setVgap(30);
        gridPane.setHgap(30);

        gridPane.getChildren().add(label);
        ((Group) group).getChildren().add(gridPane);

        stage.setTitle("Tool set");
        stage.setScene(new Scene(group, 600, 500));
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
