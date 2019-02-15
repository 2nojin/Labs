//������
public class Ex06_Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result = 100/100;
		System.out.println(result);

		result = 13/2;
		System.out.println(result);

		result = 13%2;
		System.out.println(result);	//������

		//������ ������ (++, --) 1�� ����, 1�� ����
		int i = 10;
		++i; //��ġ ����
		System.out.println(i);
		i++; //��ġ ����
		System.out.println(i);
		//���� 1�� : ��ġ, ��ġ ����

		//Point : ��ġ�� ��ġ �����ڴ� �����ϸ� ������ �巯����.
		int i2 = 5;
		int j2 = 4;
		int result2 = i2 + ++j2;	//j2�� 1���� ��Ű�� +����
		System.out.println(result2);
		//i2 > 5 , j2 > 5 , result2 > 10
		result2 = i2 + j2++;
		//i2 > 5 , j2 > 6 , result2 > 10
		System.out.println(result2);
		System.out.println(j2);

		//POINT
		//�ڹ��� ���� ��Ģ
		//������ ��� [����]�� int ��ȯ �� ó��
		//byte + byte => �����Ϸ��� int + int ����

		byte b = 100;	//-128 ~ 127 ���� ǥ��
		byte c = 1;
		byte d = (byte)(b+c); //�ϴ� 101 ���ڰ� 1byte ǥ��..
		//1. byte d = (byte)(b+c); �����Ⱚ�� �߻� ����
		//2. int d = b+c; ��� �� ���� ����

		System.out.println("d : " +d);


		//byte + short => int + int
		//char + char  => int + int
		//POINT : ���꿡 int���� ���� Ÿ���� int �� ��ȯ(long����)
		//byte, char, short => int �ٲ㼭 ���� ó��


		//byte + short => int + int >> ��� int
		//char + int   => int + int >> ��� int
		//int + long   => long + long >> ��� long


		//������ �Ǽ� ���� >> �Ǽ�
		//float + int => float + float >> ��� float
		//long + float => float + float >> ��� float
		//float + double => double + double >> ��� double



		float num2 = 10.45f;
		int num3 = 20;

		float result3 = num2 + num3;
		System.out.println(result3);

		int result4 = (int)(num2+num3);
		System.out.println(result4);


		//char�� ���� Ÿ��
		char c2 = '!';	//33
		char c3 = '!';	//33
		//result_4 = c2+c3; //!!(x)
		//char result_4 = c2+c3;	int = int + int
		int result5 = c2+c3;
		System.out.println(result5);
		System.out.println((char)result5);



		//���
		//�߼ұ�� ���蹮��(������) => �����

		//1~100���� ¦���� ��
		int sum=0;
		for(int j=1; j<=100; j++) {
			//System.out.println(j);
			if(j%2==0) {
				sum+=j;
			}
			//sum=sum+j;


		}

		System.out.println("sum : " +sum);
		//== ������ (��(value) ���ϴ� ������)
		//javascript (===)

		if(10==10.0f) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}

		//! ����������
		if('A' != 65) {//���� �ʴ�?
			System.out.println("�� ���� ���� �ƴϾ�");
		}else {
			System.out.println("�� ���� ���̾�");
		}


		//�ϱ�����(Point)
		//���ó�� ���� ������(���׿�����)
		int p = 10;
		int k = -10;
		int result8 = (p==k)? p:k;
		//? �տ� �ִ� ���ǽ��� true ��� : �տ� �ִ� ����
		//? �տ� �ִ� ���ǽ��� false��� : �ڿ� �ִ� ����
		System.out.println("result8:" +result8);

		//�� ���� �����ڸ� if������ �ٲ㺸����
		if(p==k) {
			result8 = p;

		}else {
			result8 = k;
		}


		/*
		 * ����ǥ
		 * 0:false
		 * 1:true
		 * 		or		and
		 * 0 0	0		 0
		 * 0 1	1		 0
		 * 1 0	1		 0
		 * 1 1	1		 1
		 * 
		 * 
		 * 
		 * sql(oracle)
		 * select *
		 * from emp
		 * where job='salse' and asl > 2000;
		 * 
		 * select *
		 * from emp
		 * where job='sales' or sal > 2000;
		 */


		//������(	|(or), &(and) )
		//0�� 1�� bit ����

		int x = 3;
		int y = 5;
		System.out.println("x|y : " +(x|y));

		//������ 3�� -> 2���������� ��ȯ
		//128	64	32	16	8	4	2	1
		//					0	0	1	1	(2����:3)
		//					0	1	0	1	(2����:5)
		//OR				0	1	1	1	> 1+2+4	> 7
		//AND				0	0	0	1	> 1 > 1
		
		System.out.println("x&y : " +(x&y));
		
		
		//Point ������ ( || (or), && (and))	������ return boolean
		//�߿��ұ�
		//if(10 > 0 && -1 > 1 && 100 > 2 && 1 > -1) {���๮}
		//if(10 > 0 || -1 > 1 || 100 > 2 || 1 > -1) {���๮}
	}

}
