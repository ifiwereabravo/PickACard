package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		// card 1
		int randomNum1 = 1 + (int)(Math.random()*52); 
		
		Pane pane = new HBox(10);
	    pane.setPadding(new Insets(5, 5, 5, 5));
	    Image image = new Image("card/" + randomNum1 + ".png");
	    pane.getChildren().add(new ImageView(image));
	    
	    
	    // card 2
	    int randomNum2 = 1 + (int)(Math.random()*52); 
	    
	    pane.setPadding(new Insets(5, 5, 5, 5));
	    Image image2 = new Image("card/" + randomNum2 + ".png");
	    pane.getChildren().add(new ImageView(image2));   
	    
	    
	    // card 3
	    int randomNum3 = 1 + (int)(Math.random()*52); 
	   
	    pane.setPadding(new Insets(5, 5, 5, 5));
	    Image image3 = new Image("card/" + randomNum3 + ".png");
	    pane.getChildren().add(new ImageView(image3));   
	       
	    // Create a scene and place it in the stage
	    Scene scene = new Scene(pane);
	    primaryStage.setTitle("ShowImage"); // Set the stage title
	    primaryStage.setScene(scene); // Place the scene in the stage
	    primaryStage.show(); // Display the stage
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
