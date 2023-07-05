package ifelse;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int dbId = 1234;
		int dbPw = 1111;
		
		System.out.println("ID를 입력해주세요");
		int id = sc.nextInt();
		System.out.println("PW를 입력해주세요");
		int pw = sc.nextInt();
		
		if(id == dbId) {
			if(pw == dbPw) { //위 id == dbId의 if문이 참일때 if문 확인
				System.out.println("로그인성공");
			}
			else {
			 System.out.println("비밀번호가 틀렸습니다");
			}
		}
		else {
			System.out.println("아이디가 틀렸습니다");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
