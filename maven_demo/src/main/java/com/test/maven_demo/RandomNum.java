package com.test.maven_demo;

public class RandomNum {

	String comp="1509613278653";
	public String random() {
		
		String number = String.valueOf(System.currentTimeMillis());
		
		if(comp.equals(number)) {		
			random();		
		}
		return number;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		RandomNum r1 = new RandomNum();
        System.out.println("unique number: "+r1.random());
		
	}
}

