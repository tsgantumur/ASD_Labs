package lab11.visitor;

public class DisplayNodeVisitor implements NodeVisitor {
	private Root root;
	
	@Override
	public void visit(Root root) {
		// TODO Auto-generated method stub
		this.root = root;
		
		System.out.println(this.root.getName());
	}

	@Override
	public void visit(Node node) {
		// TODO Auto-generated method stub
		
		if(node.getSide() == Side.RIGHT)
		{
			
			System.out.println("Right nodes:");
			
			System.out.println(" " + node.getName() + " nodes");

		}
		else if(node.getSide() == Side.LEFT)
		{
			
			System.out.println("Left nodes:");
			
			System.out.println(" " + node.getName() + " nodes");

		}
		
		
		
	}

}
