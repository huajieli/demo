package com.daily.demo.zabazaqi;

import org.junit.Test;

public class Temp1 {
	@Test
	public void test() {
		int arr[]= {3,2,4,1,3,8,7};
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int s=arr[i];
					arr[i]=arr[j];
					arr[j]=s;
				}
			}
		}
		
		for(int a:arr) {
			System.err.print(a+",");
		}
	}
	
	
	@Test
	public void test2() {
		int arr2[]= {83,6,473,28,56,30,8};
		for(int i=0;i<arr2.length;i++) {
			for(int j=i;j<arr2.length;j++) {
				if(arr2[i]>arr2[j]) {
					int s=arr2[i];
					arr2[i]=arr2[j];
					arr2[j]=s;
				}
			}
	}
		
		for(int a:arr2) {
			System.out.print(a+" ");
		}
	}	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
