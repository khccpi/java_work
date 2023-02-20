package basic;

public class TextualExample {

	public static void main(String[] args) {
		
		char c1 = 'A';
		System.out.println(c1);
		
		//char c2 = 'AB'; (X, 하나씩만 가능!)
		//System.out.println(c2);
		
		//char c3 = "A"; (X, 쌍따옴표 불가능! ㅠㅠ 홑따옴표만 가능!)
		//System.out.println(c3);
		
		char c4 = 65;    // 아      드        라
		char c5 = 66;    //   스  코     참  해
		char c6 = 44032; //     키        고
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		
		//char는 2byte이다! 2byte보다 넘는 숫자는 아스키코드에 정해져 있지 않아서 문자로 표현 불가능하다!
		
		
		////////////////////////////////////////////////////////////////////////////////////////////
		
		/*
		 # 문자열을 저장할 수 있는 데이터 타입 String
		 - 저장하고 싶은 문자열을 겹따옴표("")에 담아 대입합니다.
		 - String은 기본 데이터 타입은 아니지만 자주 쓰이기 때문에 기본 데이터 타이버럼 사용합니다. (사실은 객체 타입)
		 */
		
		String s1 = "my dream ";
		String s2 = "is a programmer";
		System.out.println(s1);
		System.out.println(s2);
		
		//자바에서는 문자열의 덧셈(+) 연산을 지원합니다. 뺄셈(-), 곱셈(*), 나누기(/) 다 안됨~~!!!!!
		//연산 결과로는 문자열을 연결해서 결합한 결과가 도출됩니다.
		System.out.println(s1 + s2);
		
		//문자열과 다른 데이터 타입 간의 연산 결과는 무조건 문자열의 덧셈 연산과 같습니다.
		System.out.println("---------------------------------------------------------------------");
		System.out.println(100 + 100);    		 // 전부 숫자로 취급
		System.out.println("100" + "100"); 		 // 전부 문자로 취급
		System.out.println("100" + 100);   		 // 전부 문자로 취급
		System.out.println("100" + 100 + 100);   // 전부 문자로 취급
		System.out.println(3.14 + "hi");		 // 전부 문자로 취급
		System.out.println("---------------------------------------------------------------------");
		
		int month = 10;
		int day = 13;
		System.out.println("내 생일은 " + month + "월 " + day + "일 입니다."); //내 생일은 10월 13일 입니다.
		
	}
}
