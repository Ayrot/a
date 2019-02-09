package application;

import java.net.URL;
	import java.text.DateFormat;
	import java.text.SimpleDateFormat;
	import java.util.Date;
	import java.util.ResourceBundle;
	 
	import javafx.event.ActionEvent;
	import javafx.fxml.FXML;
	import javafx.fxml.Initializable;
	import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
	 
	public class MyController implements Initializable {
	 
	   @FXML
	   private Button MyButton;
	   
	   @FXML
	   private PasswordField MyPasswordField;
	   
	   @FXML
	   private TextField MyTextField;
	   
	   @FXML
	   private Label Myerror;
	   
	   private String passw = "123";
	   
	   private String log = "Ayrot";
	  
	   @Override
	   public void initialize(URL location, ResourceBundle resources) {
	 
	       // TODO (don't really need to do anything here).
	      
	   }
	 
	   // When user click on myButton
	   // this method will be called.
	  public void check() {
		   if (passw.contentEquals(MyPasswordField.getText()) ) {
			   if (log.contentEquals(MyTextField.getText())) {
				   Myerror.setTextFill(Color.GREEN);
				   Myerror.setText("Успешно");
			   }else
			   {				   
				   Myerror.setTextFill(Color.RED);
				   Myerror.setText("Ошибка: неверный логин");
			   }
				   
		   }else {				   
			   Myerror.setTextFill(Color.RED);
			   Myerror.setText("Ошибка: неверный пароль");
		   }
	  }
	  
	}
