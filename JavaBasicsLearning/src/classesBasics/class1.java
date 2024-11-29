package classesBasics;

public class class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//car benz; Declaration
		
		//instantization
		car benz = new car(); //new keyword dynamically allocates memory 
		System.out.println(benz.engine);
		
		//benz.cost = 20000;
		System.out.println(benz.cost); 
		
	}
}

class car {
	
	//instance variables 
	public String engine;
	int cost;

	// TO Access properties use .dot operator
	
	car() {
		engine = "petrol";
		cost = 8000;
	}
	
}
