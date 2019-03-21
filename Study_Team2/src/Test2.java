import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

//100점 a등급 80점이상 100미만이면 b등급 80점 미만 60점이상 이면 c등급이되는 if문 switch문을 작성하세요

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요 : ");
		int score=sc.nextInt();
		
		String hak="";
		if(score==100 ) {
			hak ="A";
		} else if(score>=80 && score<100 ) {
			hak ="B";
			}
			else if(score>=60 && score<80 ) {
			hak ="C";
			}
		switch (hak) {
		case "A":
			System.out.println("A학점");
			break;
		case "B":
			System.out.println("B학점");
			break;
		case "C":
			System.out.println("C학점");
		default:
			System.out.println("F학점");
			break;
		}
		}
		
		
			
	
}
