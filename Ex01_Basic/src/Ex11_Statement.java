import java.util.*;


//�ݺ���(while, do~while)
public class Ex11_Statement {

	public static void main(String[] args) {
		/*while(true) {
			System.out.println(true);
		}*/
		
		int i = 10;
		while(i>=10) {	//������ true �� ����
			System.out.println(i);
			//�ݵ�� ���ο��� ������� �������� ó���ؾ���
			i--;
			
		}

		//1~100������ ��
		int sum=0;
		int j=1;
		while(j<=100) {
			//j++; //����!!!!!!!!! sum������ �Ʒ��� �����	//5150
			sum+=j;
			j++;
		}
		System.out.println("1~100������ : " +sum);
		
		//while������ ������
		int num=2;
		int num2=1;
		while(num<=9) {
			num2=1;	//p���� 1�� �ʱ�ȭ
			while( num2<=9) {
				System.out.printf("%d * %d = %d\n", num,num2,num*num2);
				num2++;
			}
			System.out.println();
		num++;
			
		}
		
		//do~while() : ������ ����(������ �ѹ� ���� �� ���� ���� �Ǵ�)
		//do {���๮} while(���ǽ�)
		//�޴� ����
		//1. �λ�
		//2. �޿�
		//1�� �Է��ϸ� �λ� ... 2�� �Է��ϸ� �޿� .. 3�� �Է� �ٽ��Է��� ����
		Scanner sc = new Scanner(System.in);
		int inputdata=0;
		
		do {
			
			System.out.println("���� �Է���(0~10)");
			inputdata=Integer.parseInt(sc.nextLine());
			
		}while(inputdata>10);	//while true ��� �ݺ�
		//while �� Ż���� ������ false �϶� while Ż��
		System.out.println("����� �Է��� ���ڴ� : " +inputdata);
		
		
		
		
		
		
		
		
		
	}

}
