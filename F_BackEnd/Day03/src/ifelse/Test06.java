package ifelse;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	//테스트 문제 하기 전! 나이 자동 계산기 명령어랄까..
		//System.currentTimeMillis();
		//1970년 1월 1일 0시 0분 0초부터 지금까지의 시간을 밀리언 초 단위로 반환하는 함수
		//1000밀리언초 == 1초
		
		long a = System.currentTimeMillis();
		
		long b = a / 1000; //초
		long c = b / 60; //분
		long d = c / 60; //시간
		long e = d / 24; //일
		long f = e / 365; //년
		long g = 1970 + f; //올해년도
		
		int sysyear = 1970 + (int)(System.currentTimeMillis()/1000/60/60/24/365);
		
		System.out.println("-------------------------------------");
		

		//테스트 문제
//		사용자에게 출생년도 4자리를 입력받으시고 나이를 계산해서 화면에 출력
//		2005년생 - 19살
//		2002년생 - 22살
//		
//		n년생 -> ?
//		나이가 20살 이상이면 성인입니다! 출력
//		나이가 20살 미만이면 미성년자입니다! 출력
		
		//혼자 문제 풀기 실패해서
		//샘원답 먼저..ㅠ
		
		System.out.println("출생년도 : ");
		int my_year = sc.nextInt();
		
		int age = sysyear - my_year + 1;
		
		if(age >= 20) {
			System.out.println("성인입니다.");
		}
		else {
			System.out.println("미성년자입니다.");
		}
		
		
		
	}

}
