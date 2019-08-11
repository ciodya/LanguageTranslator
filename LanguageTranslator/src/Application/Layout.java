package Application;

import java.io.IOException;
import java.net.URL;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

public class Layout extends BorderPane{
	@FXML
	private Button button;
	@FXML
	private ComboBox<String> box1;
	@FXML
	private ComboBox<String> box2;
	
	ObservableList<String> box_content = FXCollections
			.observableArrayList("C","Python");
	
	
	public Layout() throws Exception {
		FXMLLoader fxmlLoader = new FXMLLoader();
		URL location = getClass().getResource("/fxml/Layout.fxml");
		fxmlLoader.setRoot(this);
		fxmlLoader.setLocation(location);
		fxmlLoader.setController(this);
		try {
			fxmlLoader.load();
		} catch (IOException exception) {
			throw new RuntimeException(exception);
		}
	}
	
	private void initialize() {
		box1.setValue("C");
		box2.setValue("Python");
		box1.setItems(box_content);
		box2.setItems(box_content);
		
		
	}

}
