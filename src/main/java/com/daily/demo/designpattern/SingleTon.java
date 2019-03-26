package com.daily.demo.designpattern;

/**
 * 饿汉式
 * @author lihuajie
 * @2019年3月26日下午4:21:46
 */
class SingleTon {
	//构造函数私有
	private SingleTon() {};
	//直接创建对象，
	private static SingleTon single = new SingleTon();
	//对外提供访问的公共方法
	public SingleTon getInstance() {
		return single;
	}
}

class SingleTon2{
	//构造函数私有
	private SingleTon2() {};
	//先不创建对象
	private static SingleTon2 single2 = null;
	//提供公共方法
	public SingleTon2 getInstance2() {
		if(single2 == null) {
			//相比饿汉式，这样虽然节省了空间，但是多线程时不能保证对象的唯一性
			single2 = new SingleTon2();
		}
			return single2;
	}
}

