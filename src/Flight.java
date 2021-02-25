public class Flight {
	/** @return time at which the flight departs
	*/
	public Time getDepartureTime()
	{
		return dep;
	}
	
	/** @return time at which the flight arrives
	*/
	public Time getArrivalTime()
	{
		return arr;
	}

	//There my be instance variables, constructors, and methods
	//that are not shown.
	private Time dep;
	private Time arr;

	/**
	 * Constructor for objects of class Flight
	 */
	public Flight()
	{
		// initialise instance variables
		dep=new Time();
		arr=new Time();
	}
	public Flight(Time d, Time a )
	{
		// initialise instance variables
		dep=d;
		arr=a;
	}
	
}
