package lab11.visitor;

public interface NodeVisitor {
	
	public void visit(Root root);
	public void visit(Node node);
}
