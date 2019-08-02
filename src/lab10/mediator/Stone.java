package lab10.mediator;

public abstract class Stone {
	protected ReversiMediator mediator;
	protected int row;
	protected int column;
	protected Color color;
	
	public Stone(ReversiMediator mediator, Color color) {
		// TODO Auto-generated constructor stub
		this.mediator = mediator;
		this.color = color;
	}

	public abstract void sendMessage(int row, int column);
	
	public abstract Color getColor();
	
	public abstract void receive(Color color);
	
	public abstract String getGrid();
	
}
