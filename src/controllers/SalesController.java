package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import main.Main;
	
public class SalesController implements Initializable {
	
	@FXML
	private void eventoOne(ActionEvent e) {
		System.out.println("Voltar Vendas para Menu");
		Main.scenes("backsales");
	}
	
	@FXML
    private Button btt1, btt2, btt3, btt4, btt5 , btt6;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		btt1.setCursor(Cursor.HAND);
		btt2.setCursor(Cursor.HAND);
		btt3.setCursor(Cursor.HAND);
		btt4.setCursor(Cursor.HAND);
		btt5.setCursor(Cursor.HAND);
		btt6.setCursor(Cursor.HAND);
	}
	
}