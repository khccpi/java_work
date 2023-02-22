package basic.loop;

public class WhileExample2 {

	public static void main(String[] args) {
		
		// 48 ~ 150 사이의 정수 중 8의 배수만 가로로 출력해 보세요.
		
		int n = 48;
		
		while(n <= 150) {
			if(n%8 == 0) {
				System.out.print(n + " ");
			} 
			n++;
		}
		
		System.out.println();
		
		// 1~100까지의 정수 중 4의 배수이면서 8의 배수는 아닌 수를 가로로 출력해 보세요.
		
		int x = 1;
		
		while(x <= 100) {
			if(x%4 == 0 && x%8 != 0) {
				System.out.print(x + " ");
			}
			x++;
		}
		
		System.out.println();
		
		// 1~30000까지의 정수 중 258의 배수의 개수를 출력.
		
		int a = 1;
		int b = 0; 
		
		while(a <= 30000) {
			if(a%258 == 0) {
				b++;
				//System.out.println(a + "," + b);
			}
			a++;
		}
		System.out.println("258의 배수의 개수는 : " + b + "개");
		
		// 1000의 약수의 개수를 구하세요.
		
		int c = 1;
		int d = 0;
		
		while(c <= 1000) {
			if(1000%c == 0) {
				d++;
			    //System.out.println(c + "," + d);
			}
			c++;
		}
		System.out.println("1000의 약수의 개수는 : " + d + "개");
	}
}
