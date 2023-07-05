package random;

public class Test02 {

	public static void main(String[] args) {

		//풀어보기~
//		주사위 2개를 던지는 코드를 구현하시고
		int a = (int)(Math.random()*6 + 1); // 0,1,2,3,4,5,6 중에 하나가 -> a
//		두개의 주사위 합계에 따라 아래와 같이 코드를 구현
//		
//		(1)합계가 짝수일 경우				짝!출력
//		(2)합계까 홀수일 경우				홀!출력
//		(3) 두 주사위가 같은 값일 경우 		더블!출력
		
		int cube = (int)(Math.random()*6 +1);
		
		if (cube/2 != 0) {
			System.out.println("짝!");

		}
		else if (cube/2 != 0)
				System.out.println("cube = " + cube);

		
		
		
		
		
		
		
		
		//샘원답 1번째
		
		 int dice1 = (int)(Math.random()*6) +1;
		 int dice2 = (int)(Math.random()*6) +1;
		 
		 int tot = dice1 + dice2;
		 System.out.println(dice1 + "\t" + dice2);
		 if (dice1 == dice2) {
				System.out.println("더블!");
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 //샘원답 2번째
		 if
		 
		 
		
		
		
		
		
		
	}

}
