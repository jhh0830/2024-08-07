package com.kh.chap03_map.part01_hashMap.model.vo;

public class Snack {

	// 필드부 - 제품명, 맛 , 칼로리
	private String flavor;
	private int calory;
	// > 제품명은 이따가 HashMap 에 저장할 때 키값으로 표현할 예정!!
	
	public Snack() {
		
	}

	public Snack(String flavor, int calory) {
		super();
		this.flavor = flavor;
		this.calory = calory;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getCalory() {
		return calory;
	}

	public void setCalory(int calory) {
		this.calory = calory;
	}

	@Override
	public String toString() {
		return "Snack [flavor=" + flavor + ", calory=" + calory + "]";
	}
	
}
