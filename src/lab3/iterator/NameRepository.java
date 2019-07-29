package lab3.iterator;

public class NameRepository implements Aggregate {
	private String names[][] = {{"-","Rob"}, {"-","Jon"}, {"-","-"}, {"-","-"}, {"-","Pat"}, {"-","Ken"}};

	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new NameIterator();
	}

	private class NameIterator implements Iterator {

		int index;
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			if(index < names.length)
				return true;
			
			return false;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			if(this.hasNext())
			{
				int idx = index++;
				return "Firstname: " + names[idx][0] + " Lastname: " + names[idx][1];
			}
			
			return null;
		}
	
	}
}
