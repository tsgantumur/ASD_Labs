package lab2.singleton;

public class Singleton {
	private static Singleton instance = null;
	public static Singleton instance2 = new Singleton();
	private int data = 0;
	
	private Singleton() {
		
		System.out.println(data);
	}
	
	public static Singleton getInstance() {
		if(instance == null)
		{
			instance = new Singleton();
			
		}		
		return instance;
	}
	
	public int getData() {
		return data++;
	}
}
