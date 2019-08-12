/*
 * University of Glasgow
 * Msc Project fall, 2019
 * Author: Yidi Cao
 * 
 * Driver for the application
*/

package Application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application{
	private Stage primaryStage;
	private BorderPane Layout;
	//Constructor
	public static void main(String[] args) {
        launch(args);
    }
	//Program window
	@Override
	public void start(Stage primaryStage) throws IOException {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Lanuage Translator");
		showView();
		primaryStage.show();
	}
	//Load Layout.fxml, and set controller for it
	private void showView() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("Layout.fxml"));
		Layout = loader.load();
		loader.setController(Main.class.getResource("LayoutController.java"));
		Scene scene = new Scene(Layout);
		primaryStage.setScene(scene);
	}
}
