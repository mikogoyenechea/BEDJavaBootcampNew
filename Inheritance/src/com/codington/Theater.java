package com.codington;

public class Theater extends Building {
	
	private int area;

	public Theater(int area) {
		this.area = area;
	}

	@Override
	public void showEvents() {
		// TODO Auto-generated method stub
		System.out.println("Events ready to be hosted!!");
	}

	@Override
	public void showArea() {
		System.out.println("Theater area : " + area * 12);
	}
	
	

}
