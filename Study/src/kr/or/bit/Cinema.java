package kr.or.bit;

import java.util.Scanner;

public class Cinema {

	Scanner sc = new Scanner(System.in);
	int column, row;
	private String[][] seat = new String[10][15];
	
	
	
	
	
	public void displayMenu() {
here:	while(true) {
		System.out.println("��ȭ�� ���� ���α׷�");
		System.out.println("1.�����ϱ�");
		System.out.println("2.�����ϱ�");
		System.out.println("��ȣ�� �Է��ϼ��� : ");

		String num = sc.nextLine();
		switch(num) {
		case "1":
		booking(num);
		break;
		
		case "2":
			end(num);
			break here;
			
		default:
			System.out.println("��ȣ�� �ٽ� �Է��ϼ���");
				break;
		}
	}
	
	}
	
	public String[][] booking(String num) {
		System.out.println("**********************************");
		System.out.println("���� �¼� ��Ȳ");
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
			System.out.println("���� �Է��ϼ���(1~10)");
			column = sc.nextInt();
						
			System.out.println("���� �Է��ϼ���(1~15)");
			row = sc.nextInt();
			
			if(row>=16 || row<=0||column>=11 || column<=0) {
				System.out.println("�������� �ʴ� �¼��Դϴ�. �ٽ� �Է��ϼ���");
				continue ;
			}
			switch (seat[column - 1][row - 1]) {
			case "X\t":
				System.out.println();
				System.out.println("�̹� ���� �� �¼��Դϴ�");
				break;
			default:
				seat[column - 1][row - 1] = "X\t";
				System.out.println("������ �Ϸ� �Ǿ����ϴ�.");
				break;
			}
			System.out.println();
			System.out.println("**********************************");
			System.out.println("���� �¼� ��Ȳ");
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
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}

}