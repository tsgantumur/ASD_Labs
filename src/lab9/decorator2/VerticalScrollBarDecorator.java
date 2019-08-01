package lab9.decorator2;

public class VerticalScrollBarDecorator extends WindowDecorator {

	public VerticalScrollBarDecorator(GUIContainer windowToBeDecorated) {
		super(windowToBeDecorated);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void paint() {
		super.paint();
		paintVerticalScrollBar();
	}
	
	private void paintVerticalScrollBar() {}
	
	@Override
	public String getDescription()
	{
		return super.getDescription() + ", adding vertical scrollbar";
	}
}
