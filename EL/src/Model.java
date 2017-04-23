import java.util.ArrayList;

public class Model implements ModelInterface {
	int[][] array;
	static int KIND;
	ArrayList<Observer> observers = new ArrayList<Observer>();
    /*
     * 初始化数组，使其不会出现未移动便可以消除的情况。
     * @see ModelInterface#initilize()
     */
	@Override
	public void initilize() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
	 for(Observer o : observers){
		 o.update();
	  }
	}

	@Override
	public void registerObservers(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	@Override
	public void removeObservers(Observer o) {
		// TODO Auto-generated method stub
		int index = observers.indexOf(o);
		if(index >= 0)
			observers.remove(index);
	}


}
