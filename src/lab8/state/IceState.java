package lab8.state;

public class IceState implements IState {

	@Override
	public int turnLeft() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int doAccelerate() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public int turnRight() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int doBrake() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public String toString()
	{
		return "IceState";
	}
}
