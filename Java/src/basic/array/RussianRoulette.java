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
				boolean[] lucks = new boolean[bullet];		// 실탄 배열 생성~!!!!  배열은 생성 했으나 아직 총알랜덤으로 구하는거 못함

				System.out.printf("%d명 참가하셨고 실탄 개수는 %d발 입니다.\n",player,bullet);
				System.out.println("참가자 이름을 등록하겠습니다.");
				
				for(int i=0; i<player; i++) {
					System.out.printf("%d번째 참가자의 이름은? : ",i+1);
					System.out.print("> ");
					String name = sc.next();
					players[i] = name;
				}
				System.out.printf("참여자는 총 %d 명이며, 이름은 %s입니다.",player,Arrays.toString(players));
			}
		}
		sc.close();
	}
}
