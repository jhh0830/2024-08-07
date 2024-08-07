package com.kh.chap03_map.part02_properties.run;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest1 {

	// Properties ��� ���
	public static void main(String[] args) {
		
		
		// * Properties 
		// > Map �迭 : key + value ��Ʈ�� �����
		// 				���� ���� ���� X
		// 				key �ߺ� X, value �ߺ� O
		// > ��, Properties ���� Ư¡�̶�� �Ѵٸ�
		//   Key, Value ��� String Ÿ������ ���ѵǾ��ִ�!!
		//   (���ʿ� ��ü ���� �� ���׸� ������ ���� ����, ������ String ���� ����)
		//  > �׷��ٰ� �ؼ� �ٸ� Ÿ���� ����� ���� �ƴ�!!
		//  "���ʻ�" String, String ���� �����ؼ� ��!!
		
		// Properties ��ü ���� ���� - ǥ���� �� ���׸� ���� X
		Properties prop = new Properties();
		/*
		// ���������� put �޼ҵ带 ���� key + value ���·� ������ �߰� ����
		prop.put("��������", new Snack("���ڸ�", 600));
		
		System.out.println(prop);
		
		// ���������� get �޼ҵ带 ���� key ���� �����ؼ� value ���� �˾Ƴ� �� ����
		System.out.println(prop.get("��������"));
		
		// > HashMap �� �������� ��� ����� ����ϴ�!!
		*/
		
		// Properties �� ���� String, String ���� �����ؼ� ��!!
		// > ���ʿ� String, String ���� �����͸� �߰����ִ� ������ �޼ҵ尡 ����
		// >       String Ÿ���� key �� �����ϸ� String Ÿ���� vlaue�� �������ִ�
		//         ������ �޼ҵ� ���� ������!!
		
		// 1. setProperty(String key, String value)
		// : key + value ��Ʈ�� ��� String Ÿ������ �߰����ִ� �޼ҵ�
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "Properties");
		
		
		System.out.println(prop);
		
		// > Properties �� ��� �����͸� "���� �����" ���ִ� ������ �޼ҵ尡 ����
		
		// 2. Properties ��ü�� ��� ���빰�� ���Ϸ� "��������" (���)
		// prop.store(OutputStream os, String comments)
		try {
			prop.store(new FileOutputStream("test.properties"), "Properties Test");
			// 3. Properties ��ü�� ��� ���빰�� xml ���Ϸ� "��������" (���)
			// storeToXML(OutputStream os , String comments)
			prop.storeToXML(new FileOutputStream("test.xml"), "Properties Test");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
