package oop.string;

import java.util.Scanner;

public class StringQuiz02 {

	public static void main(String[] args) {
		
		/*
		 1. 주민등록번호 13자리를 입력받습니다.
		 2. 주민등록번호 - 을 포함해서 받을 예정입니다.
		 3. 13자리가 아니라면 다시 입력받습니다.
		 4. 남자인지 여자인지를 구분해서 출력해 주시면 됩니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		outer:while(true) {
			System.out.println("주민번호를 입력하세요");
			System.out.print("> ");
			String num = sc.nextLine().replace("-", "");
			// int num1 = Integer.parseInt(num); 
			// System.out.println("num : " + num);
			
			if(num.length()!=13) {
				continue;
			} else {
				if(num.charAt(6)=='1' || num.charAt(6)=='3') {
					System.out.println("남자");
					break outer;
				} else if(num.charAt(6)=='2' || num.charAt(6)=='4') {
					System.out.println("여자");
					break outer;
				} else {
					System.out.println("다시 입력하세요.");
				}
				break;
			}
		}		
		sc.close();
	}
}