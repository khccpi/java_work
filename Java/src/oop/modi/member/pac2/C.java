package oop.modi.member.pac2;

import oop.modi.member.pac1.A;

public class C {

	public C() {
	
		A a = new A();
		a.x = 1; // public 이니까
	 // a.y = 2; (x) default 이니까
	 // a.z = 3; (x) private 이니까
		
		a.method1();
	 // a.method2(); (x) default 이니까
  	 // a.method3(); (x) private 이니까
		
	}
	
}
