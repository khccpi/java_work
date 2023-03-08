package oop.static_.method;

public class Count {

	public int a; // 인스턴스 변수
	public static int b; // 정저 변수
	
	/*
	 # 인스턴스 메서드 : 객체를 생성하여 주소값을 통해 접근한 후에 호출하는 메서드
	   인스턴스 메서드 안에서는 정적(static) 변수와 인스턴스 변수 모두를 참조할 수 있습니다.
	 */
	
	public int method1() {
		return this.a + Count.b;
	}
	
	/*
	 # 인스턴스 메서드: 객체를 생성하여 주소값을 통해 접근한 후 호출하는 메서드 ㅁ인스턴스 메서드 안에서는 정적(static) 변수와
	  인스턴스 변수 모두를 참조할 수 있습니다.
	 */
	
	public static int method2() {
		Count ccc = new Count();
		return ccc.a + Count.b;
	}
	
}
