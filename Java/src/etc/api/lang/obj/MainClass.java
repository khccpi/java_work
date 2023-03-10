package etc.api.lang.obj;

public class MainClass {  // MainClass 뒤에 extends Object가 생략되어 있음.

	public static void main(String[] args) {
		
		Person park = new Person("박영희", 25);
		Person hong = new Person("홍길동", 25);

		// 객체 타입의 변수를 출력하거나 값을 얻을 때는 뒤에 자동으로 toString()이 붙어서 진행됩니다.
		System.out.println(park.toString());
		System.out.println(park);
		System.out.println(hong);
		
		if(hong.equals(park)) {
			System.out.println("이름이 같습니다.");
		} else {
			System.out.println("이름이 다릅니다.");
		}
		
		// finalize는 gc가 호출되는 순서가 보장되지 않기 때문에 불확실성이 너무 커서 사용이 권장되지 않습니다.
		hong = null;
		park = null;
		System.gc(); // 가비지 컬렉터를 호출. (부른다고 바로 안올수도 있습니다. 자기만의 순서가 있음ㅋㅋㅋ)
		
		Person kim = new Person("김복제인간", 100);
		try {
			Person clonePerson = (Person) kim.clone();
			System.out.println("복사된 객체 정보: " + clonePerson);
			System.out.println("kim의 주소: " + kim.hashCode());
			System.out.println("복제된 객체 주소: " + clonePerson.hashCode());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
//		park.personInfo();
//		hong.personInfo();
	}
}