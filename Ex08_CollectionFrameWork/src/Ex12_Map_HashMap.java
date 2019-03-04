import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 * Map �������̽��� �����ϴ� Ŭ����
 * Map >> Ű(key), ��(value) �ֹ迭
 * ex) ������ȣ : (02-����)....
 * key �� : �ߺ����X
 * value : �ߺ����O
 * 
 * Map >> Generic ����
 * 
 * HashTable(������) : ����ȭ ����
 * HashMap(�Ź���) : ����ȭ �������� ����(�ʿ��ϸ� ����ȭ ����)
 * 
 */
public class Ex12_Map_HashMap {
	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		map.put("Tiger", "1004");
		map.put("scott", "1004");
		map.put("superman", "1004");
		//Ȱ�� : ȸ��ID, ȸ��PWD ��´�.(memory��)
		//�޸�(heap) >> ����ǵ� �����ͺ���(���ϱ��) login.txt���� but,���� ���� >> RDBMS
		
		System.out.println("tiger Key : " +map.containsKey("tiger"));	// ��ҹ��� ����
		System.out.println("scott Key : " +map.containsKey("scott"));
		System.out.println("1004 Value : " +map.containsValue("1004"));
		
		
		//(key, value)
		//POINT : key ���� ������ value ���� ã�´�
		System.out.println("Tiger�� Value : " +map.get("Tiger"));
		System.out.println("hong�� Value : " +map.get("hong")); // hong�̶�� key���� map�� ������ ���� �ʴ�.
		
		
		//put
//		map.put("Tiger", "1004");
//		map.put("scott", "1004");
//		map.put("superman", "1004");

		map.put("Tiger", "1008");	//Key�� ���� ��� Value : Overwrite
		
		System.out.println("Tiger�� �� Value�� : " +map.get("Tiger"));
		System.out.println("berfore : " +map.size());
		Object returnvalue = map.remove("superman");	//Key���� �̿��� ����
		System.out.println(returnvalue);	//�ʿ��ϴٸ� ��....
		System.out.println("after : " +map.size());
		
		
		Set set = map.keySet();	// ����
		//Set �������̽��� �����ϴ� ��ü(HashSet)�� ���������� new �ϰ� �ű⿡ key���� ���
		//�� �ּҰ��� �����Ѵ�... �������� �����Ѵ� >> keySet();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		
		
		//Quiz Map���� value������ ��Ƽ� ����ϼ���
		//map.values()
		Collection vlist = map.values();
		System.out.println("value���鸸 : " +vlist);
		
		
		
		
	}
}
