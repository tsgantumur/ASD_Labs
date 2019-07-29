package lab3.adapter;

public class StackAdaptee {
	private String[] data;
	private int top = 0;
	
	public StackAdaptee(int capacity)
	{
		data = new String[capacity];
		
	}
	
	public boolean empty()
	{
		return top == -1;
	}
	
	public void add(String str)
	{
		data[top] = str;
		top++;
	}
	
	public String remove()
	{
		String s;
		top--;
		s = data[top];
		data[top] = null;
		
		return s;
	}
	
	public int size()
	{
		return top + 1;
	}
	
	public void print()
	{
		for(String str : data)
		{
			System.out.print(str + ",");
		}
	}

}
