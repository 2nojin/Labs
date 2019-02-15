import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		System.out.println("1.가위, 2.바위, 3.보 중 하나를 입력하세요(숫자입력)");
		Scanner sc = new Scanner(System.in);
		int j = sc.nextInt();
		int i = (int) ((Math.random() * 4) + 1);
		if (j == 1) {
			System.out.println("내 선택 : 가위");
		} else if (j == 2) {
			System.out.println("내 선택 : 바위");
		} else if (j == 3) {
			System.out.println("내 선택 : 보");
		} else
			System.out.println("1,2,3 값 중 하나를 입력하세요.");

		if (i == 1) {
			System.out.println("컴퓨터 : 가위");

			System.out.println();
			if (j == 1) {
				System.out.println("비겼습니다.");
			} else if (j == 2) {
				System.out.println("이겼습니다.");
			} else if (j == 3) {
				System.out.println("졌습니다.");
			} else {
				System.out.println("정확한 값을 입력해주세요");
			}
		} else if (i == 2) {
			System.out.println("컴퓨터 : 바위");

			System.out.println();
			if (j == 1) {
				System.out.println("졌습니다.");
			} else if (j == 2) {
				System.out.println("비겼습니다.");
			} else if (j == 3) {
				System.out.println("이겼습니다.");
			} else
				System.out.println("정확한 값을 입력해주세요");
		} else if (i == 3) {
			System.out.println("컴퓨터 : 보");

			System.out.println();
			if (j == 1) {
				System.out.println("이겼습니다.");
			} else if (j == 2) {
				System.out.println("졌습니다.");
			} else if (j == 3) {
				System.out.println("비겼습니다.");
			} else {
				System.out.println("정확한 값을 입력해주세요");
			}
		} else
			System.out.println("Error");

	}
}