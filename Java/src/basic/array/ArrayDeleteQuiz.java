package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] kakao = {"무지", "네오", "어피치", "라이언", "춘식이"};
		System.out.println("현재 저장된 친구들 : " + Arrays.toString(kakao));
		System.out.println("삭제를 원하는 친구를 입력하세요 : ");
		String name = sc.next();
		
		/*
		 1. 삭제할 친구를 입력받아서 삭제를 진행해 주세요.
		 
		 2. 입력받은 이름이 없다면 없다고 얘기해 주세요.
		 */
		
		sc.close();
	}
}
