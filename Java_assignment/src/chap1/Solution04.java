package chap1;

import java.util.Scanner;

public class Solution04 {

	public static void main(String[] args) {
		/*
		 * 학생들 중 과제를 제출하지 않은 학생을 적발하는 문제 입니다.
		 * 총 학생의 수는 10명 입니다. 각 학생들은 1번부터 10번까지 번호를 가지고 있습니다.
		 * 학생들 중 2명의 학생이 과제를 제출하지 않았습니다. 그 학생이 몇 번 학생인지를 출력하면 됩니다.
		 * Scanner를 활용하여 총 8개의 정수를 입력 받습니다.
		 * 출석번호에 중복은 없습니다. 
		 * 입력되는 값을 제시합니다.
		 * -> 3 1 4 5 7 9 6 10
		 *  
		   ex) 
		   숙제를 안 낸 학생의 번호:
		   2
		   8
	
		   의 형태로 출력합니다.
		 */
		
		int[] stu = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		//int[] hw = new int[8];
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		
			//boolean flag = false;
			System.out.println("숙제를 낸 학생의 번호: ");
			System.out.print("> ");
			int num = sc.nextInt();
			
			
			for(int i=0; i<stu.length; i++) {
				if(num ==stu[i]) {
					for(int j=i; j<stu.length-1; j++) {
						stu[j] = stu[j+1];
					}
				}
			}
			//System.out.println(Arrays.toString(stu));
			
			int[] temp = new int[stu.length-1];
		
			for(int j=0; j<temp.length; j++) {
				temp[j] = stu[j];
			}
	 	  //System.out.println(Arrays.toString(temp));
		
			stu = temp;		
	      //System.out.println("a" + Arrays.toString(stu));
		
			if(stu.length == 2) {
				break;
			}
		}
		System.out.println("------------------------------------");
		System.out.println("숙제를 안 낸 학생의 번호 : ");
		for(int k=0; k<stu.length; k++) {
			System.out.println(stu[k]);
		}
		sc.close();
	}
}