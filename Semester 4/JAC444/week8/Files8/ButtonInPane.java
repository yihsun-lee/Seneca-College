import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ButtonInPane extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a scene and place a button in the scene
		StackPane pane = new StackPane();
		Button b = new Button("OK");
		b.setOnAction(new EventHandler<ActionEvent>() { // anonymous inner class
			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("Welcome to JavaFX!");
			}
		});
		pane.getChildren().add(b);    
		Scene scene = new Scene(pane, 200, 50);
		primaryStage.setTitle("Button in a pane"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	/**
	 * The main method is only needed for the IDE with limited
	 * JavaFX support. Not needed for running from the command line.
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
