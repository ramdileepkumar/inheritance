package inheritance;

public class Hierarchical_Inheritance {

	public static void main(String[] args) {
		Husky breed = new Husky();
		breed.eat();
		breed.blueeyes();
		//breed.size();
		//breed.bark();
		

	}

}
class Animal{
	void eat() {
		System.out.println("eating food");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("dog is barking");
	}
}
class sheizu extends Animal{
	void size() {
		System.out.println("sheizu is small size");
	}
}
class Husky extends Animal{
	void blueeyes() {
		System.out.println(" husky has blue eyes");
	}
}
