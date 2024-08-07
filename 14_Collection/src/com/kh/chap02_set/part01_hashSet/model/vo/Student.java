package com.kh.chap02_set.part01_hashSet.model.vo;

import java.util.Objects;

public class Student {

	
	// �ʵ��
	private String name; // �̸�
	private int age; // ����
	private int score; // ����
	
	// �����ں�
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
	
	//hashCode �޼ҵ� �������̵� - �ʵ� ������ �������� ������ȭ
	/*
	public int hashCode() {
		
		// �̹� String Ŭ������ hashCode�� ���빰 �������� ������ȭ ����!!
		// "�̹�ȣ37100".hashCode();
		
		return (name+age+score).hashCode();
		
	}*/
	
	
}
