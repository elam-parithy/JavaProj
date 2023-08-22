package staticClass;

public class Vehicle {

	int noofwheels;// instance variable - accessed only by instantiation of class name obj = new name();  obj.name
	static String name; 
	
	void show() {
		System.out.println(name + " " + noofwheels);
	}
	
	//static method
	/*
	 * static void show1() { System.out.println(name + " " + noofwheels); } // cannot use instance variable in
	 */
	
}
