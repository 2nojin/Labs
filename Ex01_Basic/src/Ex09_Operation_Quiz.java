import java.util.*;
public class Ex09_Operation_Quiz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù��° ���ڸ� �Է� �ϼ��� :");
		double num1 = Double.parseDouble(sc.nextLine());
		
		System.out.println("��ȣ�� �Է� �ϼ��� :");
		String opr = sc.nextLine(); //��ȣ�޴°�
		
		System.out.println("�ι�° ���ڸ� �Է� �ϼ��� :");
		double num2 =Double.parseDouble(sc.nextLine());
		
		double result=0;
		
		
		// ���ڿ��� �񱳴� equals ��� �Լ��� ����Ѵ�!!!!!! 
		if(opr.equals("+")) {
			result = num1+num2;
		}		
		else if(opr.equals("-")) {
			result = num1-num2;
		}
		else if(opr.equals("*")) {
			result = num1*num2;
		}
		else if(opr.equals("/")) {
			result = num1/num2;
		}
		else {
			System.out.println("�������� �ʴ� ������ �Դϴ�.");
			//key point (���⼭�� main �Լ�)
			//return Ű���� : [�Լ�����]�� ������ > main �Լ� Ż�� > ����
			return;
		}
		System.out.println("������� :" +result);
		
		
	}

}
