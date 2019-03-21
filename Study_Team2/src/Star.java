import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int i=sc.nextInt();
		
		String [][] array = new String[i][i];
		
		for(i=0; i<array.length; i++) {
			System.out.println();
			for(int j=0; j<array.length; j++) {
				array[i][j]="*";
				System.out.print(array[i][j]);
			}
		
	}

	}
}
