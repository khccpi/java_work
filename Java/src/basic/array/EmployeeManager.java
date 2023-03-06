package basic.array;

import java.util.Scanner;

public class EmployeeManager {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 사원의 정보 : 사번, 이름, 나이, 부서명
		String[] userNums = new String[100];
		String[] names = new String[100];
		int[] ages = new int[100];
		String[] departments = new String[100];
		
		// 실제로 입력된 데이터(사원의 정보)의 개수를 체크하는 변수.
		int count = 0;
		
		while(true) {
			
			System.out.println("\n======== 사원 관리 프로그램 ========");
			System.out.println("# 1. 사원 정보 신규 등록");
			System.out.println("# 2. 모든 사원 정보 보기");
			System.out.println("# 3. 사원 정보 검색");
			System.out.println("# 4. 사원 정보 수정");
			System.out.println("# 5. 사원 정보 삭제");			
			System.out.println("# 6. 프로그램 종료");			
			System.out.println("================================");
			System.out.println("실행할 작업 번호를 입력하세요");
			System.out.print("> ");
			int menu = sc.nextInt();
			
			if(menu == 1) { ////// 사원 정보 신규 등록 //////
				// 사원 정보 4가지를 입력받아 각 배열에 저장하는 코드를 작성.
				// 사원은 중복하면 안됩니다.
				// (무한루프를 구현해서 사번 중복이 발생하면 다시 입력 받기)
				outer:for(int i=0; i<userNums.length; i++) {
					System.out.printf("%d번째 등록할 사번을 입력하세요.\n",i+1);
					System.out.println("'그만'을 입력하시면 종료됩니다.");
					System.out.print("> ");
					String userNum = sc.next();
										
					if(userNum.equals("그만")) {
						System.out.println("등록을 종료합니다.");
						break;
					}
					
					for(int j=0; j<userNums.length; j++) {
						if(userNum.equals(userNums[j])) {
							System.out.println("이미 존재하는 사번입니다.");
							i--;
							continue outer;
						} else {  // 4가지 입력 받아서 등록하기!
							continue;
						}
					}
					userNums[i] = userNum;
					count++;
					
					System.out.println("등록할 이름을 입력하세요");
					System.out.print("> ");
					String name = sc.next();
					names[i] = name;
					
					System.out.println("등록할 나이을 입력하세요");
					System.out.print("> ");
					int age = sc.nextInt();
					ages[i] = age;
					
					System.out.println("등록할 부서명을 입력하세요");
					System.out.print("> ");
					String department = sc.next();
					departments[i] = department;
					
					System.out.printf("%d번째 사원등록을 완료하였습니다.\n",i+1);
					System.out.printf("<<<%d번째 사원정보>>>\n- 사번 : %s\n- 이름 : %s\n- 나이 : %d 세\n- 부서명 : %s\n\n",i+1,userNums[i],names[i],ages[i],departments[i]);
				}
			} else if(menu == 2) { ////// 모든 사원 정보 보기 //////
				// 각 배열을 반복문을 통해 저장된 데이터까지만 출력하도록 작성.
				// 만약 사용자가 사원 등록을 한 명도 하지 않았다면 "등록된 사원 정보가 없습니다." 를 출력하시면 됩니다.
					if(userNums[0] == null) {
						System.out.println("등록된 사원 정보가 없습니다.");
					} else {
						for(int i=0; i<userNums.length; i++) {
							if(userNums[i] == null) break;
							System.out.printf("<<<%d번째 사원정보>>>\n- 사번 : %s\n- 이름 : %s\n- 나이 : %d 세\n- 부서명 : %s\n\n",i+1,userNums[i],names[i],ages[i],departments[i]);	
						}
					}
			} else if(menu == 3) { ////// 사원 정보 검색 //////
				// 입력한 사번에 일치하는 사원의 4가지 정보를 모두 출력하세요.
                // 입력한 사번이 존재하지 않는다면 "조회하신 사원의 정보가 없습니다."
				System.out.println("조회할 사원의 사번을 입력하세요.");
				System.out.print("> ");
				String userNum = sc.next();
				
				for(int i=0; i<userNums.length; i++) {
					
				}
				
				//for
				
			} else if(menu == 4) { ////// 사원 정보 수정 //////
				// 해당 사번과 일치하는 사원의 나이와 부서를 선택적으로 변경할 수 있도록
                // 프로그램을 구성하시고, 나이와 부서를 수정하는 코드를 작성하세요.
                // 사번 입력 -> 존재하는 사번이 맞다면 -> [1. 나이변경 | 2. 부서변경 | 3.취소]
                // 사번이 존재하지 않는다면 없다고 얘기해 주세요.
			} else if(menu == 5) { ////// 사원 정보 삭제 //////
				// 사번을 입력 받아서 해당 사번과 일치하는 사원의 4가지 정보를 각 배열에서 모두 삭제하고
                // 삭제하기 전에 "정말 삭제하시겠습니까? [Y/N]" 를 입력받아서
                // y를 눌렀을 시에 삭제가 되도록 코드를 구성하세요.
                // 배열의 크기는 줄이지 않겠습니다. 삭제할 인덱스를 기준으로 뒤에 있는 값들을
                // 앞으로 한칸씩 땡기신 다음 count를 하나 내려주시면 됩니다.
			} else if(menu == 6) { ////// 프로그램 종료 //////
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				break; // while true break
			} else {
				System.out.println("메뉴를 잘못 입력하셨습니다.");
			}
			System.out.println("엔터를 입력하시면 메인메뉴로 돌아갑니다.");
			sc.nextLine(); // 'Enter'이라는 입력값을 저장헤두기 위한 장치
			sc.nextLine(); // 새로운 명령을 하기 위한 장치
		
		} // end while true
		
	} // end main
}