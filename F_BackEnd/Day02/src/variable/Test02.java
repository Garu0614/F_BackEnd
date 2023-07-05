package variable;

public class Test02 {

	public static void main(String[] args) {
		
		//문자
		// - ''(외따옴표) 안에 적어야 문자형 데이터로 인식된다
		
		//char	2byte	0~65535
		//컴퓨터는 정수만 처리할 수 있따.
		//컴퓨터에서 문자를 처리하기 위해 고유한 약속을 정해놓았다.
		//문자마다 고유한 정수값을 정해놓고 문자 사용시 정수값으로 읽는다.
		
		//1.아스키코드 - 1byte
		// - 가장 처음 만들어진 문자 체계
		// - 총 128가지의 문자들을 처리하였다
		// - 키보드위에 있는 문자들
		// - 키보드의 키값으로도 사용된다.
		// - C계열의 언어는 기본 문자 체계가 아스키코드이다. 
		//구글링 - 아스키코드 표 구경 완료
		
		char ch = 'A'; //문자 한개
		System.out.println(ch);
		System.out.println((int)ch);//아스키코드값
		System.out.println((char)(ch+32));//(ch+32)는97이다. -> 그래서 결과는 'a'
		
		//2.유니코드 - 2byte
		// - 아스키코드 + 이세상의 모든 문자 = 약 6만개
		// - 자바는 기본 문자형식을 유니코드로 만들어 놓았다.
		// - 오늘날에 가장 널리 쓰이는 문자 체계 (UTF-8)
		ch = '가';
		System.out.println(ch);
		System.out.println((int)ch);//(int) ->정수형태로 바꾸니까~
		//System.out.println((int'나')); //연달아서 이렇게 실행하면 에러! 안나옴 !
		//참고
		//A = 65 기억! 
		//A와 a는 32만큼 차이남! 기억 // 예제 26줄 추가
		
	}

}
