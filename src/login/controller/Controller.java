package login.controller;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import login.dao.LoginDAO;
import login.dto.LoginDTO;
import login.service.LoginService;
import login.service.LoginServiceImpl;

public class Controller implements Initializable {
 public void Loginfunc() {
	ls.Loginfunc(fxId , fxPwd);
	 System.out.println("확인 버튼 클릭");
	 
 }
 
 public void cancelfunc() {
	 System.out.println("취소 버튼 클립");
	 System.out.println("root : "+ root);
	 ls.cancelfunc(root);
 }

 public void registerFunc() {
	 System.out.println("회원가입 클릭");
	// ls.registerFunc();
	 ls.registerFunc(root);
 }
 @FXML public TextField fxId;
 @FXML public TextField fxPwd;
 Parent root;
 LoginService ls;
 public void setRoot(Parent root) {
	  this.root = root;
 }
@Override
public void initialize(URL arg0, ResourceBundle arg1) {
	ls = new LoginServiceImpl();
	System.out.println("메소드 초기화");
	
	
}
}
// 메소드 생성
//연결시켜주는 코드