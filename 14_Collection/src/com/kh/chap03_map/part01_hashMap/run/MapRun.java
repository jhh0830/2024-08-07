package com.kh.chap03_map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class MapRun {
	
	// HashMap ��� ���
	public static void main(String[] args) {
		
		
		// ���׸� X
		
		// HashMap ��ü ���� ����
		HashMap hm1 = new HashMap();
		
		// ����� ���� : ���������� ���� List �� Set �迭�� Collection �� ������ Ŭ����
		// > value �� ���� ����, �����͸� �߰��� �� add �޼ҵ� (�ٸ��޼ҵ� ���� ���� ���)
		
		// ��, Map �� �ƴϴ�.
		// > key + value ������ ����, �����͸� �߰��� �� put �޼ҵ�
		//  (�޼ҵ� ��� ����� �ƿ� �ٸ�)
		
		// K : Key == Object
		// V : Value == Object
		// > ���׸� ������ ���� �ʾұ� ����
		
		// 1. put(K key, V value)
		// : Map ������ key + value ��Ʈ�� �����͸� �߰����ִ� �޼ҵ�
		hm1.put("123", "ù��° ���");
		hm1.put(9, 1.234);
		hm1.put('a', "ù��° ���");
		hm1.put("123", "�ι�° ���");
		// > ���� Ű������ �� put�� �ع����� ���������� put �� �����ͷ� �������
		System.out.println(hm1);
		
		
		// > �׻� key + value �������� ������ ����
		//   value �� �ߺ��� ��� O, key�� �ߺ��� ��� X
		//   ������� ���� X
		// > ���������� ���׸� ������ ������ ��� �ƹ� Ÿ���̳� �� �����ִ�!! 
		System.out.println("--------------------------------------");
		// ���׸� o
		
		// *Map �迭�� ���׸��� ������ ���
		// ���� Key �� ���� Ÿ�԰� Value �� ���� Ÿ�� ���� �����ؾ��Ѵ�.
		
		HashMap<String, Snack> hm2 = new HashMap<>();
		
		// K == String
		// V == Snack
		
		// 1. put(K key, V value)
		// : Map ������ �����͸� key + value  �������� �߰����ִ� �޼ҵ�
		hm2.put("������", new Snack("���ڵ����",200));
		hm2.put("Ģ��", new Snack("����Ĩ��", 150));
		hm2.put("ũ�����Ƿ�", new Snack("����Ѹ�", 100));
		hm2.put("�����", new Snack("§��",500));
		// hm2.put(123, "�ƹ��ų�"); �ȴ�
		
		System.out.println(hm2);
		
		// > ���� ���� ���� X
		//   value ���� �����ϴٰ� �ص� key ���� �������� ������ �� �����
		//   ���׸� ������ Key, Value ������ Ÿ�Կ� �´� ���� ��!!
		
		hm2.put("�����", new Snack("�ſ��",700));
		
		System.out.println(hm2);
		// > �ߺ��� key ���� value ������ �������!!
		
		// 2. get(Object key) : V
		// > Map �������� �ش� Ű ���� value ���� ��ȯ���ִ� �޼ҵ�
		System.out.println(hm2.get("������"));
		
		Snack s = hm2.get("ũ�����Ƿ�");
		System.out.println(s);
		// > ���׸� ������ �ϸ� Map ���� ����������
		//   �Ź� ������ �ڽ�Ÿ������ ��������ȯ�� �����൵ ��!!
		
		
		System.out.println(hm2.get("��������"));
		// > ���� Ű ���� ���ڰ����� �������� ��� null �� �����ȴ�.
		
		// 3. size()
		// : Map ������ ����ִ� �������� ���� ��ȯ
		System.out.println("size : " + hm2.size());
		
		// 4. replace(K key, V value)
		// : Map ������ �ش� key ���� ã�Ƽ� ���� ���޵� value �� ��������ִ� �޼ҵ�
		hm2.replace("�����", new Snack("�̳�§��" , 1000));
		// > replace �� �ܼ��� ������ Ű���� ������ �� �����͸� �������ִ� ����!!
		// hm2.put("�����", new Snack("�̳�§��", 1000));
		// > put�� ���� ������ �����͸� �߰����ִ� �������� �������ִ� �� �ƴ�!!
		// (�쿬�� Ű���� �ߺ��Ǿ��� �� �����Ͱ� ����Ǵ� ȿ���� �ٻ� )
		System.out.println(hm2);
		
		// 5. remove(Object key)
		// : Map �������κ��� ���޵� key ���� ã�Ƽ� key + value ��Ʈ�� �����ִ� �޼ҵ�
		
		hm2.remove("�����");
		System.out.println(hm2);
		
		System.out.println("----------------------");
		
		// Map �� ����ִ� �����͵鿡 ���������� �����ϰ��� �� ��?
		
		// Map ���� �Ϲ����� �ݺ��� ��� �Ұ� (index ������ ���� ����)
		
		// foreach �� (���� for��)
		/*
		for(??? : hm2) {
			
		}
		*/
		// > Map ���� key + value ��Ʈ�� ���� ������ ���� for�� ��� �Ұ�
		
		// List �� Map �� �ٸ� �迭�̱� ������
		// ArrayList �� �Ű� ���� �� �ݺ��� ����� �Ұ�!!
		// ArrayList list = new ArrayList(hm2);
		//ArrayList list = new ArrrayList();
		//list.addAll(hm2);
		
		// Iterator (�ݺ���) �� �̿��ϴ� ���
		// > .iterator �� List �� Set �迭������ ����� �� �ִ� �޼ҵ�
		//Iterator it = hm2.iterator();
		
		// * ����� �ƿ� ���°� �ƴ�!!
		// > Map �� Set ���� �ٲ� �� �Ʊ� ����� ��� 3������ ����
		
		// * Map �� Set ���� �ٲ��ִ� �޼ҵ� (2��)
		// 1. keySet() �޼ҵ带 �̿��ϴ� ���
		// > Map ������ ����ִ� key ���鸸 �̾Ƽ� Set ���� �Ű���!!
		
		// 1) hm2.keySet() �޼ҵ� ȣ���ϱ� - key ���� �̾Ƽ� Set ���� �ű��
		Set<String> keySet = hm2.keySet();
		
		// 2) ���� for���� ���ų�, ArrayList�� �Űܴ��� �� �Ϲ� for���� ���ų�,
		//    Iterator �� �Ἥ �ݺ� ������
		//  - Iterator �Ẹ��
		
		Iterator<String> itKey = keySet.iterator();
		
		while(itKey.hasNext()) {
			
			String key = itKey.next();
			Snack value = hm2.get(key);
			
			System.out.println("key : " + key + ", value" + value);
			
			
		}
		
		
		System.out.println("----------------------------------");
		
		// 2. entrySet() �޼ҵ带 �̿��ϴ� ���
		// >  Entry : ���� ���� (key + value �����ִ� ����)
		
		// 1) hm2.entrySet() �޼ҵ� ȣ���ϱ� -(key + value) ���·� Set ���� �Ű���
		Set<Entry<String , Snack>> entrySet = hm2.entrySet();
		
		// 2) Iterator �� �̿��ؼ� �ݺ� ������
		Iterator<Entry<String, Snack>> itEntry = entrySet.iterator();
		
		while(itEntry.hasNext()) {
			Entry<String, Snack> entry = itEntry.next();
			
			String key = entry.getKey();
			Snack value = entry.getValue();
			
			System.out.println("key : " + key + ", value" + value);
			
		}
		
		
	}

}
