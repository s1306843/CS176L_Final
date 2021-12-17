package labproject.finalP;

import java.util.Comparator;

public class CompareByTow implements Comparator<Truck>
{
	
	public int compare(Truck x, Truck y)
	{
	
			
			if(x.getTowCapacity() > y.getTowCapacity())
			{
				return 1;
			}
			if(x.getTowCapacity() < y.getTowCapacity())
			{
				return -1;
			}
			else 
			{
				return 0;
			}
	
	}
}