package com.daily.demo.zabazaqi;

import org.junit.Test;

/**
 * 
 * @author lihuajie
 * @2019年3月26日下午2:33:16
 */
 public class TryCatch {
	@Test
	public void test1() {
		System.out.println(tryTest());
	}
	
	public int tryTest() {
		try {
			int a = 1/0;
			return 1;
			} catch (Exception e) {
			return 2;
			}finally{
			 return 0;
			}
	}
	
	@Test
	public void test() {
		String str = "helloli";
		String str1="hello";
		String str2="li";
		String str3=str1+str2;
		//为啥结果是false;
		System.out.println("str==str3:"+str==str3);
		System.out.println("str==str3:"+str==str3.intern());
	}
}
