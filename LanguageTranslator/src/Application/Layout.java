package Application;

import java.io.IOException;
import java.net.URL;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;

public class Layout extends BorderPane{
	
	public Layout() throws Exception {
		FXMLLoader fxmlLoader = new FXMLLoader();
//		fxmlLoader.load("/fxml/Layout.fxml");
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

}
