package basic.loop.for_;

public class ForQuiz01 {

	public static void main(String[] args) {
		
		// 2~19까지의 난수를 생성하셔서 구구단을 출력해 보세요. (for) 19행까지 출력하세요.
		
		int a = (int)(Math.random()*18+2);
		System.out.printf("난수 : %d\n",a);
		
		for(int i=1; i<=19 ; i++) {
			System.out.printf("%d * %d = %d\n",a,i,(a*i));
		}
	}
}
