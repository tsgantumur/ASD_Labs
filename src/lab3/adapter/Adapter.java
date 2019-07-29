package lab3.adapter;

public class Adapter implements Target {
	private StackAdaptee stack;
	private QueueAdaptee queue;
	
	public Adapter(StackAdaptee stack)
	{
		this.stack = stack;
	}
	
	public Adapter(QueueAdaptee queue)
	{
		this.queue = queue;
	}

	@Override
	public void push(String str) {
		// TODO Auto-generated method stub
		if(stack != null)
		{
			stack.add(str);
		}else
		{
			queue.enqueue(str);
		}
	}

	@Override
	public String pop() {
		// TODO Auto-generated method stub
		if(stack != null)
		{
			
			return stack.remove();
		}
		else {
			return queue.dequeue();
		}
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(stack != null)
			return stack.empty();
		else
			return queue.isEmpty();
	}
	
	public void print()
	{
		if(stack != null)
		{
			stack.print();
		}
		else
		{
			queue.print();
		}
	}
	
}
