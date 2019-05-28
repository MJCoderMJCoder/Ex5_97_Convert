package com.convert;

class D extends C {
	int n = 12;
	int w;
	void g() {
		System.out.println("子类重写方法g(), n=" + n + " m=" + m);
	}
	void cry() {
		System.out.println("子类新增的方法");
	}
}
