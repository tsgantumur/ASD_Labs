package lab3.iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NameRepository nr = new NameRepository();
		Iterator i = nr.getIterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
