package com.kh.chap03_map.part02_properties.run;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest1 {

	// Properties 사용 방법
	public static void main(String[] args) {
		
		
		// * Properties 
		// > Map 계열 : key + value 세트로 저장됨
		// 				저장 순서 유지 X
		// 				key 중복 X, value 중복 O
		// > 단, Properties 만의 특징이라고 한다면
		//   Key, Value 모두 String 타입으로 제한되어있다!!
		//   (애초에 객체 생성 시 제네릭 설정도 하지 않음, 무조건 String 으로 고정)
		//  > 그렇다고 해서 다른 타입을 못담는 것은 아님!!
		//  "관례상" String, String 으로 고정해서 씀!!
		
		// Properties 객체 먼저 생성 - 표현법 상 제네릭 설정 X
		Properties prop = new Properties();
		/*
		// 마찬가지로 put 메소드를 통해 key + value 형태로 데이터 추가 가능
		prop.put("초코파이", new Snack("초코맛", 600));
		
		System.out.println(prop);
		
		// 마찬가지로 get 메소드를 통해 key 값을 제시해서 value 값만 알아낼 수 있음
		System.out.println(prop.get("초코파이"));
		
		// > HashMap 과 전반적인 사용 방법이 비슷하다!!
		*/
		
		// Properties 는 보통 String, String 으로 고정해서 씀!!
		// > 애초에 String, String 으로 데이터를 추가해주는 별도의 메소드가 존재
		// >       String 타입의 key 를 제시하면 String 타입의 vlaue를 리턴해주는
		//         별도의 메소드 또한 존재함!!
		
		// 1. setProperty(String key, String value)
		// : key + value 세트를 모두 String 타입으로 추가해주는 메소드
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "Properties");
		
		
		System.out.println(prop);
		
		// > Properties 에 담긴 데이터를 "파일 입출력" 해주는 별도의 메소드가 존재
		
		// 2. Properties 객체에 담긴 내용물을 파일로 "내보내기" (출력)
		// prop.store(OutputStream os, String comments)
		try {
			prop.store(new FileOutputStream("test.properties"), "Properties Test");
			// 3. Properties 객체에 담긴 내용물을 xml 파일로 "내보내기" (출력)
			// storeToXML(OutputStream os , String comments)
			prop.storeToXML(new FileOutputStream("test.xml"), "Properties Test");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
