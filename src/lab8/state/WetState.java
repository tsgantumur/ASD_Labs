package lab8.state;

public class WetState implements IState {

	@Override
	public int turnLeft() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public int doAccelerate() {
		// TODO Auto-generated method stub
		return 9;
	}

	@Override
	public int turnRight() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public int doBrake() {
		// TODO Auto-generated method stub
		return 7;
	}
	
	@Override
	public String toString()
	{
		return "WetState";
	}


}
