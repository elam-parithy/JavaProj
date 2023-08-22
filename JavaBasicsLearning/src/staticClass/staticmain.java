package staticClass;

public class staticmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1 = new Vehicle();
		v1.noofwheels = 2;
		
		Vehicle.name = "honda";
		
		v1.show();
	}

}
