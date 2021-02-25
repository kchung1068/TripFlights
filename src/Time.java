public class Time {
	
	/** @return difference, in minutes, between this time and other;
	 *		difference is negative if other is earlier than this time
	 */
	public int minutesUntil(Time other)
	{
		return 60*(other.getHour()-hr) + other.getMin()-min;
	}
	
	//There may be instance variables, constructors and 
	//methods that are not shown.
	private int hr;
	private int min;

	/**
	 * Constructor for objects of class Time
	 */
	public Time()
	{
		hr = 0;
		min=0;
	}
	public Time (int h, int m)
	{
		hr=h;
		min=m;
	}
	public int getHour()
	{
		return hr;
	}
	public int getMin()
	{
		return min;
	}
}
