package member.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import member.service.MemberService;
import member.service.MemberServiceImpl;

public class MemberController implements Initializable {
@FXML public ComboBox<String> cmbAge;
@FXML public TextField fxName , fxId;
@FXML public PasswordField fxPwd,fxPwdChk;
@FXML public CheckBox chkMusic, chkMovie,chkMung;
@FXML public RadioButton rdoWoman;

Parent root;
MemberService ms;
public void setRoot(Parent root) {
	ms.setRoot(root);
	this.root = root;
}
public MemberController() {
	System.out.println("생성자 초기화----"+cmbAge);
}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	System.out.println("초기화실행"+cmbAge);
		ms = new MemberServiceImpl();
	
	String[] cmbTxt = {"20대 미만","20대","30대","40대","50대이상"};
	cmbAge.getItems().addAll(cmbTxt);
//		String[] cmVal = {"1","2","3","4","5"};
//		ObservableList<String> list = 
//				FXCollections.observableArrayList( cmbVal );
	//	cmbAge.setItems(list);
		
		//cmbAge.setItems(null);
		
	}
	public void registerFunc() {
		
		ms.registerFunc();
		
		
		
	}
	public void cancelFunc() {
		ms.cancelFunc();
	}
		
}
//
