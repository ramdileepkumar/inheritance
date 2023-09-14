package inheritance;

public class Multilevel_Inheritance {

	public static void main(String[] args) {
		Mercedes mers= new Mercedes();
		mers.safe();
		mers.model();
		mers.horn();
		mers.luxury();
		

	}

}
class Vehicle{
	void safe() {
		System.out.println("have a safe journey");
	}
}
class Car extends Vehicle{
	void horn() {
		System.out.println(" car has a horn");
	}
}
class Benz extends Car{
	void luxury() {
		System.out.println(" luxurious car");
	}
}
class Mercedes extends Benz{
	void model() {
		System.out.println("benz is the model");
	}
}