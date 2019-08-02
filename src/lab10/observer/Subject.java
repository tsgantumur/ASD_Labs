package lab10.observer;

public interface Subject {
	public void add(Person person);
	public void remove(String person);
	
	public String displayPeople();
	
}
