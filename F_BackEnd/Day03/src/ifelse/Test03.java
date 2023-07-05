package ifelse;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		//중국집 주문 프로그램
		
//		사용자에게 자장면, 짬뽕 주문 수량을 입력받아 결재 금액을 계산하여 출력
//		자장면 - 5000원
//		짬뽕 - 6000원
//		
//		5그릇 이상 주문하면 3천원 할인 되도록 금액을 계산하여 출력
//		10그릇 이상 주문하면 10%할인 처리
//조건!	변수의 값은 건들필요없이, 값이나 할인율이 변해도 괜찮게 만들어주세요
		
		Scanner sc = new Scanner(System.in);

		// 샘의 팁 ! 물건 값을 먼저 선언하자
		int bp = 5000; //자장면가격
		int rp = 6000; //짬뽕가격
		
		int cnt1 = 5; //할인 처리할 그릇 개수
		int snt2 = 10;
		
		int rate1 = 3000; //할인가격
		int rate2 = 10;		
//		System.out.println("자장면 수량을 입력해주세요");
//		int b = sc.nextInt();
//		System.out.println("짬뽕 수량을 입력해주세요");
//		int r = sc.nextInt();
//		int ea = black + red; //두개의 수량 합개
//		int price = (black * bp) + (rp * red); //총가격
//		
//		if (ea >= 5) {
//			System.out.println(price*ea-rate1);
//		}
//		if (cnt1 >= 10) {
//			System.out.println();
//		}
		//샘원답
			System.out.println("자장면 수량을 입력해주세요");
			int black = sc.nextInt();
			System.out.println("짬뽕 수량을 입력해주세요");
			int red = sc.nextInt();
			int ea = black + red; // 두개의 수량 합개
			int price = (black * bp) + (rp * red); //총 가격
			
			//else of 쓰려면 10그릇 이상인 것 부터 써야한다!
			
			if (ea >= cnt2) {
				System.out.println(cnt2 + "그릇 이상 주문 시 " + rate2 + "%할인");
				System.out.println("총금액 : " + (int)(price*((100-rate2)/100.0)));
			}
		
			else if ( ea >= cnt1) {
				System.out.println(cnt1 + "그릇 이상 주문시 " + rate1 + "원 할인");
				System.out.println("총 금액 : " + (price - rate1)+"원");
			
			else {
				System.out.println("총금액 : " + price + "원");
			}
			}
		
		
		
		
		
		
		
	}

}
