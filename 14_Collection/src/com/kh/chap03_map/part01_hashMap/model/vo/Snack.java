package com.kh.chap03_map.part01_hashMap.model.vo;

public class Snack {

	// �ʵ�� - ��ǰ��, �� , Į�θ�
	private String flavor;
	private int calory;
	// > ��ǰ���� �̵��� HashMap �� ������ �� Ű������ ǥ���� ����!!
	
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
