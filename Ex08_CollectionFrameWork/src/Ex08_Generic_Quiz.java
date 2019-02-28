import java.util.ArrayList;
import java.util.Iterator;

import kr.or.bit.CopyEmp;
import kr.or.bit.Emp;

public class Ex08_Generic_Quiz {

	public static void main(String[] args) {
		//1. Emp Ŭ������ ����ؼ� ��� 3���� �����ϼ���
		//�� ArrayList ���ʸ��� ����ϼ���
		//�����ʹ� ���Ͻ� ���� ....
		ArrayList<Emp> emplist = new ArrayList<>();
		emplist.add(new Emp(1000,"�达","IT"));
		emplist.add(new Emp(2000,"�ھ�","SALES"));
		emplist.add(new Emp(3000,"�̾�","MANAGER"));
		
		
		System.out.println("2��");
		//2. 3���� ��� ����(��� , �̸� , ����)�� ������  for���� ����ؼ� ����ϼ���
		//�� toString() ������
		 for(Emp emp : emplist) {
			 System.out.println(emp.getEmpno()+"/"+
		                        emp.getEname()+"/"+
					 			emp.getJob());
		 }
		
		 
		 System.out.println("3��");
		//3. 3���� ��� ����(��� , �̸� , ����)�� ������  �Ϲ�for���� ����ؼ� ����ϼ���
		//�� toString() ������
		 for(int i = 0 ; i < emplist.size() ; i++) {
				System.out.println(emplist.get(i).getEmpno() +"/"+
								   emplist.get(i).getEname() +"/"+
						           emplist.get(i).getJob());
			}
		
		 
		 System.out.println("4��");
		//4. CopyEmp ��� Ŭ������ ���弼�� (������ Emp �� ������)
		//job member field ��ſ� 
		//private int sal �߰��ϰ�  (getter , setter ����)
		//ArrayList ���ʸ� ����ؼ� ��� 3�� ���弼��
		//�Ʒ� ������
		//100 , "��" , 1000
		//200 , "��" , 2000
		//300 , "��" , 3000
		 ArrayList<CopyEmp> clist = new ArrayList<CopyEmp>();
		 	clist.add(new CopyEmp(100,"��",1000));
			clist.add(new CopyEmp(200,"��",2000));
			clist.add(new CopyEmp(300,"��",3000));
			
			
			System.out.println("5��");
		//5.200�� ����� �޿��� 5000���� �����ؼ� ����ϼ��� (�Ϲ� for�� ����ϼ���)
		for(int i = 0 ; i < clist.size() ; i++) {
			if(clist.get(i).getEmpno() == 200) {
				clist.get(i).setSal(5000);
				System.out.println(clist.get(i).toString());
			}
		}
		
		
		
		System.out.println("6��");
		//6.300�� ����� �̸��� "�ñ���" �� �����ؼ� ����ϼ���(������ for�� �ȿ��� ....)
		 for(CopyEmp emp : clist) {
			 if(emp.getEmpno() == 300) {
				 emp.setEname("�ñ���");
				 System.out.println(emp.toString());
			 }
		 }
		 
		 
		 
		 System.out.println("7��");
		 //7.��������� Iterator �������̽��� ����ؼ� ����ϼ���
		 
		 System.out.println("*******************");
		 Iterator<CopyEmp> it = clist.iterator();
		 while(it.hasNext()) {
			 CopyEmp e = it.next();
			 System.out.println(e.getEmpno() +"," +e.getEname() +"," +e.getSal());
		 }
		 
		 
	}

}
