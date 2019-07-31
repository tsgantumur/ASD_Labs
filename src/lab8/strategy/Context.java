package lab8.strategy;

import java.util.List;

public class Context {
	private Model model;
	
	public void setModel(Model model)
	{
		this.model = model;
	}
	
	public void calculateRevenue(List<Flight> flights)
	{
		System.out.println("Total revenue: " + model.getRevenue(flights));
	}
}
