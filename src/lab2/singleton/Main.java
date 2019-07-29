package lab2.singleton;

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		for(int i = 0; i < 10; i++)
		{
			System.out.println(Singleton.getInstance().getData());
			System.out.println(Singleton.instance2.getData());
		}
		
		Singleton2.INSTANCE.show();
		
		Singleton3.getInstance().show();
	}

}
