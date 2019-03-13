import javax.swing.JOptionPane;

/*
문제
main 함수 제외한 Thread 2개 생성
첫번째 쓰레드는 시간제어
두번째 쓰레드는 단어입력 처리

main 함수에서 2개 Thread 스타트
단, 단어를 하나라도 입력해서 확인 버튼을 누르면 시간을 멈추게해라 >> 프로그램종료
Hint = static 자원 활용
*/
/*
class Time extends Thread{
    private static int time;
    public void run() {
        for(int i = 10 ; i > 0 ; i --) {
            time = i;
            System.out.println(i+"초 남음");
            try {
                
                Thread.sleep(1000);//CPU를 점유하고있는 thread 잠깐 쉬게하는거임 -> 1000 = 1초
                if(Input.inputdata != "") {
                    return;
                }
            }catch(Exception e) {
                System.out.println(e.getMessage());    
            }
        }
    }
}
class Input extends Thread{
    static String inputdata="";
    @Override
    public void run() {
        inputdata = JOptionPane.showInputDialog("입력해라");
        System.out.println("답변 : " + inputdata);
        
    }
}
public class Ex05_WordGame {

    public static void main(String[] args) {
        Input i = new Input();
        Time t = new Time();
        
        i.start();
        t.start();
                    
    }
}
*/

class WordInputProcess extends Thread{
    @Override
    public void run() {
        String dan="2";
        String inputdata = JOptionPane.showInputDialog("dan" + "단 값을 입력");
        if(inputdata != null && !inputdata.equals("")) {
            Ex05_WordGame.inputcheck = true;
        }
        System.out.println("입력한 값은: " + inputdata);
    }
}


class WordTimeOut extends Thread{
    @Override
    public void run() {
        for(int i=10; i > 0 ; i--) {
            
            if(Ex05_WordGame.inputcheck)return; //run함수 탈출
            
            System.out.println("남은 시간: " + i);
            try {
                 Thread.sleep(1000); //대기실에서 1초간 쉬었다 ....
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
public class Ex05_WordGame {
        //변수 : static
        static boolean inputcheck= false; //HINT
        public static void main(String[] args) {
            WordInputProcess word = new WordInputProcess();
            WordTimeOut time = new WordTimeOut();
            
            word.start();
            time.start();

            //word.join(); //main Thread에게 내가 끝날때까지 기다려 달라 함
                           //main 함수가 word 라는 Thread 를 가지고 있다
            //time.join(); ////main Thread에게 내가 끝날때까지 기다려 달라 함
            
            //main 함수에게 기다려 달라고 내가 업무를 끝날때까지 ... word, join
            
            //Join 메소드는 하나의 스레드가 다른 스레드가 하는 일이 완료될 때 까지 기다리도록 할 때 쓰인다.
            //가령 현재 돌아가고 있는 스레드(A)에서 또 다른 스레드(B) 가 완료될 때 까지 기다리려고 한다면,
            //B.join();
            
            //이렇게 호출 해주면 된다. 이렇게 하면,
            //현재 돌아가고 있는 스레드 A 는 스레드 B 가 하는 일이 마칠 때 까지,
            //멈춰있게(pause) 된다. join 메소드를 오버로딩(overloading) 한 메소드 들이 있는데
            //이 메소드들은 개발자가 얼마 동안 멈춰있게 할 지를 결정할 수 있다.
            
            //join() : 다른 스레드의 종료를 기다림
            //다중 계산을 하는 상황에서 최종적인 결과를 처리할때
            //경마게임 최종적인 순위(경기가 종료 되면)
            System.out.println("Main END");
            
        }
}