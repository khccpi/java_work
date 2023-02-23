package basic.loop;

import java.util.Scanner;

public class ForExample {

	public static void main(String[] args) {
		/*
		int i = 1;
		int total = 0;
		while(i <= 10) {
			total +=i;
			i++;
		}
		*/
		
		int e = 0;
		
		for(int i=1; i<=10; i++) {
			e += i;
		}
		
		// 1~200까지의 정수 중 6의 배수이면서 12의 배수는 아닌 수를 가로로 출력해 보세요. (for)
		
		for(int a=1; a<=200; a++) {
			if(a%6==0 && a%12!=0) {
				System.out.print(a + " ");
			}
		}
		
		System.out.println("------------------------------------");
		
		//1~60000까지의 정수 중 177의 배수의 개수를 구해보세요. (for)
		
		int b = 0;
		for(int i=1; i<=60000; i++) {
			if(i%177==0) {
				b++;
			}
		}
		System.out.println(b + "개");
		
		//입력받은 정수까지의 팩토리얼 값을 구하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 : ");
		int k = sc.nextInt();
		int t = 1;
		for(int i=1; i<=k; i++) {
			t *= i;
		}
		System.out.println(t);
		
		sc.close();
	}
}
