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
    	Button btStart = new Button("开始游戏 ");
    	Button btRule = new Button("游戏规则 ");
    	Button btDesigner = new Button("设计者信息");
        vboxButtons.getChildren().addAll(btStart,btRule,btDesigner);

    	StackPane pane = new StackPane(vboxButtons);
    	

    	
          Scene scene1 = new Scene(pane,900,900);
    	primaryStage.setScene(scene1);
    	primaryStage.setTitle("消消乐");
      	primaryStage.show();
    }
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
        
		
		
        Application.launch(args);
	}


}
