//���� 1,2,3,4,5�� ����ִ� �迭 A�� �����Ͻÿ�
//A�迭 ũ���� 2�谡�Ǵ� �迭 B�� �����ϰ�
//A�迭�� �����͸� B�� �����Ͻÿ�
//B�� ���� �������� 6,7,8,9,10�� �����Ͻÿ�
public class Test1 {

	public static void main(String[] args) {

		int[] A = {1,2,3,4,5};
		int[] B = new int[10];
		
		
		
		for(int i=0; i<A.length; i++) {
		B[i] = A[i];
		
		}
		for(int i=5; i<B.length; i++) {
			B[i]=i+1;
		}
		for(int i=0; i<B.length; i++) {
		System.out.print(B[i]);
		}
		System.out.println();
		
		
		for(int i=0; i<B.length; i++) {
			if(i<5) {
				B[i]=A[i];
				System.out.println(B[i]);
		}else if(i<B.length) {
			System.out.println(B[i]=i+1);
		}
		}
		
	}

}
