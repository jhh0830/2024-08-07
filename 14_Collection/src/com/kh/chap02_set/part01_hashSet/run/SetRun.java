package com.kh.chap02_set.part01_hashSet.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.kh.chap02_set.part01_hashSet.model.vo.Student;

public class SetRun {

	// HashSet �����
	
	public static void main(String[] args) {
	
		// ���׸� ���� X
		// HashSet ��ü ���� ����
		HashSet hs1 = new HashSet();
		
		
		// 1. add(�߰��Ұ�)
		hs1.add("�ݰ����ϴ�.");
		hs1.add(new String("�ݰ����ϴ�."));
		hs1.add(new String("������"));
		hs1.add(new String("�ȳ��ϼ���."));
		hs1.add(new String("������"));
		hs1.add(50);
		System.out.println(hs1); // [�ȳ��ϼ���., ������, �ݰ����ϴ�.]
		
		// > ����Ǵ� �������� ���� ���� X, ���� ���� X
		//   ���׸� ������ ��������� �ƹ� Ÿ���̳� �� ���� ����
		
		// 2. size() 
		System.out.println("hs1 �� ũ�� : " + hs1.size());
		
		// 3. remove(�����Ұ�)
		hs1.remove("������");
		System.out.println(hs1);
		
		
		// 4. clear()
		
		hs1.clear();
		
		System.out.println(hs1);
		
		System.out.println("hs1 �� ũ�� : " + hs1.size());
		
		// 5. isEmpty()
		System.out.println("hs1 �� ����ֽ��ϱ� : " + hs1.isEmpty());
		
		// > Set �迭 ���� ������ �޼ҵ���� ������,
		//   ��κ� List �迭�� �޼ҵ� ������ ���� ����ϴ�.
		// ��? Set, List �迭 ��� Colletion �������̽� �迭 �ڽĵ��̱� ����
		
		System.out.println("--------------------------");
		
		// ���׸� ���� O
		
		HashSet<Student> hs2 = new HashSet<>();
		// hs2.add("����");
		
		hs2.add(new Student("�̹�ȣ",37,100));
		hs2.add(new Student("�谩��",26,40));
		hs2.add(new Student("ȫ�浿",24,68));
		hs2.add(new Student("�̹�ȣ",37,100));
		System.out.println(hs2);
		// > ���� ���� ���� X, �ߺ� ���� O
		//   ���׸��� �����߱� ������ ���� Ÿ�Ը� �����!!
		
		// �� ? �ߺ� ������ �Ǿ��°�?
		// > ������ ��ü�� �Ǵ��� ���� �ʾƼ� �ߺ� �����!!
		// * HashSet �� ���� �߰��� ��
		// equals(), hashCode() �޼ҵ带 ����
		// ������ �����Ͱ� �ִ� ������ �˻� �� add ����
		
		// HashSet �� ��ü�� ���� ��
		// ���������� equals() �� �� - �ּҰ� �����
		// +
		// ���������� �� hashCode() ���� ��ġ�ϴ����� �� - �ּҰ� �����
		// > ��, "�ּҰ�"�� �������� �ߺ��Ǻ��� �Ѵ�!!
		
		// ��ü�� �� �ʵ尪�� ��ġ�ϸ�
		// ������ ��ü�� �Ǻ��� �Ǽ� �ߺ������� �ȵǰԲ� �ϰ���� ���?
		// > eqauls(), hashCode() �޼ҵ带 �������̵� �ϱ�!!
		
		// ���� Object Ŭ������ �޼ҵ�
		// - equals() : �ּҰ� �����
		// - hashCode() : �ּҰ� ��������
		
		// Student Ŭ���� �޼ҵ� �������̵�
		// - equals() : ���빰 �����
		// - hashCode() : ���빰�� ��������
		
		// > VO Ŭ���� �ۼ� ��
		//   �ش� VO Ÿ���� �Ӱ�ü�� ������ HashSet �� ������ ���� �ִٸ�
		//   �ʵ尪�� �������� ����� �ϴ� equals ��
		//   �ʵ尪�� �������� �����ϴ�  hashCode �޼ҵ带
		//   �������̵� �ؼ� ���� ���� ������
		// > ���� HashSet �� ������ ���� ���ٸ�
		//   ���� �������̵� ���ص� ��!! (�ʼ��� �ƴ�)
		
		System.out.println("------------------------------");
		
		// Set �� ����ִ� �����Ϳ� "������" ���� �����ϰ��� �Ҷ� ?
		
		// Set : ������ ��ü ����Ǿ����� (�� , index ������ ����)
		// > �Ϲ� for�� ��� �Ұ�
		// 1. ���� for�� ��� ���� (foreach��)
		// for(�������� : �¸�)
		// > ���� ǥ���� ��𿡵� index �� ���� ����� ���� ������ ��� ����
		for(Student s : hs2) {
			System.out.println(s);
		}
		
		System.out.println("----------------------------");
		
		// 2. ���� Set �� ����� �����͸� ArrayList �� �Ȱ��� ��
		// �ش� ArrayList �������� �Ϲ� for���� ������ ���
		
		// Set �� �����͸� List�� �ű�� ���
		// 1) �� ArrayList ��ü ���� �� addAll �޼ҵ�� Ȱ��
		// ArrayList<Student> list = new ArrayList<>();
		// list.addAll(hs2);
		// > �� ����Ʈ ���� �� addAll �� ��°�� ������ �߰�
		
		
		// 2) ArrayList ��ü ���� �� �Ű����� �����ڸ� �̿�
		ArrayList<Student> list = new ArrayList<>(hs2);
		// > ó������ �����Ͱ� �߰��� ä�� ��ü ����
		
		for(int i =0; i <list.size(); i++) {
			
			System.out.println(list.get(i));
			
		}
		System.out.println("----------------------------");
		
		// 3. HashSet Ŭ�������� �����ϴ� Iterator(�ݺ���)�� �̿��ϴ� ���
		
		// 3_1. > hs2 �� ����ִ� ��ü���� Iterator (�ݺ���) �� �Ű� ���
		Iterator<Student> it = hs2.iterator();
		
		// 3_2. Iterator (�ݺ���) �� ���ؼ� �ݺ� ����
		// > �� �̻� �̾Ƴ� �����Ͱ� ���� �� ���� �ݺ�!!
		
		// Iterator ��ü���� �����ϴ� ���̻� ���� �����Ͱ� �ִ��� �˻����ִ� �޼ҵ�
		// > it.hasNext() : ���� �����Ͱ� ������ true / ������ false ��ȯ
		while(it.hasNext()) {
			// �̾Ƴ������Ͱ� �ִٸ�
			// > it.next() : �����͸� �̾��ִ� �޼ҵ�
			System.out.println(it.next());
			
		}
		//	System.out.println(it.next());
		// > ���̻� �̾Ƴ� �����Ͱ� ���µ��� �����͸� �̰��� �Ѵٸ�
		// NoSuchElementException ���� �߻�
		// * Iterator �� ���� ����
		// > String�� StringTokenizer �� ���!!
		
		
		// * .iterator() �޼ҵ�
		// > List �迭�� Set �迭 ��� ����� �� �ִ� �޼ҵ�
		//  (Collection �迭������ ��� ����)
		// > Map �迭������ ��� �Ұ�!!
		
		
	}

}
