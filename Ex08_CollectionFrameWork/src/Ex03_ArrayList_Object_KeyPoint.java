import java.util.ArrayList;

import kr.or.bit.Emp;
public class Ex03_ArrayList_Object_KeyPoint {

	public static void main(String[] args) {

		//1. ��� 1���� ������ ��������
		Emp e = new Emp(100,"������", "����");
		System.out.println(e);
		
		//2. ��� 2���� ���弼�� (�����迭)
		Emp[] emplist = {new Emp(10,"�达", "IT"), new Emp(20, "�ھ�", "SALES")};
		
		for(Emp emp : emplist){
			System.out.println(emp.toString());
		
		
		}
		//�Ǽ� �߾�� �Ѹ��� �Ի縦 �� �߾��...
		//�� �����迭�� �߰� �Ұ�(X) -> ���� new...(X)
		
		//����(ArrayList)
		ArrayList alist = new ArrayList();
		alist.add(new Emp(1, "��", "IT"));
		alist.add(new Emp(2, "��", "IT"));
		alist.add(new Emp(3, "��", "����"));
		
		System.out.println(alist.toString());
		
		//�Ϲ� for���� ����ؼ� ��� ���� ��� (Down Casting)
		for(int i=0; i<alist.size(); i++) {
			//System.out.println(alist.get(i).toString());
			Emp emp = (Emp)alist.get(i);	//return Object		�ڽ�Ÿ�� = (�ڽ�Ÿ��)�θ�Ÿ��
			System.out.println(emp.getEmpno() +"/" +emp.getEname() +"/" +emp.getJob());
		}
		
		
		//������ for��
		for(Object obj : alist) {
			
			Emp emp = (Emp)obj;
			System.out.println(emp.getEmpno() +"|" +emp.getEname() +"|" +emp.getJob());
			
		}
		
		
		//����� �� �ڵ尡 �����ؿ�
		//generic(�������� ���α׷��� 99%)
		
		ArrayList<Emp> alist2  = new ArrayList<Emp>();
		alist2.add(new Emp(1,"A","IT"));
		alist2.add(new Emp(2,"B","IT"));
		
		for(Emp obj:alist2) {
			System.out.println(obj.getEmpno() +"," +obj.getEname() +"," +obj.getJob());
		}
		
		
	}

}