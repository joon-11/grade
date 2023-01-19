package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class gradeController implements Initializable {
	@FXML Label lblAvg,lblSum;
	@FXML Button btnCal;
	@FXML TextField txtKor,txtName,txtMath;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}
	public void btnCalAction(ActionEvent event){
		int sum = Integer.parseInt(txtKor.getText())+Integer.parseInt(txtMath.getText());
		int avg = sum/2;
		
           
		lblSum.setText(Integer.toString(sum));
		lblAvg.setText(Integer.toString(avg));
		 
	}
}
