package com.kh.chap03_map.part02_properties.run;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest2 {

	public static void main(String[] args) {
		
		Properties prop = new Properties(); // 비어있는 상태
		
		System.out.println(prop);
		try {
		
		// 4. properties 형식의 파일로부터 데이터를
		// key + value 형식으로 "읽어들여서" Properties 객체에 차곡차곡 담아주는 메소드 (입력)
		// Properties 객체에 차곡차곡 담아주는 메소드 (입력)
		// load(InputStream is)
		
			//prop.load(new FileInputStream("test.properties"));
			// 5. .xml 형식의 파일로부터 데이터를
			// key + value 형식으로 "읽어들여서"
			// Properties 객체에 차곡차곡 담아주는 메소드 (입력)
			// loadFromXML(InputStream is)
			prop.loadFromXML(new FileInputStream("test.xml"));
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 잘읽어졋나 확인
		// System.out.println(prop);
		
		// 6. getProperty(String key) : String value
		// : Properties 에 저장된 데이터 중 전달된 String key 에 해당되는
		//   String value 값을 리턴해주는 메소드
		System.out.println(prop.getProperty("List"));
		System.out.println(prop.getProperty("Set"));
		System.out.println(prop.getProperty("Map"));
		System.out.println(prop.getProperty("Collection"));
		
		
		
		
		
		
	}

}

/*
 * * .properties 파일
 * 해당 프로그램이 기본적으로 가져야 하는 정보들을 보통
 * .properties 형식의 파일로 저장해둔다. (보통 "환경설정" 과 관련된 값들)
 * key, value 모두 문자열이기 때문에 Properties 객체와 함께 유용하게 사용가능!!
 * > key, value 모두 일반 텍스트 문자열이기 때문에 개발자가 아닌
 * 	 일반 관리자 입장에서 환경설정값을 다루기 쉬워짐
 * * .xml 파일
 * 방대한 데이터를 "구조화된 (<태그>로 감싸서) " 형식으로 저장하기 위한 파일
 * 다양한 프로그래밍 언어 간에 호환이 쉽다.
 * > .properties 파일과 차이점이라고 한다면
 * 	 properties 파일은 한줄짜리 밸류값만 표현 가능함!!
 * 	 xml 파일은 여러줄짜리 밸류값을 표현 가능함!!
 * > JDBC 파트에서 사용할 예정!!
 * 
 */
