package Application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;

import C.CRun;
import python.pythonRun;

public class LayoutController extends BorderPane{
	
	ObservableList<String> box_content = FXCollections
			.observableArrayList("C","Python");
	String[] input;
	
	//Language Choose 
	
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
	
	//Text Field
	
	@FXML
	private TextArea text1;
	@FXML
	private TextArea text2;
	
	//Methods
	public void setCode(String output) {
		text2.setText(null);
		text2.setText(output);
	}
	public void syntaxError() {
		text2.setText(null);
		text2.setText("There are systax errors with the input! \n "
				+ "Please check whether the source language you selected is right.");
	}
	public void contextualError() {
		text2.setText(null);
		text2.setText("There are contextual errors with the input!");
	}
	//Action
	
	@FXML
	private void initialize() {
	box1.setValue("C");
	box2.setValue("Python");
	box1.setItems(box_content);
	box2.setItems(box_content);
	}
	@FXML
	private void goButton() {
		if(box1.getValue().equals("C")) {
			CRun.main(text1.getText(),this);
		}
		else if(box1.getValue().equals("Python")) {
			pythonRun.main(text1.getText(),this);
		}
	}
	@FXML
	private void goClear() {
		text1.setText(null);
		text2.setText(null);
	}
	@FXML
	private void box1() {
		if(box1.getValue().equals("C")) {
			box2.setValue("Python");
		}
		else if(box1.getValue().equals("Python")) {
			box2.setValue("C");
		}
	}
	@FXML
	private void box2() {
		if(box2.getValue().equals("C")) {
			box1.setValue("Python");
		}
		else if(box2.getValue().equals("Python")) {
			box1.setValue("C");
		}
	}
	@FXML
	private void arrowClick() {
		String left = box1.getValue();
		String right = box2.getValue();
		box1.setValue(right);
		box2.setValue(left);
	}
}
