import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View implements Observer,ActionListener{
	ModelInterface model;
	ControllerInterface controller;
	public View(ControllerInterface controller,ModelInterface model){
		this.model = model;
		this.controller = controller;
		model.registerObservers(this);
	}
	/*
	 * �����ﴴ�����е�Swing���
	 */
	public void creatView(){
		
	}
	/*
	 * ������ʵ�����п��ơ�
	 */
	public void creatControls(){
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

}
