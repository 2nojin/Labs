import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//Today POINT
//HashMap<k, v>
//HashMap<String, String>
//HashMap<Integer, String>
//HashMap<String, ��ü>		POINT > value ������ ��ü�� �� �� �ִ�.
//HashMap<String, Emp>

//IO, Network, Thread		>> ArrayLisct<Emp>, HashMap<String, Emp> �ڵ�Ȱ�� 


class Student{
	int kor=100;
	int math=80;
	int eng=20;
	String name;
	
	Student(String name){
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [kor=" + kor + ", math=" + math + ", eng=" + eng + ", name=" + name + "]";
	}
	
}

public class Ex14_HashMap_Generic {

	public static void main(String[] args) {
		
		HashMap<String, Student> students = new HashMap<String, Student>();
		students.put("hong", new Student("ȫ�浿"));
		students.put("kim", new Student("������"));
		
		Student hongstd = students.get("hong");
		System.out.println(hongstd.name);
		System.out.println(hongstd.kor);
		System.out.println(hongstd.eng);
		System.out.println(hongstd.math);
		
		
		// Map �� �⺻������ key ������ value �� ���
		// ���������� (key ,value) ��� ����ϰ� �;��
		// .entrySet() >> key + "=" + value �ϳ��� ���ڿ�
		// hong=Student@15db9742
		Set set = students.entrySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// �������� CASE : value ��ü(Object) �϶�
		// Map.Entry Ÿ���� ���ؼ� (key, value) �и��ؼ� ��� ����
		// getKey() , getValue() ������ ������ ��� ����
		for (Map.Entry m : students.entrySet()) {
			System.out.println(m.getKey() + "=" + ((Student) m.getValue()).name + " / " + ((Student) m.getValue()).kor);
		}

		/*
		 * for(Map.Entry<String,Student> m : students.entrySet()) {
		 * System.out.println(m.getKey() + "=" + m.getValue().name +" / " +
		 * m.getValue().kor); }
		 */

	}

}
