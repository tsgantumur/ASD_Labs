package lab10.observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject {
	List<Person> people;
	
	private final Object MUTEX = new Object();
	
	public SubjectImpl() {
		// TODO Auto-generated constructor stub
		people = new ArrayList<Person>();
		
	}
	
	@Override
	public void add(Person person) {
		// TODO Auto-generated method stub
		synchronized(MUTEX) {
			if(!people.contains(person))
				people.add(person);
			
		}
	}

	@Override
	public void remove(String name) {
		// TODO Auto-generated method stub
		synchronized(MUTEX) {
			if(people.size() > 1)
			{
				for(Person person : people)
				{
					if(person.getName().equals(name))
					{
						people.remove(person);
						break;
					}
				}
			}
			else
			{
				if(people.get(0).getName().equals(name))
					people.remove(0);
			}
			
			System.out.println(people.size());
		}
	}

	@Override
	public String displayPeople() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		
		synchronized(MUTEX) {
			int n = people.size();
			for(int i = 0; i < n; i++)
			{
				Person person = people.get(i);

				sb.append("Name: " + person.getName() + "\n");
				System.out.println(sb.toString());
			}
			
			System.out.println(people.size());
		}
		
		return sb.toString();
	}

}
