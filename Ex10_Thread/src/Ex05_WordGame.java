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