/*package kr.or.bit;

import java.util.Random;
import java.util.Scanner;

// ���赵
// Lotto lotto = new Lotto();
// lotto.SelectLottoNumber(); >> �޴� ����
// 1�� �Է� >> selectBasicNumber() �Լ� ȣ��(�ǹ�ȣ ����)
// 2�� �Է� >> ȭ�鿡 ���
// 3�� �Է� >> ���α׷� ����
public class Lotto {

	private Scanner scanner;
	private Random r; // r.nextInt(45)+1 >> 1 ~ 45
	private int[] numbers;

	// static{ }, { }�ʱ���
	public Lotto() { // Ư���� ���� : member field �ʱ�ȭ : (������ �Լ�), constructor
		scanner = new Scanner(System.in); // �ʱ�ȭ(���� ���� �ּҰ��� ���°�)
		r = new Random();
		numbers = new int[6];
	}

	// ����� �����غ�����(�Լ�)
	// �Լ� �ϳ��� ��� �ϳ�
	public void displayMenu() {
		System.out.println("�ζ����α׷�");
		System.out.println("1.�ζǹ�ȣ �����ϱ�");
		System.out.println("2.���α׷� ����");
		System.out.println("��ȣ�� �Է��ϼ��� : ");
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
				System.out.println("���α׷� ����");
				System.exit(0);

			
			default:
				System.out.println("��ȣ�� ���� �ʽ��ϴ�.");
				break;

			}
		}
	}

	

	private void selectBasicNumber() {
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = r.nextInt(45) + 1;

		}
		System.out.println("��ȣ�� ����Ǿ����ϴ�.");

	}

	public void print() {
		for (int i = 0; i < numbers.length; i++)
			System.out.print(numbers[i] + " ");

	}

	//����(��� �Լ�) (6���� ���� ���ؼ� 6���� ���� ����� ������ 5���� ũ�ų� ����
	//10���� �۰ų� ������ ��ȣ ����
	//(avg>=5 && avg<=10) ...�� ������ �ƴϸ� ������
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