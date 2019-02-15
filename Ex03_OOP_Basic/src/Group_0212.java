import java.util.*;

public class Group_0212 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int unit = 10000;
		int num = 0;
		int sw = 0;
		

		Scanner sc = new Scanner(System.in);
		System.out.println("moneyÀÔ·Â :");
		int money = Integer.parseInt(sc.nextLine());

		while (unit >= 1) {
			num = money / unit;
			System.out.println("unit:" + unit + "  num:" + num);
			money = money - unit * num;
			if (sw == 0) {
				unit = unit / 2;
				sw = 1;
			} else {
				unit = unit / 5;
				sw = 0;
			}
		}

	}

}
