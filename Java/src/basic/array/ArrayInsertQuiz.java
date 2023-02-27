package basic.array;

import java.util.Scanner;

public class ArrayInsertQuiz {

	public static void main(String[] args) {
		
		/*
        1. String 배열을 생성하세요. (foods)
        크기는 넉넉하게 50개로 지정하겠습니다.

        2. 사용자에게 음식 이름을 입력받아서 배열에
         삽입해 주세요.
         사용자가 음식 입력창에 '배불러' 라고 작성하면
         입력을 종료해 주세요.

        3. 입력이 종료되면 사용자가 입력한 음식을
        가로로 출력해 주세요. (null은 출력하지 마세요.)

		4. 입력을 받았는데 이미 배열에 존재하는 음식이라면 '이미 존재하는 음식입니다.'를 출력하고 다시 새로운 음식을 입력받을 수 있도록 출력하세요.
        */
	
		Scanner sc = new Scanner(System.in);
		
		String[] foods = new String[50];
		System.out.println("'배불러'를 입력하시면 종료됩니다.");
		for(int i=0; i<foods.length;i++) {
			System.out.println((i+1) + "번째 음식 이름을 적어주세요. ");
			System.out.print("> ");
			String food = sc.next();
			
			if(food.equals("배불러")) {
				System.out.println("입력을 종료합니다");
				break;
			}
			foods[i] = food;
		}
		
		System.out.println("---------------------------------------");
		System.out.print("내가 먹고 싶은 음식들 : ");
		for(String i : foods) {
			if(i == null) break;
			System.out.print(i + " ");
		}
		
		sc.close();
	}
}
