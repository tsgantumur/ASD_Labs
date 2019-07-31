package lab8.strategy;

import java.util.List;

public interface Model {
	public static final int price = 300;
	public static final int cost = 50000;
	public long getRevenue(List<Flight> flights);
}
