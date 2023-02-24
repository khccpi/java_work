package basic.loop.break_;

import java.util.Scanner;

public class BreakQuiz01 {

	public static void main(String[] args) {

		/*
		 1. 2가지의 정수를 1~100 사이의 난수를 발생시켜서 지속적으로 문제를 출제한 후 정답을 입력 받으세요.
		    사용자가 0을 입력하면 반복문을 탈출시키세요.
		 2. 종료 이후에 정답 횟수와 오답 횟수를 각각 출력하세요.
		 */

		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		
		System.out.println("*** 연산 퀴즈 ***");		
		
		while(true) {
			int rn1 = (int)(Math.random()*100 + 1);
			int rn2 = (int)(Math.random()*100 + 1);
			int rn3 = (int)(Math.random()*2);
			String op;
			if (rn3 == 0) {
				op = "+";
			} else {
				op = "-";
			}
			System.out.println("# 종료하시려면 0을 입력해 주세요.");
			System.out.printf("문제 : %d %s %d = ???\n",rn1,op,rn2);
			System.out.print("> ");
			int answer = sc.nextInt();
			
			if(rn3 == 0) {
				if(answer == (rn1 + rn2)) {
					System.out.println("정답입니다!\n\n");
					a++;
				} else if (answer == 0) {
					System.out.println("종료합니다.");
					System.out.printf("정답 : %d 개,   오답 : %d 개",a,b);
					break;
				} else {
					System.out.print("오답입니다.\n\n");
					b++;
				}
			} else {
				if(answer == (rn1 - rn2)) {
					System.out.println("정답입니다!\n\n");
					a++;
				} else if (answer == 0) {
					System.out.println("종료합니다.");
					System.out.printf("정답 : %d 개,   오답 : %d 개",a,b);
					break;
				} else {
					System.out.print("오답입니다.\n\n");
					b++;
				}
			}
		}
		sc.close();
	}

}
