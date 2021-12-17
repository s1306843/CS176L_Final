package labproject.finalP;

public class Motorcycle extends Vehicle
{
	
	boolean hasWindShield;
	
	public Motorcycle(boolean hasWindShield,int seats, int topSpeed) 
	{
		super(seats, topSpeed);
		this.hasWindShield = hasWindShield;
	}
	
	
	public boolean isHasWindShield() 
	{
		return hasWindShield;
	}
	public void setHasWindShield(boolean hasWindShield) 
	{
		this.hasWindShield = hasWindShield;
	}
	public String toString() 
	{
		return "seats: " + seats + ", top Speed: " + topSpeed + ", has wind shield: " + hasWindShield;
	}
	
}