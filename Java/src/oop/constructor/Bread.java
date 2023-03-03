package oop.constructor;

public class Bread {

	String name;
	int price;
	String ingredient;
	
	void info( ) {
		System.out.println("*** 빵 정보 ***");
		System.out.println("빵이름 : "+ name);
		System.out.println("가격 : " + price + " 원");
		System.out.println("성분 : " + ingredient);
	}
	
	Bread() {
		name = "피자빵";
		price = 500;
		ingredient = "밀가루"; 
	}
	
	Bread(String pName, int pPrice, String pIngredient) {
		name = pName;
		price = pPrice;
		ingredient = pIngredient;
	}
}
