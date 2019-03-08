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