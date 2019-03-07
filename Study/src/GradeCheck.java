import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.io.*;


public class GradeCheck {
	static HashMap<Integer, Grade> map = new HashMap<Integer, Grade>();	//POINT
	static int count = 1;
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		GradeCheck gc = new GradeCheck();
		while(true){
		System.out.println("�������� ���α׷�");
		System.out.print("<1>�߰� <2>���� <3>��� <4>���� <5>�ε� <6>���� : ");

		switch (scan.nextInt()) {
		case 1:
			gc.add();
			break;
		case 2:
			gc.delete();
			break;
		case 3:
			gc.print();
			break;
		case 4 :
			gc.save();
			break;
		case 5:
			gc.load();
			break;
		case 6:
			gc.exit();
			break;

		}// switch
		}//while
	}// main

	private void save() {	//����ȭ
		File file = new File("grade.txt");
		try{
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);	//����ȭ
			
			oos.writeObject(map);
			
			oos.close();
			fos.close();
		}catch(Exception e){
			System.out.println("�����߻�!!!");
			e.printStackTrace();
		}
		System.out.println("����Ǿ����ϴ�.");
	}

	private void exit() {
		System.out.println("�ý����� �����մϴ�.");
		System.exit(0);
		scan.close();
	}

	private void print() {
		Set<Integer> set = map.keySet();
		System.out.println("��ȣ\t����\t�ڹ�\t���̽�\t���\t���");
		for (Integer number : set) {
			double math = map.get(number).getMath();
			double java = map.get(number).getJava();
			double python = map.get(number).getPython();
			double avg = map.get(number).getAvg();
			String you = map.get(number).getYou();

			System.out.printf("%s\t%.2f\t%.2f\t%.2f\t%.2f\t%s\n", number, math, java, python, avg, you);
		}
	}

	private void delete() {
		System.out.print("�����Ͻ� �ѹ��� �Է��� �ּ��� : ");
		int num = scan.nextInt();
		if (map.containsKey(num)) {
			map.remove(num);
			System.out.println("�����Ǿ����ϴ�.");
		} else {
			System.out.println("�л��ѹ��� �߸��Է��ϼ̽��ϴ�. �ش� ������ �����ϴ�.");
		}
	}

	private void add() {
		Grade grd = new Grade();
		map.put(count, grd.input(grd));
		count++;
	}
	
	private void load() {	//������ȭ
		File file = new File("grade.txt");
		try{
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream oos = new ObjectInputStream(fis);		//������ȭ
			
			map = (HashMap)oos.readObject();
			Set<Integer> set = map.keySet();
			System.out.println("��ȣ\t����\t�ڹ�\t���̽�\t���\t���");
			for (Integer number : set) {
				double math = map.get(number).getMath();
				double java = map.get(number).getJava();
				double python = map.get(number).getPython();
				double avg = map.get(number).getAvg();
				String you = map.get(number).getYou();

				System.out.printf("[%s]\t%.2f\t%.2f\t%.2f\t%.2f\t%s\n", number, math, java, python, avg, you);
			}
			oos.close();
			fis.close();
			
		}catch(Exception e){
			System.out.println("�ҷ����µ� �����Ͽ����ϴ�.");
			e.printStackTrace();
		}
	}
}// class
