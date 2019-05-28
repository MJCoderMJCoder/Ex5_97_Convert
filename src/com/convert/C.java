package com.convert;

class C {
	int m;
	double n;		//c.n：修改的是父类引用的被隐藏的变量
	void f() { 
		System.out.println("被子类继承的方法f()");
	}
	void g() {
		System.out.println("你好， n=" + n + " m=" + m);
	}
}
