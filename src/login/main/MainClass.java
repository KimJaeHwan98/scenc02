package login.main;

import java.net.URL;
import java.nio.file.Paths;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import login.controller.Controller;
import login.url.URLService;

public class MainClass extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		System.out.println(getClass().getResource("")); //현재 위치정보
		System.out.println(Paths.get("").toAbsolutePath().toString());//D:\핀테크\workspace-java\scene02
		System.out.println("file:/"+(Paths.get("").toAbsolutePath().toString()) );//D:\핀테크\workspace-java\scene02
		System.out.println("file:/"+(Paths.get("").toAbsolutePath().toString())+"/bin/login/fxml/Login.fxml" );
		//여기까지입력해줘야한다.
		//현재 프로젝트에 정보를 알아본다 현재위치이 정보를 문자열로 가지고와라
		//패키지명과 파일명도 붙여줘야한다 앞쪽에는 파일도 붙여줘야한다
		
		//"file:/"+(Paths.get("").toAbsolutePath().toString())+"/bin/login/
		
		URL url = new URL(URLService.fxPath + "login/fxml/Login.fxml");
	
		FXMLLoader loader =new FXMLLoader(url);
		//경로 복사해서 그대로 로더에 넣어준다.
		//에러가 발생한다 이유는 url로 변경해줘야한다.
		
		Parent root = loader.load();
		
		Controller ctr1 = loader.getController(); // 로그인.컨트롤러껄로 불러온다
		//연결이 이루어져있는 컨트롤러만 값을 이렇게 설정해줘야한다 뉴로 생성하면 안된다.
		//로더를 이용해서 꺼내와야지만 객체이용가능하다.
		ctr1.setRoot(root); // 루트를 받아오겠다. / 모든값을 가지고있는 객체
		
		Scene scene = new Scene(root);
		arg0.setScene(scene);
		arg0.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}

//로드가 될때 컨트롤러가 실행된다 
