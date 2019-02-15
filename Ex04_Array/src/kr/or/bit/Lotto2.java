/*package kr.or.bit;

import java.util.Random;
import java.util.Scanner;

// 설계도
// Lotto lotto = new Lotto();
// lotto.SelectLottoNumber(); >> 메뉴 제공
// 1번 입력 >> selectBasicNumber() 함수 호출(실번호 추출)
// 2번 입력 >> 화면에 출력
// 3번 입력 >> 프로그램 종료
public class Lotto {

	private Scanner scanner;
	private Random r; // r.nextInt(45)+1 >> 1 ~ 45
	private int[] numbers;

	// static{ }, { }초기자
	public Lotto() { // 특수한 목적 : member field 초기화 : (생성자 함수), constructor
		scanner = new Scanner(System.in); // 초기화(참조 변수 주소값을 갖는것)
		r = new Random();
		numbers = new int[6];
	}

	// 기능을 구현해보세요(함수)
	// 함수 하나당 기능 하나
	public void displayMenu() {
		System.out.println("로또프로그램");
		System.out.println("1.로또번호 추출하기");
		System.out.println("2.프로그램 종료");
		System.out.println("번호를 입력하세요 : ");
		String num = scanner.nextLine();
		return num;
	}
	
	public void selectLottoNumber() {
		
		
		here: while (true) {
			String num = displayMenu(scanner);
			switch (num) {
			case "1":
				do {
				selectBasicNumber();
				}while(!checkAverage(numbers));
				print();
				break here;

			case "2":
				System.out.println("프로그램 종료");
				System.exit(0);

			
			default:
				System.out.println("번호가 맞지 않습니다.");
				break;

			}
		}
	}

	

	private void selectBasicNumber() {
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = r.nextInt(45) + 1;

		}
		System.out.println("번호가 추출되었습니다.");

	}

	public void print() {
		for (int i = 0; i < numbers.length; i++)
			System.out.print(numbers[i] + " ");

	}

	//검증(기능 함수) (6개의 합을 구해서 6으로 나눈 평균의 범위가 5보다 크거나 같고
	//10보다 작거나 같으면 번호 추출
	//(avg>=5 && avg<=10) ...이 범위가 아니면 재추출
	private boolean checkAverage(int[] numbers) {
		int sum=0;
		int average=0;
		for(int i=0; i<numbers.length; i++) {
			sum+=numbers[i];
		}
		average=sum/numbers.length;
		return(average>=6 && average<=10);	//5,6,7,8,9,10 >> true
	}
}
*/