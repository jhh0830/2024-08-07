package com.kh.chap03_map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class MapRun {
	
	// HashMap 사용 방법
	public static void main(String[] args) {
		
		
		// 제네릭 X
		
		// HashMap 객체 먼저 생성
		HashMap hm1 = new HashMap();
		
		// 명심할 사항 : 계층구조를 보면 List 나 Set 계열은 Collection 을 구현한 클래스
		// > value 만 저장 가능, 데이터를 추가할 때 add 메소드 (다른메소드 또한 사용법 비슷)
		
		// 단, Map 은 아니다.
		// > key + value 구조로 저장, 데이터를 추가할 때 put 메소드
		//  (메소드 사용 방법도 아예 다름)
		
		// K : Key == Object
		// V : Value == Object
		// > 제네릭 설정을 하지 않았기 떄문
		
		// 1. put(K key, V value)
		// : Map 공간에 key + value 세트로 데이터를 추가해주는 메소드
		hm1.put("123", "첫번째 밸류");
		hm1.put(9, 1.234);
		hm1.put('a', "첫번째 밸류");
		hm1.put("123", "두번째 밸류");
		// > 같은 키값으로 또 put을 해버리면 마지막으로 put 된 데이터로 덮어씌워짐
		System.out.println(hm1);
		
		
		// > 항상 key + value 형식으로 데이터 보관
		//   value 는 중복값 허용 O, key는 중복값 허용 X
		//   저장순서 유지 X
		// > 마찬가지로 제네릭 설정을 안했을 경우 아무 타입이나 다 들어갈수있다!! 
		System.out.println("--------------------------------------");
		// 제네릭 o
		
		// *Map 계열의 제네릭을 설정할 경우
		// 각각 Key 에 대한 타입과 Value 에 대한 타입 각각 지정해야한다.
		
		HashMap<String, Snack> hm2 = new HashMap<>();
		
		// K == String
		// V == Snack
		
		// 1. put(K key, V value)
		// : Map 공간에 데이터를 key + value  형식으로 추가해주는 메소드
		hm2.put("빅파이", new Snack("초코딸기맛",200));
		hm2.put("칙촉", new Snack("초코칩맛", 150));
		hm2.put("크리스피롤", new Snack("고소한맛", 100));
		hm2.put("새우깡", new Snack("짠맛",500));
		// hm2.put(123, "아무거나"); 안댐
		
		System.out.println(hm2);
		
		// > 저장 순서 유지 X
		//   value 값이 동일하다고 해도 key 값이 동일하지 않으면 잘 저장됨
		//   제네릭 설정시 Key, Value 각각의 타입에 맞는 값만 들어감!!
		
		hm2.put("새우깡", new Snack("매운맛",700));
		
		System.out.println(hm2);
		// > 중복된 key 값의 value 값으로 덮어씌워짐!!
		
		// 2. get(Object key) : V
		// > Map 공간에서 해당 키 값의 value 값을 반환해주는 메소드
		System.out.println(hm2.get("빅파이"));
		
		Snack s = hm2.get("크리스피롤");
		System.out.println(s);
		// > 제네릭 설정을 하면 Map 또한 마찬가지로
		//   매번 일일이 자식타입으로 강제형변환을 안해줘도 됨!!
		
		
		System.out.println(hm2.get("초코파이"));
		// > 없는 키 값을 인자값으로 제시했을 경우 null 이 리런된다.
		
		// 3. size()
		// : Map 공간에 담겨있는 데이터의 갯수 반환
		System.out.println("size : " + hm2.size());
		
		// 4. replace(K key, V value)
		// : Map 공간의 해당 key 값을 찾아서 새로 전달된 value 로 변경시켜주는 메소드
		hm2.replace("새우깡", new Snack("겁나짠맛" , 1000));
		// > replace 는 단순히 기존의 키값이 존재할 떄 데이터를 수정해주는 역할!!
		// hm2.put("새우깡", new Snack("겁나짠맛", 1000));
		// > put은 원래 목적이 데이터를 추가해주는 열할이지 수정해주는 게 아님!!
		// (우연히 키값이 중복되었을 때 데이터가 변경되는 효과를 줄뿐 )
		System.out.println(hm2);
		
		// 5. remove(Object key)
		// : Map 공간으로부터 전달된 key 값을 찾아서 key + value 세트로 지워주는 메소드
		
		hm2.remove("새우깡");
		System.out.println(hm2);
		
		System.out.println("----------------------");
		
		// Map 에 들어있는 데이터들에 순차적으로 접근하고자 할 때?
		
		// Map 또한 일반적인 반복문 사용 불가 (index 개념이 없기 때문)
		
		// foreach 문 (향상된 for문)
		/*
		for(??? : hm2) {
			
		}
		*/
		// > Map 에는 key + value 세트로 들어가기 때문에 향상된 for문 사용 불가
		
		// List 와 Map 은 다른 계열이기 때문에
		// ArrayList 로 옮겨 담은 후 반복문 사용이 불가!!
		// ArrayList list = new ArrayList(hm2);
		//ArrayList list = new ArrrayList();
		//list.addAll(hm2);
		
		// Iterator (반복자) 를 이용하는 방법
		// > .iterator 는 List 나 Set 계열에서만 사용할 수 있는 메소드
		//Iterator it = hm2.iterator();
		
		// * 방법이 아예 없는건 아님!!
		// > Map 을 Set 으로 바꾼 후 아까 배웠던 방법 3가지를 적용
		
		// * Map 을 Set 으로 바꿔주는 메소드 (2개)
		// 1. keySet() 메소드를 이용하는 방법
		// > Map 공간에 담겨있는 key 값들만 뽑아서 Set 으로 옮겨줌!!
		
		// 1) hm2.keySet() 메소드 호출하기 - key 값만 뽑아서 Set 으로 옮기기
		Set<String> keySet = hm2.keySet();
		
		// 2) 향상된 for문을 쓰거나, ArrayList로 옮겨담은 후 일반 for문을 쓰거나,
		//    Iterator 를 써서 반복 돌리기
		//  - Iterator 써보기
		
		Iterator<String> itKey = keySet.iterator();
		
		while(itKey.hasNext()) {
			
			String key = itKey.next();
			Snack value = hm2.get(key);
			
			System.out.println("key : " + key + ", value" + value);
			
			
		}
		
		
		System.out.println("----------------------------------");
		
		// 2. entrySet() 메소드를 이용하는 방법
		// >  Entry : 집합 형태 (key + value 묶여있는 형태)
		
		// 1) hm2.entrySet() 메소드 호출하기 -(key + value) 형태로 Set 으로 옮겨짐
		Set<Entry<String , Snack>> entrySet = hm2.entrySet();
		
		// 2) Iterator 를 이용해서 반복 돌리기
		Iterator<Entry<String, Snack>> itEntry = entrySet.iterator();
		
		while(itEntry.hasNext()) {
			Entry<String, Snack> entry = itEntry.next();
			
			String key = entry.getKey();
			Snack value = entry.getValue();
			
			System.out.println("key : " + key + ", value" + value);
			
		}
		
		
	}

}
