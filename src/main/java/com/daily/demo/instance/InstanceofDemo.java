/**
 * 
 */
package com.daily.demo.instance;

/**
 * ************************************************************************
 * @ClassName:	 InstanceofDemo.java 
 * @Description: 
 * @author: lihuajie
 * @date:    2019年1月30日 下午3:31:41     
 * @Copyright: 2018 www.yunzhi.com Inc. All rights reserved. 
 *************************************************************************
 */
public class InstanceofDemo {
	public static void main(String[] args) {
		/**
		 *object instaceof Class
		 *判断object是否是Class类的一个实例/或者是该Class类子类的实例
		 */
		Father f = new Father();
		Son s = new Son();
//		s是Father类的子类Son的一个实例
		System.out.println(s instanceof Father);//true
//		s是Son类的一个实例
		System.out.println(s instanceof Son);//true
//		f既不是类Son的实例，也不是Son子类的一个实例
		System.out.println(f instanceof Son);//false
	}
}
