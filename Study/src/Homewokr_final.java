
import java.util.*;
public class Homewokr_final {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("몇줄로 할까요? : ");
		int num = sc.nextInt();
		
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("-------------------------");
		
		
		for(int i=num; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("-------------------------");
		
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=num-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("-------------------------");
		
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i-1; j++) {
				System.out.print(" ");
			}
			for(int k=num; k>=i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("-------------------------");
		
	}

}
