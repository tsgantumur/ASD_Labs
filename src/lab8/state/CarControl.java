package lab8.state;

public class CarControl {
	private IState regularState;
	private IState gravelState;
	private IState wetState;
	private IState iceState;
	
	private IState state; //current state
	
	private int left;
	private int accel;
	private int right;
	private int brake;
	
	public CarControl()
	{
		regularState = new RegularState();
		gravelState = new GravelState();
		wetState = new WetState();
		iceState = new IceState();
		
		state = regularState;
	}
	
	public void turnLeft()
	{
		left = state.turnLeft();
	}
	
	public void doAccelerate()
	{
		accel = state.doAccelerate();
	}
	
	public void turnRight()
	{
		right = state.turnRight();
	}
	
	public void doBrake()
	{
		brake = state.doBrake();
	}
	
	public IState getState()
	{
		return this.state;
	}
	
	public void setState(IState state)
	{
		this.state = state;
	}
	
	public IState getRegularState()
	{
		return this.regularState;
	}
	
	public IState getGravelState()
	{
		return this.gravelState;
	}
	
	public IState getWetState()
	{
		return this.wetState;
	}
	
	public IState getIceState()
	{
		return this.iceState;
	}
	
	
	public String toString()
	{
		return state.toString() + " " 
				+ " Left: " + left
				+ " Accel: " + accel
				+ " Right: " + right
				+ " Brake: " + brake;
	}
	
}
