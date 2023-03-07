package chap1;

import java.util.Arrays;
import java.util.Scanner;

public class Solution03 {

	public static void main(String[] args) {
		/*
		 * scores 배열에 존재하는 점수에 순위를 매겨서 출력하는 프로그램 입니다.
		 * Scanner를 활용하여 총 5개의 점수를 입력받습니다.
		 * 타입은 정수 타입이며 scores 배열에 순서대로 삽입합니다.
		 * 점수의 순서는 정해진 것이 없습니다만 중복은 허용하지 않는다고 가정합니다.
		 * ex) 85 100 35 47 90 
		 * 
		 * ex) 
		   점수    		순위
		   --------------------------
		   85		3
		   100		1
		   35		5
		   47		4
		   90		2
	
		 */
		int[] scores = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<scores.length; i++) {
			System.out.printf("%d번째 숫자를 입력하세요.",i+1);
			System.out.print("> ");
			int num = sc.nextInt();
			scores[i] = num;
		}
		System.out.println("생성된 배열 : " + Arrays.toString(scores));
		System.out.println("---------------------------");
		System.out.printf("점수\t순위\n");
		System.out.println("------------");
		for(int i=0; i<scores.length; i++) {
			int rank = 1; 
			for(int j=0; j<scores.length; j++) {
				if(scores[j]>scores[i]) {
					rank++;
				}
			}
			System.out.printf("%d\t%d\n",scores[i],rank);
		}
		sc.close();
	}

}
