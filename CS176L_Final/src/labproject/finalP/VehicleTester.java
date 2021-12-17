package labproject.finalP;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

public class VehicleTester 
{

	public static void main(String[] args) throws FileNotFoundException 
	{
		ArrayList<Vehicle> arrayVeh = new ArrayList<>();
		ArrayList<Truck> arrTruck = new ArrayList<Truck>();
		
		PrintWriter txt = new PrintWriter("C:\\Users\\conno\\eclipse-workspace\\CS176L_Final\\Output.txt");
		txt.println("======================================================================");
		
		Car car1 = new Car("4WD", 4, 5, 120);
		Car car2 = new Car("FWD", 2, 4, 90);
		Car car3 = new Car("RWD", 2, 4, 180);
		
		Truck truck1 = new Truck(5000, 1000, 5, 100);
		Truck truck2 = new Truck(4000, 1500, 5, 95);
		Truck truck3 = new Truck(6000, 2000, 5, 120);
		
		Motorcycle motor1 = new Motorcycle(false, 1,220);
		Motorcycle motor2 = new Motorcycle(true, 2,130);

		arrayVeh.add(car1);
		arrayVeh.add(car2);
		arrayVeh.add(car3);
		arrayVeh.add(truck1);
		arrayVeh.add(truck2);
		arrayVeh.add(truck3);
		arrayVeh.add(motor1);
		arrayVeh.add(motor2);
		
		arrTruck.add(truck1);
		arrTruck.add(truck2);
		arrTruck.add(truck3);
		
		
		for (int a = 0; a < arrayVeh.size();a++)
		{
			txt.println(arrayVeh.get(a));
		}
		txt.println("======================================================================");
		
		Collections.sort(arrayVeh);
		
		for (int a = 0; a < arrayVeh.size(); a++)
		{
			txt.println(arrayVeh.get(a));
		}
		txt.println("======================================================================");
		
		for (int a = 0; a < arrTruck.size(); a++)
		{
			txt.println(arrTruck.get(a));
		}
		txt.println("======================================================================");
		
		Collections.sort(arrTruck, new CompareByPayload());
		
		for (int a = 0; a < arrTruck.size(); a++)
		{
			txt.println(arrTruck.get(a));
		}
		txt.println("======================================================================");
		
		Collections.sort(arrTruck, new CompareByTow());
		
		for (int a = 0; a < arrTruck.size(); a++)
		{
			txt.println(arrTruck.get(a));
		}
		txt.println("======================================================================");
		txt.close();
		
	}

}