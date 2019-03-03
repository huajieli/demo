/**
 * 
 */
package com.daily.demo.listdemo;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * ************************************************************************
 * @ClassName:	 ListTest.java 
 * @Description: 
 * @author: lihuajie
 * @date:    2019年2月15日 上午10:10:16     
 * @Copyright: 2018 www.yunzhi.com Inc. All rights reserved. 
 *************************************************************************
 */
public class ListTest {
	/*@Test
	public void test1() {*/
	
	public static void main(String[] args) {
	/**
	 * list.size()和list.isEmpty();
	 */
	List<Object> list = new ArrayList<Object>();
	/**
	 * list.size()!=0 说明该list集合中有对象存在，但是可能对象为null
	 * list.isEmpty()同样是判断集合中是否有对象
	 * 
	 * 源码：可知isEmpty()也是通过判断size来判断集合中是否有对象存在
	 *   public boolean isEmpty() {
        	return size == 0;
    		}
	 * 
	 */
	System.out.println(list.size());//0
	list.add(null);
	//list.add("test");
	System.out.println(list.size());//1
	if(list.size()!=0) {//size为1
		System.out.println("集合中有对象，但是不知道对象是否是null");
		}	
	
	if(!list.isEmpty()) {//list.isEmpty()为false
		System.out.println("集合中不为空");
	}
	
	}
}
