package com.kh.chap02_set.part01_hashSet.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.kh.chap02_set.part01_hashSet.model.vo.Student;

public class SetRun {

	// HashSet 사용방법
	
	public static void main(String[] args) {
	
		// 제네릭 설정 X
		// HashSet 객체 먼저 생성
		HashSet hs1 = new HashSet();
		
		
		// 1. add(추가할값)
		hs1.add("반갑습니다.");
		hs1.add(new String("반갑습니다."));
		hs1.add(new String("여러분"));
		hs1.add(new String("안녕하세요."));
		hs1.add(new String("여러분"));
		hs1.add(50);
		System.out.println(hs1); // [안녕하세요., 여러분, 반갑습니다.]
		
		// > 저장되는 데이터의 순서 유지 X, 중족 저장 X
		//   제네릭 설정을 안했을경우 아무 타입이나 다 저장 가능
		
		// 2. size() 
		System.out.println("hs1 의 크기 : " + hs1.size());
		
		// 3. remove(삭제할값)
		hs1.remove("여러분");
		System.out.println(hs1);
		
		
		// 4. clear()
		
		hs1.clear();
		
		System.out.println(hs1);
		
		System.out.println("hs1 의 크기 : " + hs1.size());
		
		// 5. isEmpty()
		System.out.println("hs1 이 비어있습니까 : " + hs1.isEmpty());
		
		// > Set 계열 또한 유용한 메소드들이 많지만,
		//   대부분 List 계열과 메소드 사용법이 거의 비슷하다.
		// 왜? Set, List 계열 모두 Colletion 인터페이스 계열 자식들이기 떄문
		
		System.out.println("--------------------------");
		
		// 제네릭 설정 O
		
		HashSet<Student> hs2 = new HashSet<>();
		// hs2.add("시작");
		
		hs2.add(new Student("이민호",37,100));
		hs2.add(new Student("김갑생",26,40));
		hs2.add(new Student("홍길동",24,68));
		hs2.add(new Student("이민호",37,100));
		System.out.println(hs2);
		// > 저장 순서 유지 X, 중복 저장 O
		//   제네릭을 설정했기 때문에 같은 타입만 저장됨!!
		
		// 왜 ? 중복 저장이 되었는가?
		// > 동일한 객체로 판단이 되지 않아서 중복 저장됨!!
		// * HashSet 은 값이 추가될 떄
		// equals(), hashCode() 메소드를 통해
		// 동일한 데이터가 있는 없는지 검사 후 add 해줌
		
		// HashSet 에 객체를 담을 때
		// 내부적으로 equals() 로 비교 - 주소값 동등비교
		// +
		// 내부적으로 각 hashCode() 값이 일치하는지도 비교 - 주소값 동등비교
		// > 즉, "주소값"을 기준으로 중복판별을 한다!!
		
		// 객체의 각 필드값이 일치하면
		// 동일한 객체로 판별이 되서 중복저장이 안되게끔 하고싶을 경우?
		// > eqauls(), hashCode() 메소드를 오버라이딩 하기!!
		
		// 기존 Object 클래스의 메소드
		// - equals() : 주소값 동등비교
		// - hashCode() : 주소값 십진수로
		
		// Student 클래스 메소드 오버라이딩
		// - equals() : 내용물 동등비교
		// - hashCode() : 내용물을 십진수로
		
		// > VO 클래스 작성 시
		//   해당 VO 타입으 ㅣ객체를 가지고 HashSet 에 저장할 일이 있다면
		//   필드값을 기준으로 동등비교 하는 equals 와
		//   필드값을 기준으로 동작하는  hashCode 메소드를
		//   오버라이딩 해서 쓰는 것을 권장함
		// > 만약 HashSet 에 저장할 일이 없다면
		//   굳이 오버라이딩 안해도 됨!! (필수는 아님)
		
		System.out.println("------------------------------");
		
		// Set 에 들어있는 데이터에 "순차적" 으로 접근하고자 할때 ?
		
		// Set : 무작위 객체 저장되어있음 (즉 , index 개념이 없음)
		// > 일반 for문 사용 불가
		// 1. 향상된 for문 사용 가능 (foreach문)
		// for(변수선언문 : 셋명)
		// > 구문 표현법 어디에도 index 에 대한 언급이 없기 때문에 사용 가능
		for(Student s : hs2) {
			System.out.println(s);
		}
		
		System.out.println("----------------------------");
		
		// 2. 기존 Set 에 저장된 데이터를 ArrayList 로 옴겨준 후
		// 해당 ArrayList 기준으로 일반 for문을 돌리는 방법
		
		// Set 의 데이터를 List로 옮기는 방법
		// 1) 빈 ArrayList 객체 생성 후 addAll 메소드롤 활용
		// ArrayList<Student> list = new ArrayList<>();
		// list.addAll(hs2);
		// > 빈 리스트 생성 후 addAll 로 통째로 데이터 추가
		
		
		// 2) ArrayList 객체 생성 시 매개변수 생성자를 이용
		ArrayList<Student> list = new ArrayList<>(hs2);
		// > 처음부터 데이터가 추가된 채로 객체 생성
		
		for(int i =0; i <list.size(); i++) {
			
			System.out.println(list.get(i));
			
		}
		System.out.println("----------------------------");
		
		// 3. HashSet 클래스에서 제공하는 Iterator(반복자)를 이용하는 방법
		
		// 3_1. > hs2 에 담겨있는 객체들을 Iterator (반복자) 에 옮겨 담기
		Iterator<Student> it = hs2.iterator();
		
		// 3_2. Iterator (반복자) 를 통해서 반복 돌리
		// > 더 이상 뽑아낼 데이터가 없을 때 까지 반복!!
		
		// Iterator 객체에서 제공하는 더이상 뽑을 데이터가 있는지 검사해주는 메소드
		// > it.hasNext() : 뽑을 데이터가 있으면 true / 없으면 false 반환
		while(it.hasNext()) {
			// 뽑아낼데이터가 있다면
			// > it.next() : 데이터를 뽑아주는 메소드
			System.out.println(it.next());
			
		}
		//	System.out.println(it.next());
		// > 더이상 뽑아낼 데이터가 없는데도 데이터를 뽑고자 한다면
		// NoSuchElementException 오류 발생
		// * Iterator 의 동작 원리
		// > String의 StringTokenizer 와 비슷!!
		
		
		// * .iterator() 메소드
		// > List 계열과 Set 계열 모두 사용할 수 있는 메소드
		//  (Collection 계열에서는 사용 가능)
		// > Map 계열에서는 사용 불가!!
		
		
	}

}
