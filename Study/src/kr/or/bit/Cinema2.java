package kr.or.bit;

import java.util.Scanner;

public class Cinema2 {

	Scanner sc = new Scanner(System.in);
	int column, row;
	private String[][] seat = new String[10][15];
	private String[] A = new String[] {"A","B","C","D","E","F","G","H","I","J"};
	
	
	
	
	public void showSeat() {
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
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i]  + "\t");
			for (int j = 0; j < seat[0].length; j++) {
				System.out.print(seat[i][j]);
			}
			System.out.println();

		}
		int k;
		while (true) {
			System.out.println();
			System.out.println("���� �Է��ϼ���(A~J)");
		      char c = sc.next().charAt(0);

		      k = ((int) c) - 65;
			System.out.println("���� �Է��ϼ���(1~15)");
			row = sc.nextInt();
			
			if(row>16 || row<0||k>11 || k<0) {
				System.out.println("�������� �ʴ� �¼��Դϴ�. �ٽ� �Է��ϼ���");
				continue ;
			}
			switch (seat[k][row - 1]) {
			case "X\t":
				System.out.println();
				System.out.println("�̹� ���� �� �¼��Դϴ�");
				break;
			default:
				seat[k][row - 1] = "X\t";
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
			for (int i = 0; i < A.length; i++) {
				System.out.print(A[i]  + "\t");
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