/*
 * University of Glasgow
 * Msc Project fall, 2019
 * Author: Yidi Cao
 * 
 * Controller for Layout.fxml file
*/

package Application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;

import C.CRun;
import python.pythonRun;

public class LayoutController extends BorderPane{
	//Variables
	private ObservableList<String> box_content = FXCollections
			.observableArrayList("C","Python");
	//Graphics
	@FXML
	private VBox vbox;
	@FXML
	private HBox hbox;
	@FXML
	private BorderPane root;
	//Language Chooser and buttons
	@FXML
	private Button button;
	@FXML
	private Button clear;
	@FXML
	private ImageView arrow;
	@FXML
	private ComboBox<String> box1;
	@FXML
	private ComboBox<String> box2;
	//Text areas for input/output
	@FXML
	private TextArea text1;
	@FXML
	private TextArea text2;
	//Methods
	//Output result  code
	public void setCode(String output) {
		text2.setText(null);
		text2.setText(output);
	}
	//Warning of syntactic errors
	public void syntaxError() {
		text2.setText(null);
		text2.setText("There are systax errors with the input! \n "
				+ "Please check the type of chosen source language.");
	}
	//Warning of contextual errors
	public void contextualError(String errors) {
		text2.setText(null);
		text2.setText("There are contextual errors with the input!\n" + errors);
	}
	//Actions
	//Layout initialization
	@FXML
	private void initialize() {
		box1.setValue("C");
		box2.setValue("Python");
		box1.setItems(box_content);
		box2.setItems(box_content);
		text1.setFocusTraversable(false);
		text1.setPromptText("Please enter code here");
		text1.prefHeightProperty().bind(vbox.heightProperty().multiply(0.45));
		text2.prefHeightProperty().bind(vbox.heightProperty().multiply(0.45));
	}
	//Click Translate button
	@FXML
	private void goButton() {
		if(text1.getText() != null && !(text1.getText().equals(""))) {
			if(box1.getValue().equals("C")) {
				CRun.main(text1.getText(),this);
			}
			else if(box1.getValue().equals("Python")) {
				pythonRun.main(text1.getText(),this);
			}
		}
	}
	//Click clear button
	@FXML
	private void goClear() {
		text1.setText(null);
		text2.setText(null);
	}
	//Left combo box
	@FXML
	private void box1() {
		if(box1.getValue().equals("C")) {
			box2.setValue("Python");
		}
		else if(box1.getValue().equals("Python")) {
			box2.setValue("C");
		}
	}
	//Right combo box
	@FXML
	private void box2() {
		if(box2.getValue().equals("C")) {
			box1.setValue("Python");
		}
		else if(box2.getValue().equals("Python")) {
			box1.setValue("C");
		}
	}
	//Click arrow image
	@FXML
	private void arrowClick() {
		String left = box1.getValue();
		String right = box2.getValue();
		box1.setValue(right);
		box2.setValue(left);
	}
}
