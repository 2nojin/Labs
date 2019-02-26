import java.util.StringTokenizer;

//String 클래스(다양한 함수)
//개발에서 많이 사용 (우리가 사용하는 데이터는 대부분 문자열 데이터)

public class Ex06_String_Function {
	public static void main(String[] args) {
		String str="";	//문자열 초기화
		
		String [] strarr = {"aaa","bbb","ccc"};
		for(String s:strarr) {
			System.out.println(s);
		}
		
		//String 클래스(함수)
		String ss = "Hello";
		String concatstr = ss.concat("World");
		System.out.println(concatstr);
		
		//boolean bo = ss.contains("el");
		boolean bo = ss.contains("ele");
		System.out.println(bo);
		
		
		
		String ss2 = "a b c d"; // 실제로는 [a][ ][b][ ][c][ ][d]
		System.out.println(ss2.length());
		
		String filename = "hello java, world";
		System.out.println(filename.indexOf(","));	//몇번째 방에 있는지 찾는
		
		System.out.println(filename.indexOf("java")); //시작 위치 index
		
		
		//활용 : 문장내에서 내가 원하는 단어가 포함되어 있는지 검증
		// 0 보다 큰값이면 최소한 하나의 단어 포함
		System.out.println(filename.lastIndexOf("a"));	//제일 뒤에 있는 a를 찾는다, 단 번호는 앞에서 부터 셈
		System.out.println(filename.lastIndexOf("njlee"));
		//배열에 값이 없다 == -1
		//return -1;
		
		// 주로 많이 쓰는 함수
		// length(), indexof(), substring(), replace(), split()
		String result = "superman";
		System.out.println(result.substring(0));
		System.out.println(result.substring(5));
		System.out.println(result.substring(0,0));
		System.out.println(result.substring(0,1));
		System.out.println(result.substring(1,1));
		System.out.println(result.substring(2,3));	//index endIndex-1
		//Quiz
		String filename2="홍길동.jpg";	//파일명은 바꾸어 질 수 있다.
		//aaaaa.mgeg or ab.hwp
		//파일명 >> 홍길동
		//확장자 >> jpg
		//분리해서 화면에 출력해보세요
		//위에서 배운 함수로 활용하세요(배운걸로만)
		int i = filename2.indexOf(".");
		System.out.println("파일명 : " +filename2.substring(0, i));
		System.out.println("확장자 : " +filename2.substring(i+1,filename2.length() ));
		
		
		//replace
		String s2 = "ABCD";
		String result4 = s2.replace("A", "안녕");
		System.out.println(result4);
		
		System.out.println(s2.charAt(0));
		System.out.println(s2.charAt(3));	//return char
		System.out.println(s2.endsWith("CD"));	
		System.out.println(s2.equalsIgnoreCase("aBcD"));
		
		
		//POINT
		//split
		String s6 = "슈퍼맨,팬티,노랑색,우하하,우하하";
		String[] namearry = s6.split(",");
		for(String s : namearry) {
			System.out.println(s);
		}
		
		String filename3 = "bit.hwp";
		String [] arry = filename3.split("\\."); //정규 표현 문자열
		System.out.println(arry.length);
		for(String s : arry) {
			System.out.println(s);	//
		}
		
		//java ,java script, DB >> 정규 표현식
		//000-{\d4}-0000
		//000-1111-0000 제공 : true
		//000-11-0000 제공 : false
		
		
		//과제(정규표현식 5개 만들어 오기) 
		//주로 많이 쓰이는것
		//주민번호, 우편번호, 전화번호, 이메일, 
		//추후 과제 다음주 월...
		
		
		String s7 = "a/b,c.d-f";
		StringTokenizer sto = new StringTokenizer(s7, "/,.-");
		while(sto.hasMoreTokens()) {
			System.out.println(sto.nextToken());
		}
		
		
		//넌센스 Quiz
		String s8 ="홍    길        동";
		//저장할때는 "홍길동"	공백제거 저장
		System.out.println(s8.replace(" ",""));
		
		
		String s9 = "       홍길동           ";
		System.out.println(">"+s9+"<");
		
		System.out.println(">" +s9.trim()+"<");
		
		
		String s10="   홍   길   동   ";
		String re = s10.trim();
		String re2 = re.replace(" ", "");
		System.out.println(re2);
		
		//여러개의 함수를 적용할 경우(method chain)
		//*****************************************
		System.out.println(s10.trim().replace(" ", ""));
		
		
		//Quiz-1
		int sum=0;
		String[] numarr = {"1","2","3","4","5"};
		//문제: 배열에 있는 문자값들의 합을 sum 변수에 담아서 출력하세요
		for(String s : numarr) {
			sum+=Integer.parseInt(s);
		}
		System.out.println(sum);
		
		
		System.out.println("-----");
		// Quiz-2
		String jumin = "123456-1234567";
		// 위 주민번호의 합을 구하세요
		int sum2 = 0;
		for (int a = 0; a < jumin.length(); a++) {
			String numstr = jumin.substring(a, a + 1);
			if (numstr.equals("-"))
				continue;
			sum2 += Integer.parseInt(numstr);
		}
		System.out.println("주민번호합 :  " + sum2);

		
		// 주민번호의 합을 구하세요 _2
		// String jumin2 = jumin.replace("-", "").split(regex);
		String[] numarr2 = jumin.replace("-", "").split("");
		int sum3 = 0;
		for (String a : numarr2) {
			sum3 += Integer.parseInt(a);
		}
		System.out.println("주민번호합2 : " + sum3);

		// 주민번호의 합을 구하세요 _3
		String jumin4 = jumin.replace("-", "");
		int sum4 = 0;
		for (int a = 0; a < jumin4.length(); a++) {
			sum4 += Integer.parseInt(String.valueOf(jumin4.charAt(a)));
		}
		System.out.println("주민번호합3 : " + sum4);

	}
}
