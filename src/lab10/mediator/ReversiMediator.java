package lab10.mediator;

public interface ReversiMediator {
	public void sendMessage(Stone stone);
	public void addStone(Stone stone);
	
	public void display();
}
