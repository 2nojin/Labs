
public class Ex01_Array_Quiz {

	public static void main(String[] args) {

		//수학과 학생들의 기말고사 시험점수
		int[] score = new int[] {79,88,97,54,56,95};
		int max = score[0];	//79
		int min = score[0];	//79
		/*
		 * 제어문을 사용해서 max 변수에 최대값(최고점수) min 변수에 최소값(최하점수)이 들어가게하세요
		 * 결과) max>97	min>54
		 */
		
		for(int i=1; i<score.length; i++) {
			
			if(max<score[i]) {
				
				max=score[i];
				
			}if(min>score[i])
				           
				min=score[i];
		
		}
		System.out.println(max);
		System.out.println(min);
		
		/////////////삼    항    연    산     자//////////////
		for(int i=1; i<score.length; i++) {
		max=(score[i]>max)?score[i]:max;
		min=(score[i]<min)?score[i]:min;
		}
		System.out.println(max);
		System.out.println(min);
		System.out.println();
		
		
		int[] number = new int[10];
		
		//10개 방의 값을 1~10까지 초기화 하고 싶어요
		//number[0]
		for(int i=0; i<number.length; i++) {
			number[i]=i+1;
		}
		for(int i=0; i<number.length; i++) {
			System.out.println(number[i]);
		}
		
		
		
		//어느 학생의 기말고사 시험 점수 입니다(5과목)
		int sum=0;
		float average=0f;
		int[] jumsu= {100,55,90,60,78};
		/*
		 * 1. 총 과목수
		 * 2. 과목의 합(총점)
		 * 3. 과목의 평균
		 * 단, 2,3문제는 하나의 for문을 사용
		 */
		
		System.out.println("총과목:" +jumsu.length);
		
		for(int i=0; i<jumsu.length; i++) {
			
			sum += jumsu[i];
						
		}
		average = (float)sum / jumsu.length;		
		System.out.printf("총과목수:%d, 총점:%d, 평균:%f\n",jumsu.length, sum, average);
		/*
		for(int i=0; i<jumsu.length; i++) {
			sum+=jumsu[i];
			if(i==jumsu.length-1) {
				average = sum / (float)jumsu.length;
				
			}
		}
		System.out.printf("총과목수:%d, 총점:%d, 평균:%f",jumsu.length, sum, average);
		
		
		*/
		
		
		
	}

}
