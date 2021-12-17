package labproject.finalP;

public class Car extends Vehicle
{
	int doors;
	String driveTrain;
	
	public Car (String driveTrain, int doors, int seats, int topSpeed) 
	{
		super(seats, topSpeed);
		this.driveTrain = driveTrain;
		this.doors = doors;
	}
	public String toString() 
	{
		return "seats: " + seats + ", top Speed: " + topSpeed + ", drive train: " + driveTrain + ", doors: " + doors;
	}

}