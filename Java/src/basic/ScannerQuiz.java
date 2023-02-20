package basic;

import java.util.Scanner;

public class ScannerQuiz {

	public static void main(String[] args) {
		
		/*
		 - 스캐너를 사용하여 이름과 나이를 입력받아서
		 
		 이름 : XXX
		 나이 : XXX세
		 출생년도 : XXXX년
		 
		 을 출력하세요. (출력 함수는 마음대로 사용해서 출력하시고 출생년도는 입력사항이 아닙니다.)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하시오 : ");
		String name = sc.next();
		
		System.out.print("나이를 입력하시오 : ");
		int age = sc.nextInt();
		
		int year = 2023 - age + 1;
		
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "세");
		System.out.println("출생년도 : " + year + "년");
		
		System.out.println("--------------------------------------------------------------------------------");
		System.out.printf("이름 : %s\n나이 : %d세\n출생년도 : %d년",name,age,year);
	}
}
