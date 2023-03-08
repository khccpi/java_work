package basic;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
	
		//불렛이랑 methodQuiz2만 남았따
	
		Random random = new Random();
		boolean[] bullet = new boolean[5];
		
		for(int i=0; i<5; i++) {
			boolean ranBool = random.nextBoolean();
			bullet[i] = ranBool;
		}
		System.out.println(Arrays.toString(bullet));
		}
}