package com.amazon.main;

import java.util.ArrayList;
import java.util.List;

public class PassByReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PassByReference passByReference = new PassByReference();
		
		System.out.println(passByReference.list);
		List<Integer> list3 = passByReference.setI(3);
		System.out.println(passByReference.list);
		list3.add(5);
		System.out.println(passByReference.list);
	}

	Integer i;
	List<Integer> list = new ArrayList<>();

	public Integer getI() {
		return i;
	}

	public List<Integer> setI(Integer i) {
		List<Integer> list2 = list;
		this.i = i;
		list2.add(i);
		
		return list2;
	}

}
