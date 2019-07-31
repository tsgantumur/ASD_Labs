package lab8.state;

public interface IState 
{
	public int turnLeft();
	public int doAccelerate();
	public int turnRight();
	public int doBrake();
	public String toString();
}
