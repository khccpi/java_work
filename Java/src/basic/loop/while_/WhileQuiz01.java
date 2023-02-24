package basic.loop.while_;

import java.util.Scanner;

public class WhileQuiz01 {

	public static void main(String[] args) {
		
		/*
		 # 사용자에게 구구단 단수를 입력받아서 해당 단수의 구구단을 출력해 보세요.
		 ex)	구구단을 입력하세요 : 4
		 		*** 구구단 4 단 ***
		 		4 * 1 = 4
		 		4 * 2 = 4
		 		4 * 3 = 4
		 		4 * 4 = 4
		 		.
		 		.
		 		.
		 		4 * 9 = 36
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구구단을 입력하세요 : ");
		int a = sc.nextInt();
		int b = 1;
		System.out.printf("*** 구구단 %d 단 ***\n",a);
		
		while(b <= 9) {
			System.out.printf("%d * %d = %d\n",a,b,(a*b));
			b++;	
		}
		sc.close();
	}
}
