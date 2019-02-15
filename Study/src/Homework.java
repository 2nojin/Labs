

public class Homework {

	public static void main(String[] args) {
			
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("-------------------------");
		
		
		for(int i=10; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("-------------------------");
		
		
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("-------------------------");
		
		
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=i-1; j++) {
				System.out.print(" ");
			}
			for(int k=10; k>=i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("-------------------------");
		
	}

}
