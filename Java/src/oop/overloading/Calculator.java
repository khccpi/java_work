package oop.overloading;

public class Calculator {
	
	/*
	 # 오버로딩 (중복) : 하나의 클래스 내부에서 같은 이름을 가진 메서드나 생성자를 여러개 중복해서 선언할 수 있게 해주는 문법.
	  
	 - 오버로딩 적용 조건 : 
	   1. 매개 변수의 데이터 타입이 다를 것! 이거나~
	   2. 매개 변수의 전달 순서가 다를 것! 이거나~
	   3. 매개 변수의 개수가 다를 것!
	 */
	
	void inputData() {}
	
	void inputData(int a) {}
	
	void inputData(int a, int b) {}
	
	void inputData(int a, int b, int c) {}

//	void inputData(int b, int a) {} // (x) 이미 int 두개 위에 있음.
	
	void inputData(String s) {}
	
	void inputData(int a, double d) {}
	
	void inputData(double d, int a) {}
	
//	void inputData(int number) {} (x) 정수 매개값 1개를 받는 메서드가 이미 선언됨.
	
//	int inputData(int number) {
//		return 0;                 (x) 반환 유형(return type)은 오버로딩에 영향을 미치지 못합니다.
//	}
	
	void calcRectArea1(int a) {
		System.out.printf("%d의 정사각형 넓이는 : %d\n",a,a*a);
	}
	
	void calcRectArea1(int a, int b) {
		System.out.printf("%d와 %d의 넓이는 : %d\n",a,b,(a*b));
	}
	
	void calcRectArea1(int a, int b, int c) {
		System.out.printf("사다리꼴(%d,%d,%d)의 넓이는 : %d",a,b,c,(a+b)*c/2);
	}
	
	int calcRectArea2(int r) {
		return r * r;
	}
	
	int calcRectArea2(int width, int height) {
		return width * height;
	}
	
	double calcRectArea2(int ceil, int floor, int height) {
		return (ceil + floor) * height / 2.0;
	}
}
