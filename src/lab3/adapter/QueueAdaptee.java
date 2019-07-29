package lab3.adapter;

public class QueueAdaptee 
{
	private String[] data;
	private int size = 0;
	private int head = 0;
	private int tail = 0;
	
	public QueueAdaptee(int capacity)
	{
		this.data = new String[capacity];
	}
	
	public boolean isEmpty()
	{
		return size == 0;
	}
	
	public boolean isFull()
	{
		return size >= data.length;
	}
	
	public void enqueue(String str)
	{
		data[tail] = str;
		tail = (tail + 1) % data.length;
		size++;
	}
	
	public String dequeue()
	{
		String s = data[head];
		data[head] = null;
		head = (head + 1) % data.length;
		size--;
		return s;
	}
	
	public String get(int pos)
	{
		return data[pos];
	}
	
	public int getTail()
	{
		return tail;
	}
	
	public void print()
	{
		for(String str : data)
		{
			System.out.print(str + ",");
		}
	}


}
