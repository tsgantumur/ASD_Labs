package lab10.mediator;

import java.util.ArrayList;
import java.util.List;

public class ReversiMediatorImpl implements ReversiMediator {
	private List<Stone> stones;
	
	public ReversiMediatorImpl()
	{
		this.stones = new ArrayList<>();
	}

	@Override
	public void sendMessage(Stone stone) {
		// TODO Auto-generated method stub
		for(Stone s : stones)
		{
			if(s != stone)
			{
				s.receive(stone.getColor());
			}
		}
	}

	@Override
	public void addStone(Stone stone) {
		// TODO Auto-generated method stub
		this.stones.add(stone);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		stones.stream().forEach(s -> System.out.println("Stone " + s.getGrid() + " Color: " + s.getColor()));
	}

}
