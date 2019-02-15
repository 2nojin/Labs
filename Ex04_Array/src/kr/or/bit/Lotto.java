package kr.or.bit;

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
		selectLottoNumber(num);
		
	}
	
	public void selectLottoNumber(String num) {
		//�޴�����
		//num = displayMenu();
		here: while (true) {
			switch (num) {
			case "1":
				
				selectBasicNumber();
				print();
				displayMenu();
				
				break here;
			 0

			case "2":
				System.out.println("���α׷� ����");
				break here;

			
			default:
				System.out.println("��ȣ�� ���� �ʽ��ϴ�.");
				break here;

			}
		}
	}

	

	private void selectBasicNumber() {
		for (int i=0; i<numbers.length; i++) {
			numbers[i] = (int)((Math.random()*45)+1);
			for(int j=0; j<i; j++) 
				if(numbers[i]==numbers[j]) {
					i--;
					break;
				}
		}
		for(int i=0; i<numbers.length; i++) {
			for(int j=i+1; j<numbers.length; j++) {
				if(numbers[i]>numbers[j]) {
					int temp=numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=temp;
				}
			}
		}
		System.out.println("��ȣ�� ����Ǿ����ϴ�.");

	}

	public void print() {
		for (int i = 0; i < numbers.length; i++)
			System.out.print(numbers[i] + " ");
		System.out.println();

	}

	private boolean maxMin() {
		int max = numbers[numbers.length - 1];
		int min = numbers[0];

		return (max >= 40 && min <= 10); // 5, 6, 7, 8, 9, 10 �� ��쿡�� true ����

	}

	
	/*//����(��� �Լ�) (6���� ���� ���ؼ� 6���� ���� ����� ������ 5���� ũ�ų� ����
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
	}*/
	
}
