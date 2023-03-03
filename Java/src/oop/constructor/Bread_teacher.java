package oop.constructor;

public class Bread_teacher {
	
	int price;
	String name;
	String ingredient;
	
	Bread_teacher() {}
	
	Bread_teacher(String bName, String bIngredient, int bPrice) {
		name = bName;
		ingredient = bIngredient;
		price = bPrice;
	}
	
	void info() {
		System.out.println("*** 빵 정보 ***");
		System.out.println("빵 이름: " + name);
		System.out.println("빵 가격: " + price);
		System.out.println("주 재료: " + ingredient);
	}

}
