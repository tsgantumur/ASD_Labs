package lab3.adapter;

public class Client {
	
	
	public static void main(String[] args)
	{
		
		StackAdaptee stack = new StackAdaptee(10);
		
		QueueAdaptee queue = new QueueAdaptee(10);
		
		Adapter stackAdapter = new Adapter(stack);
		Adapter queueAdapter = new Adapter(queue);
		
		stackAdapter.push("a");
		stackAdapter.push("b");
		stackAdapter.push("c");
		stackAdapter.push("d");
		stackAdapter.push("e");
		stackAdapter.pop();
		
		stackAdapter.print();
		System.out.println();
		
		queueAdapter.push("1");
		queueAdapter.push("2");
		queueAdapter.push("3");
		queueAdapter.push("4");
		queueAdapter.push("5");
		queueAdapter.pop();
		
		queueAdapter.print();
	}
}
