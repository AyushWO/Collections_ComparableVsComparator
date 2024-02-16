package com.collections.bleVsTor;

public class Emp implements Comparable<Emp>{
	private String name;
	private String phone;
	private int empId;
	
	//for single sorting logic(Like compare with id only or name only or phone only), we'll use comparable
	//for multiple sorting logic(Like compare with id and name and phone), we'll use comparator(See Emp1)
	@Override
	public int compareTo(Emp o) {
		// TODO Auto-generated method stub
		return this.empId - o.empId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public Emp(String name, String phone, int empId) {
		super();
		this.name = name;
		this.phone = phone;
		this.empId = empId;
	}
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Emp [name=" + name + ", phone=" + phone + ", empId=" + empId + "]";
	}
}
