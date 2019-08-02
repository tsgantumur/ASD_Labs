package lab10.mediator;

public class StoneImpl extends Stone {

	public StoneImpl(ReversiMediator mediator, Color color) {
		super(mediator, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sendMessage(int row, int column) {
		// TODO Auto-generated method stub
		mediator.sendMessage(this);
		this.row = row;
		this.column = column;
		
		System.out.println("Sending msg: " + " row: " + row + " column: " + column + " color: " + this.getColor());
	}

	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return color;
	}

	@Override
	public void receive(Color color) {
		// TODO Auto-generated method stub
		this.color = color;
		System.out.println("Receiving msg: " + " color: " + color.toString());
	}

	@Override
	public String getGrid() {
		// TODO Auto-generated method stub
		return Integer.toString(this.row) + " " + Integer.toString(this.column);
	}
	
	

}
