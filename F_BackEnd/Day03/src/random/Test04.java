package random;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
		
		//풀어봅시다
//		가운데 숫자 맞추기 게임
//		1. 150 ~ 250 사이의 랜덤 숫자를 저장 //몫,나머지 계산 응용하기
//		2. 랜덤 숫자의 가운데 숫자를 맞추는 게임이다.
//		ex)		249		: 4
//					정답입니다!
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		int a = (int) Math.random()*250+1;
//		int b = (int)a;
//		int c = (int)
//		System.out.println( a );
//		
//		
//		
//		if(100/249)
//		
			
			
			
			//샘원답
			
		Scanner sc = new Scanner(System.in);
		
		int num = (int)(Math.random() * 101) + 150;
		
		System.out.println("가운데 숫자를 입력하세요 : ");
		int user = sc.nextInt(); 
		int com = num % 100 / 10;  //중요포인트! 이 계산식을 쓸수 있느냐 없느냐가 포인트였따
		if (com == user) {
			System.out.println("정답!");
		}
		else {
			System.out.println("오답!");
		}
		
		
		
		
		
		
	}

}
