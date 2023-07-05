 package ifelse;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
//		
//		로그인
//		1. id와 pw를 입력받는다.
//		2. 입력받은 데이터와 db데이터를 비교해 로그인 처리를 진행한다.
//		ex)		로그인 성공 	or  	로그인 실패
//		int dbId = 1234;
//		int dbPw = 1111;
		
		
		//	나의 작은 시도
		int dbId = 1234;
		int dbPw = 1111;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ID를 입력해주세요");
		int a = sc.nextInt();
		System.out.println("PW를 입력해주세요");
		int b = sc.nextInt();
				
		if (a == 1234 && b == 1111) {
			System.out.println(" 로그인 성공 ");
		}
		if (a != 1234 || b != 1111){
			System.out.println("로그인 실패");						
		}
		
		
		
		
		
		
		
		
		
		//샘원답
//		System.out.println("ID를 입력해주세요");
//		int id = sc.nextInt();
//		System.out.println("PW를 입력해주세요");
//		int pw = sc.nextInt();
//		
//		if(id == dbId && pw == dbPw) {
//			System.out.println("로그인 성공");			
//		}
//		else {
//			 System.out.println("로그인 실패");
//		}
//		//로그인 실패가 true일때의 if
//		if (id != dbId || pw != dbPw) {
//			System.out.println("로그인 실패");
//		}
//		else {
//			System.out.println("로그인 성공");
//		}
		
	}

}
