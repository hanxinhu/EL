
public class Controller implements ControllerInterface {
	ModelInterface model;
	View view;
	public Controller(ModelInterface model){
		this.model=model;
		view = new View(this,model);
		view.creatView();
		view.creatControls();
		model.initilize();
		
	}
	public void moveRight(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveLeft(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveUp(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveDown(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void upset() {
		// TODO Auto-generated method stub
		
	}

}
