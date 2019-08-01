package lab9.decorator2;

public abstract class WindowDecorator implements GUIContainer {
	protected GUIContainer windowToBeDecorated;
	
	public WindowDecorator(GUIContainer windowToBeDecorated) {
		// TODO Auto-generated constructor stub
		this.windowToBeDecorated = windowToBeDecorated;
	}
	
	@Override
	public void paint() {
		// TODO Auto-generated method stub
		windowToBeDecorated.paint();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return windowToBeDecorated.getDescription();
	}

}
