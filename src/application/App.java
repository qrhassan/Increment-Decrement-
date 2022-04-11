package application;

public class App {

	public static void main(String[] args) {
		
		int increment = 4;
		increment = increment + 1;
		System.out.println(increment);
		
		increment += 1;
		System.out.println(increment);
		
		increment ++; 
		System.out.println(increment);
		
		++increment;
		System.out.println(increment);

		int decrement  = 10;
		decrement = decrement - 1;
		System.out.println(decrement);
		
		decrement -=1;
		System.out.println(decrement);
		
		decrement--;
		System.out.println(decrement);
		
		--decrement;
		System.out.println(decrement);

	}

}
