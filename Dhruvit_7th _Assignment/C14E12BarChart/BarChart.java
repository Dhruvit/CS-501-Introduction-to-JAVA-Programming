import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.shape.Rectangle;

public class BarChart  extends Application {
	
	public static void main(String[] args) {
		  Application.launch(args);
	}
	
	@Override
	 public void start(Stage primaryStage) {	 
		Pane pane = new Pane();
	
		Rectangle project = new Rectangle(10, 60, 60, 40);
		project.setFill(Color.RED);
		pane.getChildren().add(new Text(10, 50, "Project-20%"));
		pane.getChildren().add(project);
		
		Rectangle quiz = new Rectangle(80, 80, 60, 20);
		quiz.setFill(Color.BLUE);
		pane.getChildren().add(new Text(80, 70, "Quiz-10%"));
		pane.getChildren().add(quiz);
		
		Rectangle midterm = new Rectangle(150, 40, 60, 60);
		midterm.setFill(Color.GREEN);
		pane.getChildren().add(new Text(143, 30, "Midterm-30%"));
		pane.getChildren().add(midterm);
		
		
		Rectangle _final = new Rectangle(220, 20, 60, 80);
		_final.setFill(Color.ORANGE);
		pane.getChildren().add(new Text(220, 10, "Final-40%"));
		pane.getChildren().add(_final);
		
		Scene scene = new Scene(pane, 300, 100);
		primaryStage.setTitle("Bar Chart");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}	 
	 
}
