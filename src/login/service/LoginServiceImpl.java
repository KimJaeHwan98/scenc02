package login.service;

import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import login.dao.LoginDAO;
import login.dto.LoginDTO;
import member.main.MemberMain;

public class LoginServiceImpl implements LoginService{

	@Override
	public void Loginfunc(TextField fxId ,TextField fxPwd) {
		System.out.println("---서비스 로그인 확인---");
		System.out.println("id : "+ fxId.getText() );
		 System.out.println("pwd :" + fxPwd.getText() );
		 LoginDTO dto = LoginDAO.db.get(fxId.getText());
		 System.out.println("dto : "+ dto);
		 String msg = null;
		
		 Alert alert1 = new Alert(AlertType.ERROR);
		 Alert alert = new Alert(AlertType.CONFIRMATION);
		 
		 if(dto != null) {
			if(dto.getPwd().equals(fxPwd.getText())) {
				msg =dto.getName() + "님 인증 성공";
				 alert.setContentText(msg); alert.show();
			}else {
				msg = "비밀번호 틀림!!!";
				alert1.setContentText(msg); alert1.show();
			}
			
		 }else {
			 msg = "존재하지 않는 아이디 입니다.";
			 alert1.setContentText(msg); alert1.show();
		 }
		 //alert.setContentText(msg); alert.show();
		 
		System.out.println(msg);
	}

	@Override
	public void cancelfunc(Parent root) {
		System.out.println("---- 서비스 창 닫기 ----");
		Stage stage = (Stage)root.getScene().getWindow();
		 stage.close();
		
	}

	@Override
	public void registerFunc() {
		System.out.println("서비스 쪽 회원가입 실행");
		MemberMain member = new MemberMain();
		//member.viewFx();
	}
	
	public void registerFunc(Parent root) {
		System.out.println("서비스 쪽 회원가입 실행");
		MemberMain member = new MemberMain();
		member.viewFx(root);
	}
}





