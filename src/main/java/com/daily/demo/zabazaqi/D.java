package com.daily.demo.zabazaqi;

import org.junit.Test;

/**
 * 一个源文件中可以定义多个类，但是如果某个类被定义成public
 * 则源文件必须与该类同名
 * @author lihuajie
 * @2019年3月24日上午9:46:22
 */
class C {
	public int I; 

}
class D {
	@Test
	public void test() {
		
		//局部变量需要初始化,否则11行编译报错
		int I2=0; 
		System.out.println(I2);
		
		C c =new C();
		System.out.println(c.I);
	}
	
	
}
