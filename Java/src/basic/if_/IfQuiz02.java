package basic.if_;

import java.util.Scanner;

public class IfQuiz02 {

	public static void main(String[] args) {
		
		/*
		 - 정수를 2개 입력 받아서, 두 정수 중 어느 수가 큰 지 혹은 같은지를 판별하시면 됩니다.
		 ex) 입력받은 수 : 4, 7  -> 7이 큰 수 입니다.
		     입력받은 수 : 10, 3 -> 10이 큰 수 입니다.
		     입력받은 수 : 5, 5  -> 같은 수 입니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하시오.");
		int a = sc.nextInt();
		
		System.out.print("두번째 숫자를 입력하시오.");
		int b = sc.nextInt();
		
		System.out.println("-------------------------------------------------");
		
		if(a > b) {
			System.out.print(a + " > " + b + " 이므로 " + a + "가 큰 수 입니다.");
		} else if(a < b) {
			System.out.printf("%d < %d 이므로 %d 가 큰 수 입니다.",a,b,b);
		} else {
			System.out.printf("%d = %d 이므로 같은 수 입니다.",a,b);
		}
		
		sc.close();
		
	}
}
