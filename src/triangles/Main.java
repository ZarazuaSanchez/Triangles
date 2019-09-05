package triangles;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Create a triangle with sides a, b, and c.\nAny two sides added together must be greater than the third");
		
		boolean doloop = true;
		while(doloop) {
			System.out.println("Enter a: ");
			float a = scanner.nextFloat();
			
			System.out.println("\nEnter b: ");
			float b = scanner.nextFloat();
			
			System.out.println("\nEnter c: ");
			float c = scanner.nextFloat();
			
			if ( triIneq(a, b, c) && a > 0 && b > 0 && c > 0 ) {
				Triangle tri = new Triangle(a, b, c);
				tri.whichTypeTri();
				
			} else {
				System.out.println("The sides entered do not make a triangle.");
			}
			
			System.out.println("Try making another one (y/n)?");
			String ans = scanner.next();
			
			if( !ans.equals("y")) {
				doloop = false;
			}

		}
		
		scanner.close();
		System.out.println("\nGood-bye!");
	}
		
		
	public static boolean triIneq(float a, float b, float c){
			
			if (a + b >= c)
				if(a + c >= b)
					if(b + c >= a)
						return true;
			
			return false;
	}		
		
		
		

}
