package com.collections.bleVsTor;

import java.util.Comparator;

public class Emp1 implements Comparator<Emp>{
	private String name;
	private String phone;
	private int empId;
	
	//for single sorting logic(Like compare with id only or name only or phone only), we'll use comparable
	//for multiple sorting logic(Like compare with id and name and phone), we'll use comparator
	
	@Override
	public int compare(Emp o1, Emp o2) {
		// TODO Auto-generated method stub
		return o1.getEmpId()-o2.getEmpId();
	}
}
