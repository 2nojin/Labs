package kr.or.bit;

import java.util.Scanner;

public class Cinema {

	Scanner sc = new Scanner(System.in);
	int column, row;
	private String[][] seat = new String[10][15];
	
	
	
	
	
	public void displayMenu() {
here:	while(true) {
		System.out.println("영화관 예약 프로그램");
		System.out.println("1.예약하기");
		System.out.println("2.종료하기");
		System.out.println("번호를 입력하세요 : ");

		String num = sc.nextLine();
		switch(num) {
		case "1":
		booking(num);
		break;
		
		case "2":
			end(num);
			break here;
			
		default:
			System.out.println("번호를 다시 입력하세요");
				break;
		}
	}
	
	}
	
	public String[][] booking(String num) {
		System.out.println("**********************************");
		System.out.println("현재 좌석 현황");
		System.out.println("**********************************");
		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[0].length; j++) {

				seat[i][j] = "O\t";
			}

		}
		for(int i = 1 ; i <= seat[0].length ; i ++) {
			System.out.print("\t"+i);
			
		}
		System.out.println();
		for (int i = 0; i < seat.length; i++) {
			System.out.print((i + 1) + "\t");
			for (int j = 0; j < seat[0].length; j++) {
				System.out.print(seat[i][j]);
			}
			System.out.println();

		}
		
		while (true) {
			System.out.println();
			System.out.println("행을 입력하세요(1~10)");
			column = sc.nextInt();
						
			System.out.println("열을 입력하세요(1~15)");
			row = sc.nextInt();
			
			if(row>=16 || row<=0||column>=11 || column<=0) {
				System.out.println("존재하지 않는 좌석입니다. 다시 입력하세요");
				continue ;
			}
			switch (seat[column - 1][row - 1]) {
			case "X\t":
				System.out.println();
				System.out.println("이미 예약 된 좌석입니다");
				break;
			default:
				seat[column - 1][row - 1] = "X\t";
				System.out.println("예약이 완료 되었습니다.");
				break;
			}
			System.out.println();
			System.out.println("**********************************");
			System.out.println("현재 좌석 현황");
			System.out.println("**********************************");
			for(int i = 1 ; i <= seat[0].length ; i ++) {
				System.out.print("\t"+i);
				
			}
			System.out.println();
			for (int i = 0; i < seat.length; i++) {
				System.out.print((i + 1) + "\t");
				for (int j = 0; j < seat[0].length; j++) {
					System.out.print(seat[i][j]);
				}
				System.out.println();

			}
			
		}
		
	
		
	}
	public void end(String num) {
		System.out.println("프로그램이 종료되었습니다.");
	}

}