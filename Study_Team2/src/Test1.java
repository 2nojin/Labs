//숫자 1,2,3,4,5가 들어있는 배열 A를 생성하시오
//A배열 크기의 2배가되는 배열 B를 선언하고
//A배열의 데이터를 B에 복사하시오
//B에 남은 공간에는 6,7,8,9,10을 저장하시오
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
