package lab10.mediator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReversiMediator mediator = new ReversiMediatorImpl();
		
		Stone stone1 = new StoneImpl(mediator, Color.RED);
		stone1.sendMessage(1, 2);
		mediator.addStone(stone1);
		
		mediator.display();
		
		Stone stone2 = new StoneImpl(mediator, Color.BLUE);
		stone2.sendMessage(1, 3);
		mediator.addStone(stone2);
		
		mediator.display();
		
		Stone stone3 = new StoneImpl(mediator, Color.RED);
		stone3.sendMessage(2, 2);
		mediator.addStone(stone3);
		
		mediator.display();
		
		Stone stone4 = new StoneImpl(mediator, Color.BLUE);
		stone4.sendMessage(2, 5);
		mediator.addStone(stone4);
		
		mediator.display();
	}

}
