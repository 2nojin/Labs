import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

//100�� a��� 80���̻� 100�̸��̸� b��� 80�� �̸� 60���̻� �̸� c����̵Ǵ� if�� switch���� �ۼ��ϼ���

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ��� : ");
		int score=sc.nextInt();
		
		String hak="";
		if(score==100 ) {
			hak ="A";
		} else if(score>=80 && score<100 ) {
			hak ="B";
			}
			else if(score>=60 && score<80 ) {
			hak ="C";
			}
		switch (hak) {
		case "A":
			System.out.println("A����");
			break;
		case "B":
			System.out.println("B����");
			break;
		case "C":
			System.out.println("C����");
		default:
			System.out.println("F����");
			break;
		}
		}
		
		
			
	
}
