package ifelse;

import java. util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int a = sc.nextInt();
		
		if(a >= 10) {
			 System.out.println("10 이상이다");
		}
		else {
			System.out.println("10 미만이다");
		}
		
		System.out.println("숫자 한개 입력 : ");
		int b = sc.nextInt();
		
		if(b%2 ==0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
		
		if(b % 2 == 0) {
			System.out.println("짝수");
		}
		if(b % 2 == 1) {
			 System.out.println("홀수");
		}
		
		
		
		
	}

}
