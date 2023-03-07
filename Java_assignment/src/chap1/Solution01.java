package chap1;

import java.util.Arrays;
import java.util.Scanner;

public class Solution01 {

	public static void main(String[] args) {
		/*
		 * nums 배열에서 가장 큰 값을 출력하는 코드를 작성합니다.
		 * Scanner를 사용해서 입력받은 값을 nums 배열에 삽입합니다.
		 * 배열의 크기는 10이고, 중복 입력값은 없다고 가정합니다.
		 * 배열의 모든 인덱스에 값을 채울 때 까지 입력을 반복합니다.
		 * ex) 가장 큰 값: 95  의 형태로 출력합니다.
		 */
		
		int[] nums = new int[10]; // 크기 10인 배열 생성
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<10; i++) {
			System.out.printf("%d번째 숫자를 입력하세요.\n",i+1);
			System.out.print("> ");
			int num = sc.nextInt();
			nums[i] = num;
		}
		System.out.println("만든 배열값 : " + Arrays.toString(nums));
		Arrays.sort(nums); // 배열 정렬
		System.out.println("가장 큰 값 : " + nums[nums.length-1]);
		
		sc.close();
	}

}
