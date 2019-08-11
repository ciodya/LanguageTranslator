package Application;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application{
	private Stage primaryStage;
	private BorderPane mainLayout;
	
//	static Stage window;
//	static Layout Layout;
	
	public static void main(String[] args) {
        launch(args);
    }
	public void showView() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("/fxml/Layout.fxml"));
		mainLayout = loader.load();
		Scene scene = new Scene(mainLayout);
		primaryStage.setScene(scene);
	}
	@Override
	public void start(Stage primaryStage) throws IOException {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Lanuage Translator");
		showView();
		primaryStage.show();
		
		
		
		
//		Layout = new Layout();
//		Main.window = primaryStage;
//		BorderPane borderPane = new BorderPane();
////		Parent root = FXMLLoader.load(getClass().getResource("/fxml/Layout.fxml"));
//		try {
//			Scene scene = new Scene(borderPane, 600, 400);
//			primaryStage.setTitle("Lanuage Translator");
//			// Adding the scene to Stage
//			primaryStage.setScene(scene);
//			scene.getStylesheets().add(getClass().getResource("/fxml/Layout.css").toExternalForm());
//			// Displaying the contents of the stage
//			Main.window.show();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		borderPane.setCenter(Layout);
	}

}
