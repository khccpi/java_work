package basic.loop.while_;

import java.util.Scanner;

public class WhileQuiz02 {

	public static void main(String[] args) {
		
		// 입력받은 수의 약수의 총합을 구하세요.
		// ex) 입력받은 값 12 -> 1 2 3 4 6 12 -> 28
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하시오. : ");
		int a = sc.nextInt();
		int b = 1;
		int c = 0;
		
		while(b <= a) {
			if(a%b == 0) {
				System.out.printf("%d ",b);
				c += b;
			}
			b++;
		}
		System.out.println("");
		System.out.println("약수의 총합 : " + c);
		sc.close();
	}
}
