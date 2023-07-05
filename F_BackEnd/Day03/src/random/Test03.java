package random;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {

		//풀어봅시다~
//		화면에 무작위로 구구단 1문제를 출제 ( 2~ 15단 )
//		2 x 1 = 부터		15 x 9 =		까지
//		사용자가 정답을 입력할 수 있도록 프로그래밍 코드를 구현
//		정답일 경우 아래와 같이 처리
//		
//		[1] 맞춘 경우 		정답! 10점 획득!
//		[2] 틀린 경우		오답! 5점 감점!
//		추가적으로, 어려운 문제 (11단 이상)을 맞추면 10점을 추가로 획득하도록 코드 구현
		
//		 int a = (int)(Math.random())*9 +1;
//		 int b = (int)(Math.random())*9 +1;
//		
//		 Scanner sc = new Scanner(System.in);
//		 
//		 System.out.println(a*b);
//		 if (a*b)
		
		
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
		// 샘원답
		Scanner sc = new Scanner(System.in);
		
		int a = (int)(Math.random()*14) +2; // 2~15 -> a
		int b = (int)(Math.random()*9) +1; // 1~9 -> b
		
		System.out.println(a + " x " + b + " = ");
		int user = sc.nextInt(); // 49 -> user
		int com = a*b; // com = 49;
		
		if ( user == com ) {
			System.out.println("정답! 10점 획득!");
			if ( a >= 11) {
				System.out.println("어려운문제 정답! 10점 추가 획득!");
			}
		}
		else {
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}
