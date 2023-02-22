package basic.operator;

public class PlusMinusOperator {

	public static void main(String[] args) {
		
		int p = 1;
		System.out.println("1번 p : " + p);
		
		p = p + 1;
		System.out.println("2번 p : " + p);
		
		p++;
		System.out.println("3번 p : " + p);

		++p;
		System.out.println("4번 p : " + p);
		
		p--;
		System.out.println("5번 p : " + p);
		
		--p;
		System.out.println("6번 p : " + p);
		
		System.out.println("-----------------------------------------------------------------------------");
		
		int i = 1;
		int j = i++; //후위 연산(선연산 후증감)
		int k = i--; //후위 연산(선연산 후증감)
		System.out.println("i의 값 : " + i);
		System.out.println("j의 값 : " + j + ", i의 값 : " + i);
		System.out.println("k의 값 : " + k + ", i의 값 : " + i);
		
		System.out.println("-----------------------------------------------------------------------------");
		
		int x = 1;
		int y = ++x; //선위 연산(선연산 후증감)
		int z = --x; //선위 연산(선연산 후증감)
		System.out.println("x의 값 : " + x);
		System.out.println("y의 값 : " + y + ", x의 값 : " + x);
		System.out.println("z의 값 : " + z + ", x의 값 : " + x);
		
		System.out.println("-----------------------------------------------------------------------------");
		
		int a = 3;
		int b = a++ + 5 * 3;
		System.out.println("b의 값 : " + b);
		System.out.println("a의 값 : " + a);
		
		int c = 3;
		int d = ++c + 5 * 3;
		System.out.println("d의 값 : " + d);
		System.out.println("c의 값 : " + c);
	}
}
