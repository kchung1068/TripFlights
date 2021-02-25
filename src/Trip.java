import java.util.*;

public class Trip
{

	private ArrayList<Flight> flights;	//stores the flights (if any) in chronological order
	
	/** @return the number of minutes from the departure of the first flight to the arrival
	* of the last flight if there are one or more flights in the trip;
	* 0, if there are no flights in the trip
	*/
	public int getDuration() {
		if (flights.size() == 1) {
			return flights.get(0).getDepartureTime().minutesUntil(flights.get(0).getArrivalTime());
		} else if(flights.size() > 1){
			return flights.get(0).getDepartureTime().minutesUntil(flights.get(flights.size() - 1).getArrivalTime());
		} else	{
        	return 0;
		}
	} 
	
	/** Precondition: the departure time for each flight is later than the arrival time of its
	* preceding flight
	* @return the smallest number of minutes between the arrival of a flight and the departure
	* of the flight immediately after it, if there are two or more flights in the trip;
	* -1, if there are fewer than two flights in the trip
	*/
	public int getShortestLayover()
	{
		int interval = getDuration();
		if (flights.size() >= 2) {
			for (int x = 0; x < flights.size() - 1; x += 1) {
				if ((flights.get(x).getArrivalTime().minutesUntil(flights.get(x+1).getDepartureTime()) ) < interval) {
					interval = flights.get(x).getArrivalTime().minutesUntil(flights.get(x+1).getDepartureTime());
				}
			}
			return interval;
		} else {
			return -1;
		}
		
		//Your Code Here
	}
	
	//There may be instance variables, constructors, and 
	//methods that are not shown
	/**
	 * Constructor for objects of class Trip
	 */
	public Trip()
	{
		flights = new ArrayList<Flight>();

		Flight flight0 = new Flight(new Time(11,30), new Time(12,15));
		Flight flight1 = new Flight(new Time(13,15), new Time(15,45));
		Flight flight2 = new Flight(new Time(16,0), new Time(18,45));
		Flight flight3 = new Flight(new Time(22,15), new Time(23,00));

		flights.add(flight0);
		flights.add(flight1);
		flights.add(flight2);
		flights.add(flight3);
	}
}
