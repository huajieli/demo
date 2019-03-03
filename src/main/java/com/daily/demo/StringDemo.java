/**
 * 
 */
package com.daily.demo;

import org.apache.commons.lang3.StringUtils;

public class StringDemo {
	public static void main(String[] args) {
		//两个参数用空格填充
		System.out.println( StringUtils.leftPad("abc", 8));
		//三个参数用最后一个填充
		System.out.println( StringUtils.leftPad("abc", 8, "*"));
		 
		System.out.println( StringUtils.center("adc", 8));
		System.out.println( StringUtils.center("abcde", 8,"*"));
		//厉害，忽略了00！！
		System.out.println(Long.valueOf("0038"));
	}
}
