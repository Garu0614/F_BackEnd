package variable;

public class Test01 {

	public static void main(String[] args) {
		//논리형 - boolean		1byte	true/false
		//참과 거짓을 관리하는 자료형
		// - true / false
		// - 어떤 대상을 표현할때 상태값이 두가지인 경우
		
		boolean a = true;
		System.out.println(a);
		
		//관계 연산자 - 데이터의 관계를 연산하는 연산자
		// < > <= >= ==(같다) !=(다르다)
		int a1 = 5, b1 = 10;
		System.out.println(a1 > b1); //거짓
		System.out.println(a1 < b1); //진실
		System.out.println(a1 == b1);//거짓
		System.out.println(a1 != b1);//진실
		
		//논리 연산자
		// - 조건식에 대한 참과 거짓을 판별하는 연산자
		// && - and(논리곱) : 양쪽 모두 참일때 참을 발생
		System.out.println(a1 < b1 && a1 != b1);
		System.out.println(a1 < b1 && a1 == b1);
		// || - or (논리합) : 둘중 하나라도 참이면 참을 발생
		System.out.println(a1 < b1 || a1 != b1);
		System.out.println(a1 < b1 || a1 == b1);		
		
		//조건식	연산자		조건식		and		or
		//true			true	true	true
		//true			false	false	true
		//false			true	false	true
		//false			false	false	false
		
		//! - not(부정) : 참이면 거짓, 거짓이면 참
		System.out.println(!(a1 < b1)); //true -> false
		System.out.println(!(a1 == b1));//false -> true !를 만나서 거짓이 참으로 됨
		
	}

}
