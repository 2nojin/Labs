import java.util.*;



class QuizInfo{
	String question;
    String answer;
    String result;
    QuizInfo(String question, String answer, String result) {
        this.question = question;
        this.answer = answer;
        this.result = result;
    }
}

class WordInput extends Thread{
	   static int count=0;
	@Override
	public void run() {
		HashMap<Integer, QuizInfo> quiz = new HashMap();
	       Scanner sc = new Scanner(System.in);
	       String answer;
	    
	       boolean result;
	       quiz.put(1, new QuizInfo("2*1 ","2","결과?"));
	       quiz.put(2, new QuizInfo("2*2?","4","결과?"));
	       quiz.put(3, new QuizInfo("2*3?","6","결과?"));
	       quiz.put(4, new QuizInfo("2*4?","8","결과?"));
	       quiz.put(5, new QuizInfo("2*5?","10","결과?"));
	       quiz.put(6, new QuizInfo("2*6?","12","결과?"));
	       quiz.put(7, new QuizInfo("2*7?","14","결과?"));
	       quiz.put(8, new QuizInfo("2*8?","16","결과?"));
	       quiz.put(9, new QuizInfo("2*9?","18","결과?"));
	       for(int i = 1 ; i <= quiz.size() ; i++) {
	           Set set =quiz.keySet();

	           System.out.println(quiz.get(i).question);
	           answer = sc.nextLine();
	           result = quiz.get(i).answer.equals(answer);
	           if(result) {
	               quiz.get(i).result = "정답";
	               System.out.printf("%s입니다.\n",quiz.get(i).result);
	               
	               count++;
	           }else {
	               quiz.get(i).result = "오답";
	               System.out.printf("%s입니다.\n",quiz.get(i).result);
	           }

	       }
	       System.out.printf("%d개 맞췄습니다 !" , count);
	       
	    }
	}

class Time extends Thread{
	
	@Override
	public void run() {
		for(int i=10; i>=0; i--) {
//			if(Quiz.inputcheck)return;
			System.out.println("남은시간 : " +i +"초");
			if(i==0) {
				System.out.println("시간이 종료되었습니다.");
				System.out.println("맞은갯수 : " +WordInput.count);
			}
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
public class Quiz {
	public static boolean inputcheck;

	public static void main(String[] args) {
		WordInput wordinput = new WordInput();
		Time time = new Time();
		time.start();
		wordinput.start();
	
	}
}
