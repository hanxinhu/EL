
public interface ControllerInterface {
	/**
	 * ĳ���ķ�����ͼ���ҽ���<br/>
	 * @param ������x,y
	 */
	public void moveRight(int x,int y);
	/**
	 * ĳ���ķ�����ͼ���󽻻�
	 */
	public void moveLeft(int x, int y);
	/**
	 * ĳ���ķ������󽻻�
	 */
	public void moveUp(int x,int y);
	/**
	 * ĳ���ķ�����ͼ���½��� 
	 */
	public void moveDown(int x,int y);
	/**
	 * ����⵽�޷�����ʱ�����ø÷���
	 */
	public void upset();
}
