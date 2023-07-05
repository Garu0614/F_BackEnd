package Input;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		//앞의 예제를 참고하여 사용자에게 입력을 받아 다음을 계산하세요
		//(결과 화면)
		//자바 시험 점수 입력하세요
		//95
		//파이썬 시험 점수 입력하세요
		//80
		//CPP 시험 점수 입력하세요
		//76
		//이름을 입력하세요
		//홍길동
		//============================
		//홍길동님의 성적의 합계 = 251점, 평균 = 83.6666666667점
		
		//내가만든답
		Scanner sc = new Scanner(System.in);  //외우기
		
		//System.out.print("(결과 화면)\n자바 시험 점수 입력하세요");
		//int j = sc.nextInt();
		//System.out.print("파이썬 시험 점수 입력하세요");
		//int p = sc.nextInt();
		//System.out.print("CPP 시험 점수 입력하세요");
		//int c = sc.nextInt();
		//System.out.print("이름을 입력하세요");
		//String name = sc.next(); 		//.next자료형()!!! 오류나서 샘께서 힌트
		//System.out.print("========================\n");
		//System.out.println(name+"님의 성적의 합계 = " + 
		//		(j+p+c)+"점, 평균 = " +
		//		((double)(j+p+c)/3)+"점");
		
		//샘원답
		System.out.println("자바 시험 점수 입력하세요");
		int j = sc.nextInt();
		System.out.println("파이썬 시험 점수 입력하세요");
		int p = sc.nextInt();
		System.out.println("CPP 시험 점수 입력하세요");
		int c = sc.nextInt();
		System.out.println("이름을 입력하세요");
		//sc.nextLine();
		//String name = sc.nextLine();
		String name = sc.next(); 		//.next자료형()!!! 오류나서 샘께서 힌트
		System.out.println("========================\n");
		int tot = j + p + c;
		double avg = tot / 3.0;
		System.out.println(name+"님의 성적의 합계 = " + 
				tot+"점, 평균 = " +
				avg+"점");


		
		
		
	}

}
