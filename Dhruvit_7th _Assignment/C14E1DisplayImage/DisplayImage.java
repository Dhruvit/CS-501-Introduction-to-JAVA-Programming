import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class DisplayImage extends Application{

	public static void main(String[] args) {
		Application.launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		
		GridPane pane = new GridPane();
		pane.setHgap(6);
		pane.setVgap(6);
		
		Image image1 = new Image("image/usa.png");
		ImageView view1 = new ImageView(image1);
		view1.setFitHeight(240);
		view1.setFitWidth(320);
		pane.add(view1,0,0);
		
		Image image2 = new Image("image/india.jpg");
		ImageView view2 = new ImageView(image2);
		view2.setFitHeight(240);
		view2.setFitWidth(320);
		pane.add(view2,1,0);
		
		Image image3 = new Image("image/australya.gif");
		ImageView view3 = new ImageView(image3);
		view3.setFitHeight(240);
		view3.setFitWidth(320);
		pane.add(view3,0,1);
		
		Image image4 = new Image("image/canad.png");
		ImageView view4 = new ImageView(image4);
		view4.setFitHeight(240);
		view4.setFitWidth(320);
		pane.add(view4,1,1);
		
		Scene scene = new Scene(pane,640,480);
		primaryStage.setTitle("Display Image");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
		
	}
}
