package common;

import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

//중복된 코드들은 공통파일로 관리하는 것이 훨씬 편리하다 
public interface CommonService {
	public static void myAlert( String msg ) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setContentText(msg);
		alert.show();
		
	}
	public static void cancleFunc(Parent root) {
		Stage stage = (Stage)root.getScene().getWindow();
		 stage.close();
		
	}
}
//일반적인 메소드는 가능하다.