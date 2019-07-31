package lab8.strategy;

import java.util.List;

public class SinglePrice implements Model {

	@Override
	public long getRevenue(List<Flight> flights) {
		// TODO Auto-generated method stub
		long total = 0;
		
		for(Flight f : flights)
		{
			total += (f.getPassengers() * price);
		}
		
		return total - cost;
	}

}
