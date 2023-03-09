package oop.inter.basic;

public class MainClass {

	public static void main(String[] args) {
		
		// 인터페이스는 객체를 생성할 수 없는 추상적인 개념입니다.
	 // Inter i1 = new Inter(); (X)
		
		System.out.println("상수 : " + Inter.NUM);
		Inter.staticMethod();
		
		ImplClass1 i1 = new ImplClass1();
		i1.method1();
		i1.method2();
		i1.method3();
		i1.parentMethod();
	}
}
