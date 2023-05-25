package may25;

public class TEST {
	
	public static void main(String[] args) {
		
		Toyota_VIOS Car = new Toyota_VIOS();
		
		System.out.println("Toyota-VIOS:");
		System.out.println("Speed: " + Car.ToyotaSpeed + " MPH");
		System.out.println("Color: " + Car.ToyotaColor);
		System.out.println("Price: " + Car.ToyotaPrice);
		System.out.println("Tire Type: " + Car.TireType);
		
		
		Car.Drive();
		Car.Stop();
		
		
		
		U2_SpyPlane Plane = new U2_SpyPlane();
		
		System.out.println("");
		System.out.println("U-2 Spy Plane:");
		System.out.println("Speed: " + Plane.PlaneSpeed + " KM/H");
		System.out.println("Color: " + Plane.PlaneColor);
		System.out.println("Price: " + Plane.PlanePrice);
		System.out.println("Wing Span: " + Plane.WingSpan + " Feet");
		
		
		Plane.Fly();
		Plane.Stop();
		
		
		FandangoYacht Yacht = new FandangoYacht();
		
		System.out.println("");
		System.out.println("Fandango Yacht:");
		System.out.println("Speed: " + Yacht.YachtSpeed + " MPH");
		System.out.println("Color: " + Yacht.YachtColor);
		System.out.println("Price: " + Yacht.YachtPrice);
		System.out.println("Main Sail Color: " + Yacht.MainSailColor);
		
		
		Yacht.Float();
		Yacht.Stop();
	}
	    
	    

}
