package etc.api.lang.wrapper;

import java.util.Scanner;

public class ParseQuiz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		outer:while(true) {
			
			System.out.print("주민등록번호를 입력하세요 : ");
			System.out.print("> ");
			String str = sc.nextLine();
			String gender;
			if(!str.contains("-")) {
				System.out.println("하이픈을 포함시켜 주세요");
				continue outer;
			} else {
				if(str.length()!=14) {
					System.out.println("주민등록번호를 정수로 정확히 입력해 주세요.");
					continue outer;
				} else {
					switch(str.charAt(7)) {
					case '1' : case '3' :
						gender = "남자";
						//System.out.printf("남자 ");
						break;
					case '2' : case '4' :
						gender = "여자";
						//System.out.printf("여자 ");
						break;
					default :
					System.out.println("뒷자리 첫번째 숫자는 1, 2, 3, 4 중 하나여야 합니다.");
					continue outer;
					}
				}
			}			
			int year = Integer.parseInt(str.substring(0,2));
			int birthYear = 0;
			switch(str.charAt(7)) {
			case '1' : case '2' : case '5' : case '6' :
				birthYear = 1900 + year;
				break;
			case '3' : case '4' : case '7' : case '8' :
				birthYear = 2000 + year;
				break;
			default :
				break;
			}
			String month = str.substring(2,4);
			String day = str.substring(4,6);
			int age = 2023 - birthYear + 1;
			System.out.printf("%d년 %s월 %s일 %d세 %s\n",birthYear,month,day,age,gender);
			sc.close();
			break;
		}
	}

}