package ifelse;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		
		//풀어보자~


		Scanner sc = new Scanner(System.in);
		
		
//		//1)숫자 한개를 입력받고 양수, 0, 음수인지 출력
		//내 답
//		System.out.println("숫자 한개 : ");
//		int a = sc.nextInt();
//		if(0<a) {
//			System.out.println("양수");
//		}
//		else if(0==a) {
//			System.out.println("0");
//		}
//		else if(0>a) {
//			System.out.println("음수");
//		}
//		
		//샘원답
		System.out.println("숫자 한개 : ");
		int n = sc.nextInt();
		
		if( n > 0 ) {
			System.out.println("양수");
		}
		if(n < 0) {
			System.out.println("음수");
		}
		if(n == 0) {
			System.out.println("0");
		}
		//아니면 
		/*
		System.out.println("숫자 한개 : ");
		int n = sc.nextInt();
		
		if( n > 0 ) {
			System.out.println("양수");
		}
		else if(n < 0) {
			System.out.println("음수");
		}
		else {						//마지막 else는 조건문을 안써도 된다!!!!
			System.out.println("0");
		}
		*
		*/
		
		
		
		//2)숫자 한개를 입력받고 4의 배수인지 아닌지 출력
//		System.out.println("숫자 한개(2) : ");
//		int b = sc.nextInt();
//		if(b%4==0) {
//			System.out.println("4의배수 입니다");
//		}
//		else {
//			System.out.println("4의배수가 아닙니다");
//		}
//		
		//샘원답
		System.out.println("숫자 한개(2) : ");
		n = sc.nextInt();		// 위에 n선언(int n = sc.nextInt();)을 했기때문에 선언하지않아야 한다.
		if( n % 4 == 0 ) {		// 8을 4로 나누면 몫은2고 나머지는0이니까, 0과 ==0이 같으니까~					
			System.out.println("4의 배수 입니다");
		}
		else {
			System.out.println("4의 배수가 아닙니다");
		}
		//if ( n % 4==0 ) {선언~} , if( n % 4 != 0 ){선언~} 으로 if if문으로 써도 무방.
		
		
		//3)점수 한개 입력받고 60점 이상이면 합격, 그외는 불합격
//		System.out.println("숫자 한개(3) : ");
//		int c = sc.nextInt();
//		if(c>=60) {
//			System.out.println("합격");
//		}
//		else {
//			System.out.println("불합격");
//		}
//		
		
		System.out.println("점수 한개 입력 : ");
		int score = sc.nextInt();
		
		if( score >= 60) {
			System.out.println("합격");
		}
		else { //if(score < 60)도 가능
			System.out.println("불합격");
		}
		
		
		
		
	}

}




