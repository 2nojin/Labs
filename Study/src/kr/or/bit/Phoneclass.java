package kr.or.bit;


import java.util.Scanner;

public class Phoneclass {
	public int vol;

	public void vol_up() {
		vol++;
	}

	public void vol_douw() {
		vol--;
	}

	public void phoneNum(int num1, int num2, int num3) {

		System.out.println("������������");

	}

	
		public void lock(int i) {
			int input = 0;
			int count = 0;
			do {
				if (count == 5) {
					System.out.println("��й�ȣ�� 5ȸ Ʋ�Ƚ��ϴ�.");
					break;
				}
				System.out.println("��ȣ�� �Է��ϼ���(4�ڸ�) : ");
				Scanner sc = new Scanner(System.in);
				input = Integer.parseInt(sc.nextLine());
				if (input != i) {
					System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				}
				count += 1;
			} while (i != input);
			if (i == input) {
				System.out.println("�������");
			}
		}

		public int money(int a) {
			int sum = a * 100;
		
			return sum;
			
		}

		public void camera() {
			System.out.println("������ ����Ǿ����ϴ�");
		}

	}
