import javax.swing.JOptionPane;

/*
����
main �Լ� ������ Thread 2�� ����
ù��° ������� �ð�����
�ι�° ������� �ܾ��Է� ó��

main �Լ����� 2�� Thread ��ŸƮ
��, �ܾ �ϳ��� �Է��ؼ� Ȯ�� ��ư�� ������ �ð��� ���߰��ض� >> ���α׷�����
Hint = static �ڿ� Ȱ��
*/
/*
class Time extends Thread{
    private static int time;
    public void run() {
        for(int i = 10 ; i > 0 ; i --) {
            time = i;
            System.out.println(i+"�� ����");
            try {
                
                Thread.sleep(1000);//CPU�� �����ϰ��ִ� thread ��� �����ϴ°��� -> 1000 = 1��
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
        inputdata = JOptionPane.showInputDialog("�Է��ض�");
        System.out.println("�亯 : " + inputdata);
        
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
        String inputdata = JOptionPane.showInputDialog("dan" + "�� ���� �Է�");
        if(inputdata != null && !inputdata.equals("")) {
            Ex05_WordGame.inputcheck = true;
        }
        System.out.println("�Է��� ����: " + inputdata);
    }
}


class WordTimeOut extends Thread{
    @Override
    public void run() {
        for(int i=10; i > 0 ; i--) {
            
            if(Ex05_WordGame.inputcheck)return; //run�Լ� Ż��
            
            System.out.println("���� �ð�: " + i);
            try {
                 Thread.sleep(1000); //���ǿ��� 1�ʰ� ������ ....
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
public class Ex05_WordGame {
        //���� : static
        static boolean inputcheck= false; //HINT
        public static void main(String[] args) {
            WordInputProcess word = new WordInputProcess();
            WordTimeOut time = new WordTimeOut();
            
            word.start();
            time.start();

            //word.join(); //main Thread���� ���� ���������� ��ٷ� �޶� ��
                           //main �Լ��� word ��� Thread �� ������ �ִ�
            //time.join(); ////main Thread���� ���� ���������� ��ٷ� �޶� ��
            
            //main �Լ����� ��ٷ� �޶�� ���� ������ ���������� ... word, join
            
            //Join �޼ҵ�� �ϳ��� �����尡 �ٸ� �����尡 �ϴ� ���� �Ϸ�� �� ���� ��ٸ����� �� �� ���δ�.
            //���� ���� ���ư��� �ִ� ������(A)���� �� �ٸ� ������(B) �� �Ϸ�� �� ���� ��ٸ����� �Ѵٸ�,
            //B.join();
            
            //�̷��� ȣ�� ���ָ� �ȴ�. �̷��� �ϸ�,
            //���� ���ư��� �ִ� ������ A �� ������ B �� �ϴ� ���� ��ĥ �� ����,
            //�����ְ�(pause) �ȴ�. join �޼ҵ带 �����ε�(overloading) �� �޼ҵ� ���� �ִµ�
            //�� �޼ҵ���� �����ڰ� �� ���� �����ְ� �� ���� ������ �� �ִ�.
            
            //join() : �ٸ� �������� ���Ḧ ��ٸ�
            //���� ����� �ϴ� ��Ȳ���� �������� ����� ó���Ҷ�
            //�渶���� �������� ����(��Ⱑ ���� �Ǹ�)
            System.out.println("Main END");
            
        }
}