package lab8.strategy;

import java.util.List;

public class MultiClass implements Model {

	@Override
	public long getRevenue(List<Flight> flights) {
		// TODO Auto-generated method stub
		long total = 0;
		
		for(Flight f : flights)
		{
			int fcp = f.getPassengers() / 10;
			long fcpTotal = fcp * (price * 4);
			int bcp = f.getPassengers() / 5;
			long bcpTotal = bcp * (long)(price*1.5f);
			int coaches = f.getPassengers() / 10 * 7;
			long coachesTotal = coaches * (long)(price*0.75f);
			long eachFlightTotal = fcpTotal + bcpTotal + coachesTotal;
			
			total += eachFlightTotal;
		}
		
		return total - (long)(cost * 1.2f);
	}

}
