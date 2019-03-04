import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

//TreeSet �߰�������,,, �˰� ������ ���� �� ���ƿ�


public class Ex11_Set_TreeSet {
	public static void main(String[] args) {
		//Set�� ����X, �ߺ�X,
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("B");
		hs.add("A");
		hs.add("F");
		hs.add("K");
		hs.add("G");
		hs.add("D");
		hs.add("P");
		hs.add("A");
		System.out.println(hs);
		
		
		//HashSet Ȯ�� > LinkedHashSet(��������) : > Linked(�ּҰ�) > node����
		
		Set<String> hs2 = new LinkedHashSet<String>();
		//add�� ������ ������ [����]�Ǵ� ���� �ƴϴ�
		hs2.add("B");
		hs2.add("A");
		hs2.add("F");
		hs2.add("K");
		hs2.add("G");
		hs2.add("D");
		hs2.add("P");
		hs2.add("A");
		System.out.println(hs2);
		
		
		//����X, �ߺ�������X, ����(sort) :�������� �⺻�� ����
		//TreeSet : �˻��� ���� �� ���� ��Ҹ� �ʿ�� �ϴ� ����
		//����Ʈ�� : ���ĵǰ� ���� ���� ������ ���� ȿ����
		//Lotto�� ���� : 1~45 ���� 6�� ���� > �ߺ�X > ����O
		
		
		Set<Integer> lotto = new TreeSet<Integer>();
		for(int i=0; lotto.size()<6; i++) {
			lotto.add((int)(Math.random()*45)+1);
			
		}
		
		System.out.println(lotto);
		
		//iterator() ���
		int sum=0;
		Iterator<Integer> lotto2 = lotto.iterator();
		while(lotto2.hasNext()) {
//			System.out.print(lotto2.next() +" ");
			sum+=lotto2.next();
		}
		
		System.out.println("sum : "+sum);
		
		
		
		
		
	}
}
