package lab9.decorator2;

public class HorizontalScrollBarDecorator extends WindowDecorator
{

	public HorizontalScrollBarDecorator(GUIContainer windowToBeDecorated) {
		super(windowToBeDecorated);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	 public void paint() {
		 super.paint();
		 paintHorizontalScrollBar();
	 }
	
	 private void paintHorizontalScrollBar() {
	 // implementation
	 }
	 
	 @Override
	 public String getDescription() {
		 return super.getDescription() + ", adding horizontal scrollbar";
	 }


}
