package Application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application{
	static Stage window;
	static Layout Layout;
	
	public static void main(String[] args) {
        launch(args);
    }
	@Override
	public void start(Stage primaryStage) throws Exception {
		Layout = new Layout();
		Main.window = primaryStage;
		BorderPane borderPane = new BorderPane();
//		Parent root = FXMLLoader.load(getClass().getResource("/fxml/Layout.fxml"));
		try {
			Scene scene = new Scene(borderPane, 600, 400);
			primaryStage.setTitle("Lanuage Translator");
			// Adding the scene to Stage
			primaryStage.setScene(scene);
			scene.getStylesheets().add(getClass().getResource("/fxml/Layout.css").toExternalForm());
			// Displaying the contents of the stage
			Main.window.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
		borderPane.setCenter(Layout);
	}

}
