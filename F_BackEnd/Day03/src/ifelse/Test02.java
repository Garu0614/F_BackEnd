package ifelse;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {

//		//점수 유효성 검사
//		1. 점수를 입력받는다.
//		2. 점수가 60점이상이면 합격, 60점 미만이면 불합격이다.
//		3. 단, 입력받은 점수가
//			음수이거나 100점을 초과하면 예회 메세지를 출력한다.
//			ex) 점수를 잘못 입력하셨습니다.
		
		Scanner sc = new Scanner(System.in);
//		//내 답
//		System.out.println("점수를 입력해주세요");
//		int score = sc.nextInt();
//		
//		if ( 100 >= score  >= 60) {
//			System.out.println("합격");
//		}
//		else if(0 =< score < 60){
//			System.out.println("불합격");
//		}
//		else{
//			System.out.println("점수를 잘못 입력하셨습니다");
//		}
//		
		//샘원답 ( if만 쓰는경우, ifelse경우 다 보여드림)
		
		System.out.println("점수를 입력해주세요");
		int score = sc.nextInt();
		
		if ( score >= 60 && score  >= 100) {
			
			System.out.println("합격");
		}
		if( score < 60 && score  >= 0){
			System.out.println("불합격");
		}
		if (score < 0 || score  > 100){
			System.out.println("점수를 잘못 입력하셨습니다");
		}
		
//		---------------------------------------
		
		if (score < 0 || score  > 100){
			System.out.println("점수를 잘못 입력하셨습니다");
		}
		else if ( score >= 60) {
			System.out.println("합격");
		}
		else{
			System.out.println("불합격");
		}
		
		
		
		
	}

}
