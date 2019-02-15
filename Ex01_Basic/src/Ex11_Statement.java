import java.util.*;


//반복문(while, do~while)
public class Ex11_Statement {

	public static void main(String[] args) {
		/*while(true) {
			System.out.println(true);
		}*/
		
		int i = 10;
		while(i>=10) {	//조건이 true 일 때만
			System.out.println(i);
			//반드시 내부에서 명시적인 증가감을 처리해야함
			i--;
			
		}

		//1~100까지의 합
		int sum=0;
		int j=1;
		while(j<=100) {
			//j++; //주의!!!!!!!!! sum누적값 아래에 써야함	//5150
			sum+=j;
			j++;
		}
		System.out.println("1~100까지합 : " +sum);
		
		//while문으로 구구단
		int num=2;
		int num2=1;
		while(num<=9) {
			num2=1;	//p값을 1로 초기화
			while( num2<=9) {
				System.out.printf("%d * %d = %d\n", num,num2,num*num2);
				num2++;
			}
			System.out.println();
		num++;
			
		}
		
		//do~while() : 강제적 실행(무조건 한번 실행 그 이후 조건 판단)
		//do {실행문} while(조건식)
		//메뉴 구성
		//1. 인사
		//2. 급여
		//1번 입력하면 인사 ... 2번 입력하면 급여 .. 3번 입력 다시입력해 강제
		Scanner sc = new Scanner(System.in);
		int inputdata=0;
		
		do {
			
			System.out.println("숫자 입력해(0~10)");
			inputdata=Integer.parseInt(sc.nextLine());
			
		}while(inputdata>10);	//while true 계속 반복
		//while 문 탈출은 조건이 false 일때 while 탈출
		System.out.println("당신이 입력한 숫자는 : " +inputdata);
		
		
		
		
		
		
		
		
		
	}

}
