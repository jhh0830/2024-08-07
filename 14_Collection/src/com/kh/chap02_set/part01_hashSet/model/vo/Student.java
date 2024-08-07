package com.kh.chap02_set.part01_hashSet.model.vo;

import java.util.Objects;

public class Student {

	
	// 필드부
	private String name; // 이름
	private int age; // 나이
	private int score; // 점수
	
	// 생성자부
	public Student() {
		
	}

	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
@Override
	public int hashCode() {
		return Objects.hash(age, name, score);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && Objects.equals(name, other.name) && score == other.score;
	}
	
	//hashCode 메소드 오버라이딩 - 필드 내용을 기준으로 십진수화
	/*
	public int hashCode() {
		
		// 이미 String 클래스의 hashCode가 내용물 기준으로 십진수화 해줌!!
		// "이민호37100".hashCode();
		
		return (name+age+score).hashCode();
		
	}*/
	
	
}
