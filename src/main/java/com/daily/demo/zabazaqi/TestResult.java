package com.daily.demo.zabazaqi;
/**
 * 
 * @author lihuajie
 * @2019年3月28日上午8:43:47
 */
class TestResult {
	
	public static void main(String[] args) {
		//这里的str是一个对象
		String str = new String("test");
		char[] ch = {'a','b','c'};
		swith(str,ch);
		
		System.out.println(str+" "+ch[0]);//test g
}

	private static void swith(String str, char[] ch) {
		//原来不存在good,所以新建了一个对象
//		str = new String("good");
		str = "good";
		ch[0] = 'g';
		System.out.println(str+" "+ch[0]);//good g

	}
}
