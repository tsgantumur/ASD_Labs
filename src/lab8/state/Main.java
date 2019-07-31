package lab8.state;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarControl carControl = new CarControl();
		carControl.turnLeft();
		carControl.doAccelerate();
		carControl.turnRight();
		carControl.doBrake();
		
		System.out.println(carControl.toString());
		
		carControl.setState(carControl.getGravelState());
		carControl.turnLeft();
		carControl.doAccelerate();
		carControl.turnRight();
		carControl.doBrake();
		
		System.out.println(carControl.toString());
		
		carControl.setState(carControl.getWetState());
		carControl.turnLeft();
		carControl.doAccelerate();
		carControl.turnRight();
		carControl.doBrake();
		
		System.out.println(carControl.toString());
		
		carControl.setState(carControl.getIceState());
		carControl.turnLeft();
		carControl.doAccelerate();
		carControl.turnRight();
		carControl.doBrake();
		
		System.out.println(carControl.toString());
		
		
		
	}

}
