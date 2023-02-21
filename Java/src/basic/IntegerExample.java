package basic;

public class IntegerExample {
	
	public static void main(String[] args) {
		
		/*
		 # 리터럴 : 변수에 저장되기 전의 상수값
		 자바의 정수 리터럴의 타입은 int 입니다.
		 int보다 더 큰 범위의 수를 표현하기 위해서는 뒤에 L을 붙여서 long타입으로 인식시킨다. ex) long d = 2147483648L;
		 
		 기가 막힌 사실!! 모든 단위를 bit로 바꾸고 제곱으로 넘겨라
		 ex) 1byte = 8bit -> -2^7 ~ 2^7 = -127 ~ 127 -> 전부 255개 (0 포함해라!!) 
		 */
		
		byte a = 127; 			// byte  = 8 bit           -> -2^7  ~ 2^7  (0 포함)
		short b = 32767;   		// short = 2 byte = 16 bit -> -2^15 ~ 2^15 (0 포함)
		int c = 2147483647;		// int   = 4 byte = 32 bit -> -2^31 ~ 2^31 (0 포함)
		long d = 2147483648L;	// long  = 8 byte = 64 bit -> -2^63 ~ 2^63 (0 포함)
		
	}
}


