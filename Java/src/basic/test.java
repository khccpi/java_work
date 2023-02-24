package basic;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
	
		 /*
		 2. 구구단을 다음과 같이 세로로 출력해 보세요.
		 각 단의 간격은 탭 하나로 고정하겠습니다.
		 2단         3단
		 2x1=2      3x1=3
		 2x2=4      3x2=6
		 2x3=6      3x3=9
		 .
		 .
		 .	 
		 */
		
		/*
		for(int i=0; i<=9;i++) {
			for(int j = 2; j<=9; j++) {
				if(i==0) {
					System.out.printf("%d단\t",j);
				} else {
					System.out.printf("%d*%d= %d\n",j,i,(j*i));
				}
			}
		}
		*/
		
		/*
        1. String 배열을 생성하세요. (foods)
        크기는 넉넉하게 50개로 지정하겠습니다.

        2. 사용자에게 음식 이름을 입력받아서 배열에
         삽입해 주세요.
         사용자가 음식 입력창에 '배불러' 라고 작성하면
         입력을 종료해 주세요.

        3. 입력이 종료되면 사용자가 입력한 음식을
        가로로 출력해 주세요. (null은 출력하지 마세요.)

        */
		
		String[] foods = new String[50];
		System.out.println("gd");
		Scanner sc = new Scanner(System.in);
		
		
		for(int f = 0; f<foods.length; f++) {
			System.out.println((f+1) + " 번째 먹고 싶은 음식은? ");
			System.out.print("> ");
			String food = sc.next();
			
			if(food.equals("배불러"))  {
				System.out.println("입력을 중지합니다.");
				break;
			}
			foods[f] = food;
		}
		
		sc.close();
	}
}