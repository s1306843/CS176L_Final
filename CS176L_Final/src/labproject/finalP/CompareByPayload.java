package labproject.finalP;

import java.util.Comparator;

public class CompareByPayload implements Comparator<Truck>
{

	public int compare(Truck x, Truck y)
	{
		if(x.getPayloadCapacty() > y.getPayloadCapacty())
		{
			return 1;
		}
		if(x.getPayloadCapacty() < y.getPayloadCapacty())
		{
			return -1;
		}
		else 
		{
			return 0;
		}

	}

}