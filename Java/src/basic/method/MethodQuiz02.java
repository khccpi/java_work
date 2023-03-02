package basic.method;

import java.util.Arrays;

public class MethodQuiz02 {
	
	static String[] foods = {"떡볶이", "치킨", "파스타"};
	
	// 배열의 맨 마지막 위치에 데이터를 추가하는 함수
	// 기존 배열보다 크기가 하나 큰 배열 선언해서 값 고대로 내기
	// 매개값으로 온 값을 마지막에 채우기.
	static void push(String newFood) {  // 가지고 와서 뭔가 하는게 없으니까!! 단순히 추가만 하는거니까 void지롱~!
		
	}

	// 배열 내부 데이터 단순 출력 함수
	static void printFood() {
		System.out.println(Arrays.toString(foods));
	}
	
	// 배열 내의 특정 음식의 위치를 찾아주는 함수
	static int indexOf(String targetName) {
		
	}
	
	// 특정 음식의 배열 포함 여부 (참/거짓)
	static boolean include(String targetName) {
		
	}
	
	// 특정 음식 제거 함수
	static void remove(String targetName) {
		
	}
	
	// 특정 음식 수정 메서드
	static void modify(int targetIdx, String newFood) {
		
	}
	
	public static void main(String[] args) {
		 
		printFood();
		push("라면");
		push("김치찌개");
		printFood();

		// 파스타의 인덱스를 알아내세요.
		
		// 김치찌개의 인덱스를 알아내세요.
		
		// 짜장면의 인덱스를 알아내세요. -> -1을 리턴하시면 됩니다.
		
		remove("김치찌개");
		remove("망고"); // 존재하지 않는 음식명입니다. 출력.
		
		// 라면의 존재 여부
		
		// 양념치킨의 존재 여부
		
		// 2번 인덱스 데이터를 닭갈비로 수정.
		
	}

}
