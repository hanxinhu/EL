import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Start  extends Application {
    public void start(Stage primaryStage){
    	
    	
    	
    
    	VBox vboxButtons = new VBox();
    	Button btStart = new Button("��ʼ��Ϸ ");
    	Button btRule = new Button("��Ϸ���� ");
    	Button btDesigner = new Button("�������Ϣ");
        vboxButtons.getChildren().addAll(btStart,btRule,btDesigner);

    	StackPane pane = new StackPane(vboxButtons);
    	

    	
          Scene scene1 = new Scene(pane,900,900);
    	primaryStage.setScene(scene1);
    	primaryStage.setTitle("������");
      	primaryStage.show();
    }
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
        
		
		
        Application.launch(args);
	}


}
