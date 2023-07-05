package Input;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		//System.in - 표준 입력 객체
		//.read() - 데이터를 1byte씩 읽어오는 명령
		//int 4byte double 8byte
		// - read는 1byte 씩밖에 못읽어오기 때문에 불편함
		
		//Scanner - 데이터를 읽어오기 위한 도구
		// - 파일, 문자열, 입력스트림, URL...
		
		//Scanner 만들기
		Scanner sc = new Scanner(System.in);
		
		//.next() - 한 단어를 읽어오는 명령 = 다음 데이터를 문자열 형태로 읽어오는 명령
		System.out.print("이름 입력 : ");
		String name = sc.next(); // 띄어쓰기 전까지만 읽어온다.
		System.out.println("이름 :" + name);
		
		//정수, 실수
		//.next자료형()
		System.out.print("나이 입력 : ");
		int age = sc.nextInt(); //정수자료형을 읽어온다.
		System.out.println("나이 : " +age);
		System.out.println("키입력 : ");
		double hei = sc.nextDouble();
		System.out.println("키 : "+hei);
		
		//Buffer
		// - 데이터의 단위, 데이터의 처리 속도, 형식등이 서로 다른 두 장치나 프로그램
		//	 사이에서 데이터를 주고받기 위한 목적으로 사용되는 임시 기억 장치
		// - 컴퓨터에서 키보드 입력시에는 데이터를 공백 문자를 기준으로 데이터를 구분짓는다.
		// 공백문자 -> 스페이스, 탭, 엔터 등등
		
		//.nextline() - 한줄을 읽어오는 명령
		// - 공백문자 기준으로 데이터를 읽어오는 것이 아니라 \n을 기준으로 데이터를 읽어온다.
		// - 무엇인가 입력받은 후에 nextline을 사용하면 버퍼에 \n이 남아있기 때문에
		//	 데이터를 입력받은걸로 인식한다. 버퍼안에 엔터값을 제거해주어야한다. **
		//. nextLine()을 한번 더 써준다. **
		sc.nextLine(); //byffer 비우기 용도 => enter값을 가져가준다.		
		System.out.print("메모장 : ");
		String str = sc.nextLine();
		System.out.println("메모 :" + str);
		
	
	
	}

}
