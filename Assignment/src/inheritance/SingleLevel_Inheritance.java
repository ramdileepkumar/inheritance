package inheritance;

public class SingleLevel_Inheritance {

	public static void main(String[] args) {
	Iphone ip= new Iphone();
	ip.call();
	ip.siri();

	}
}
	
	class Mobile{
		void call() {
			System.out.println("it is used for calling");
		}
	}
		class Iphone extends Mobile{
			void siri() {
				System.out.println(" iphone voice assistance");
			}
		}
		
		
		
		
		
	
	
	
	
	


