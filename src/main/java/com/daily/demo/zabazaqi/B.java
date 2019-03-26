package com.daily.demo.zabazaqi;

public class B {
	public static void main(String[] args) {
		A a1=new A(); 
		A a2=new A(); 
		a1.I=1; 
		a2.I=1; 
		System.out.println(a1==a2); 
		a1=a2; 
		a1.I=5; 
		System.out.println("a2.I="+a2.I); 
		System.out.println(a1!=a2); 
	}
}
