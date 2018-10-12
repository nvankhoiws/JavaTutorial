package core.self.corejavabook.lambda.syntax;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

// From the command line, you can run this program as
// java ch03.sec04.ButtonDemo
// even though it has no main method

public class ButtonDemo extends Application {
	public void start(Stage stage) {

		Button button = new Button("Ok");

		/**
		 * block code 1
		 * This block code equals with block code 2
		 */
		// button.setOnAction(e ->  {
		// 		System.out.println(e instanceof EventHandler);
		// });

		/**
		 * start: block code 2
		 */
		button.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println(event instanceof ActionEvent);
			}
		});
		/**
		 * end: block code 2
		 */

		Label message = new Label("Hello, JavaFX!");
		message.setFont(new Font(100));
		VBox root = new VBox();
		root.getChildren().addAll(button, message);
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}