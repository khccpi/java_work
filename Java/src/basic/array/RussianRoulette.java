package basic.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RussianRoulette {

	public static void main(String[] args) {
		
		/*
		 - 게임 인원은 2 ~ 4명 입니다.
		 - 실탄 개수는 6개 미만으로 설정하겠습니다.
		 - 게임이 시작되면, 시작 인원은 랜덤으로 순서가 설정됩니다.
		 - 또한 총알의 위치도 랜덤으로 설정됩니다.
		 - 총알의 위치는 boolean 타입의 배열로 선언하여 배치하였습니다.
		   ex) [false, false, false, true, false, false]
		 - 룰은 정해진 것은 없지만, 한명이 사망하면 총알의 위치를 랜덤으로 바꿔서 남은 인원으로 다시 진행을 할 생각입니다.
		 - 원하는 규칙이 있다면 자유롭게 커스텀해서 작성해 보세요.
		 */
	
		Scanner sc = new Scanner(System.in);
		System.out.println("게임 인원을 정하세요.(2 ~ 4)");
		System.out.print("> ");
		int player = sc.nextInt();
		if(player < 2 || player > 4) {
			System.out.println("게임 인원이 올바르지 않습니다. 게임을 종료합니다.");		
		} else {
			String[] players = new String[player];		// 참가자 배열 생성~!!!!
			System.out.printf("%d명 참가하셨습니다. 실탄 개수를 정해주세요.(1발 이상 6발 미만)\n",player);
			System.out.print("> ");
			int bullet = sc.nextInt();
			if(bullet < 1 || bullet > 6) {
				System.out.println("실탄 갯수가 올바르지 않습니다. 게임을 종료합니다.");
			} else {
				boolean[] lucks = new boolean[6];		// 실탄 배열 생성~!!!!  배열은 생성 했으나 아직 총알랜덤으로 구하는거 못함
				int bulletNum = 0;
				while(bulletNum < bullet) {
					int bul = (int)(Math.random()*lucks.length);
					if(lucks[bul]) {
						continue;
					} else {
						lucks[bul] = true;
						bulletNum++;
					}
				}											// 실탄 장전 완료. boolean의 배열은 기본이 false~~!!
				System.out.printf("장전상태 미리 보기 : %s\n",Arrays.toString(lucks));
				System.out.printf("%d명 참가하셨고 실탄 개수는 %d발 입니다.\n",player,bullet);
				System.out.println("참가자 이름을 등록하겠습니다.");
				
				for(int i=0; i<player; i++) {
					System.out.printf("%d번째 참가자의 이름은? : ",i+1);
					System.out.print("> ");
					String name = sc.next();
					players[i] = name;
				}
				int ran = (int)(Math.random()*players.length);
				System.out.printf("참여자는 총 %d 명이며, 이름은 %s입니다. %s부터 시작합니다.\n",player,Arrays.toString(players),players[ran]); 			// 게임 준비 완료
				
				int shot = 0;
				
				while(true) {
					System.out.println("엔터를 누르면 총을 쏩니다.");
					String ready = sc.nextLine();
					String ready2 = sc.nextLine();
					if(lucks[shot]) {
						System.out.println("탕!! 사망");
						lucks[shot]=false;
						bulletNum--;
						player--;
						
						for(int k=0; k<players.length-1; k++) {
							players[k] = players[k+1];
						}
						String[] temp = new String[players.length-1];
						for(int j=0; j<temp.length; j++) {
							temp[j] = players[j];
						}
						players = temp;
						System.out.printf("남은 인원 : %s  남은 총알 : %s\n",Arrays.toString(players),bulletNum);
					} else {
						System.out.println("아무 일도 일어나지 않았습니다.");
					}
					shot++;
				}
			}
		}
		sc.close();
	}
}
