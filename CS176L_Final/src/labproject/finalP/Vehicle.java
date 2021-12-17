package labproject.finalP;

public class Vehicle implements Comparable<Vehicle>
{
	 int topSpeed;
	 int seats;
	
	public Vehicle(int seats, int topSpeed)
	{
		this.seats = seats;
		this.topSpeed = topSpeed;
	}

	public int compareTo(Vehicle obj)
	{
		if(getTopSpeed() > obj.getTopSpeed())
		{
			return 1;
		}
		if(getTopSpeed() < obj.getTopSpeed())
		{
			return -1;
		}
		else {
			return 0;
		}


	}

	public int getTopSpeed() 
	{
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) 
	{
		this.topSpeed = topSpeed;
	}

	public int getSeats() 
	{
		return seats;
	}

	public void setSeats(int seats) 
	{
		this.seats = seats;
	}
	public String toString() 
	{
		return "top speed: " + topSpeed + "seats: " + seats;
	}
}