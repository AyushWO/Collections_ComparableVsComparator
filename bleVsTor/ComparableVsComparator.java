package com.collections.bleVsTor;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableVsComparator {
	//for single sorting logic(Like compare with id only or name only or phone only), we'll use comparable
	//for multiple sorting logic(Like compare with id and name and phone), we'll use comparator(See Emp1)

	public static void main(String[] args) {
		/*
		normal Sorting
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(45);
		arr.add(81);
		arr.add(67);
		arr.add(37);
		arr.add(8);
		System.out.println(arr);
		
		Collections.sort(arr);
		
		System.out.println(arr);
		
		
		*/
		
		
		
		
		
		/*
		Comparable: for custom objects comparision using single sorting logic
		
		ArrayList<Emp> emps = new ArrayList<Emp>();
		emps.add(new Emp("XYZ","123456789",12));
		emps.add(new Emp("ABC","135791357",5));
		emps.add(new Emp("XYZABC","246824682",44));
		System.out.println(emps);
		Collections.sort(emps);
		System.out.println(emps);
		*/
				
		
		
		
		
//      Comparator: for custom objects comparision using multiple sorting logic
		
		ArrayList<Emp> emps = new ArrayList<Emp>();
		emps.add(new Emp("XYZ","123456789",12));
		emps.add(new Emp("ABC","135791357",5));
		emps.add(new Emp("CYZABC","246824682",44));
		System.out.println(emps);
		
		Collections.sort(emps, new Emp1());
		System.out.println(emps);  //Comparable with emp.id
		
		ArrayList<Emp> emps1 = new ArrayList<>(emps);
		Collections.sort(emps1, new Emp2());
		System.out.println(emps1); //Comparable with emp.name
		

	}
}
