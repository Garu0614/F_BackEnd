package Input;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {

		//테스트문제 ( 답 입력 거의 실패..)
		//1.숫자 2개를 입력받아 산술연산하세요. (+,-,*,/(몫),/(실수),%)
		Scanner sc = new Scanner(System.in);
		//int a1 = sc.nextInt(); //정수자료형을 읽어온다.
		//int a2 = sc.nextInt();
		//System.out.println("a1 : " + a1 + ", a2 : " + a2);
		//System.out.println("a1 + a2 : " + (a1+a2));
		//System.out.println("a1 - a2 : " + (a1-a2));
		//System.out.println("a1 / a2 : " + (a1/a2));
		//System.out.println("a1 / a2 : " + ((double)a1/a2));
		//System.out.println("a1 % a2 : " + (a1/a2));

		//샘원답
		System.out.println("숫자1 입력 : ");
		int a = sc.nextInt();
		System.out.println("숫자2 입력 : ");
		int b = sc.nextInt();
		System.out.println(a+"+" +b+"="+(a+b));
		System.out.println(a+"-" +b+"="+(a-b));
		System.out.println(a+"*" +b+"="+(a*b));
		System.out.println(a+"/" +b+"="+(a/b));
		System.out.println(a+"/" +b+"="+(a/(double)b));
		System.out.println(a+"%" +b+"="+(a%b));


		//2.숫자 1개를 입력받아, 홀수면 true출력 
		// 홀수는 2로 나눈 나머지의 값이 1과 같다.
		// 홀수는 2로 나눈 나머지의 값이 0이 아니다.
		
		//내 답
		//System.out.println("숫자3 입력 : ");
		//int c = sc.nextInt();		
		//System.out.println((c%2)==1);
		
		//샘원답
		System.out.println("숫자 1개 입력 : ");
		int n = sc.nextInt();		
		System.out.println(n % 2 == 1);
		System.out.println(n % 2 != 0);

		
		
		//3. 성적을 입력받아, 60점 이상이고 100점 이하면 true출력
		//내답
		//System.out.println("성적 입력 : ");
		//int score = sc.nextInt();		
		//System.out.println(60<=d && d<=100);
		
		//샘원답
		//이면서,이고 => &&( and )
		//이거나,하거나 => ||( or )
		System.out.println("성적 입력 : ");
		int score = sc.nextInt();		
		System.out.println(score >= 60 && score <= 100);
		
		
		
	}

}
