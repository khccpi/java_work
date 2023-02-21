package basic;

import java.util.Scanner;

public class CelToFahr {
	
	public static void main(String[] args) {
		
		/*
		 사용자에게 섭씨온도를 입력받아서 화씨온도로 변환하여 출력하는 로직을 작성하세요.
		 화씨 온도는 소수점 첫째 자리까지 표현해 주시기 바랍니다.
		 # ㄹ 한자 7 -> (℃), ㄹ 한자 다음장 4 -> (℉)
		 */
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("섭씨 온도는 몇 ℃인가? : ");
		double cel = sc.nextDouble();
		System.out.println("섭씨 온도 = " + cel + " ℃");
		
		double fahr = (cel * 9/5) + 32;
		System.out.printf("화씨 온도 = %.1f ℉\n",fahr);
		
		System.out.println("--------------------------------------------------------------------------------");
		System.out.printf("섭씨 온도 = %.1f ℃,\t 화씨 온도 = %.1f ℉",cel,fahr);
		
		sc.close();
	}
}
