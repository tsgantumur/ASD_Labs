package lab8.strategy;

import java.util.List;

public class TwoClasses implements Model {

	@Override
	public long getRevenue(List<Flight> flights) {
		// TODO Auto-generated method stub
		long total = 0;

		for(Flight f : flights)
		{
			int businessClassPassengers = f.getPassengers()/3;
			long bcpTotal = (long) (businessClassPassengers * (price * 1.5f));
			int coaches = f.getPassengers()/3 * 2;
			long coachTotal = (long) (coaches * (price* 0.75f));
			long eachFlightTotal = bcpTotal + coachTotal;
			
			total += eachFlightTotal;
		}
		
		return total - (long)(cost * 1.1f);
	}

}
