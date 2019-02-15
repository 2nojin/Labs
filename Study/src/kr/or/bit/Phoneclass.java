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

		System.out.println("따르르르르릉");

	}

	
		public void lock(int i) {
			int input = 0;
			int count = 0;
			do {
				if (count == 5) {
					System.out.println("비밀번호가 5회 틀렸습니다.");
					break;
				}
				System.out.println("암호를 입력하세요(4자리) : ");
				Scanner sc = new Scanner(System.in);
				input = Integer.parseInt(sc.nextLine());
				if (input != i) {
					System.out.println("비밀번호가 틀렸습니다.");
				}
				count += 1;
			} while (i != input);
			if (i == input) {
				System.out.println("잠금해제");
			}
		}

		public int money(int a) {
			int sum = a * 100;
		
			return sum;
			
		}

		public void camera() {
			System.out.println("사진이 저장되었습니다");
		}

	}
