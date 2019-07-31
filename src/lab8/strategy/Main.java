package lab8.strategy;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Flight> flights = new ArrayList<>();

		Flight flight1 = new Flight(60);
		Flight flight2 = new Flight(120);
		Flight flight3 = new Flight(150);

		flights.add(flight1);
		flights.add(flight2);
		flights.add(flight3);
		

		
		Model singlePriceModel = new SinglePrice();
		Model twoClassesModel = new TwoClasses();
		Model multiClassModel = new MultiClass();
		
		Context context = new Context();
		
		context.setModel(singlePriceModel);
		context.calculateRevenue(flights);
		
		context.setModel(twoClassesModel);
		context.calculateRevenue(flights);
		
		context.setModel(multiClassModel);
		context.calculateRevenue(flights);
		
	}

}
