package ifelse;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	
//		1.키를 입력받는다.
//		입력받은 키가 120cm이상이면 놀이기구를 이용할 수 있다.
//		키가 120 미만이면 놀이기구를 이용할 수 없다.
//			단, 부모님과 함께 온 경우 놀이기구 이용이 가능하다.
//			ex) 부모님과 함께 오셨나요? (yes :1 , no : 0)

		//내 답
//		System.out.println("키를 입력해주세요.");			
//		int hei = sc.nextInt();
//	
//		if (hei>=120) {
//			System.out.println("즐거운 시간 보내세요.");			
//		}
//		
//		if (hei < 120) {
//			System.out.println("부모님과 함께 오셨나요? ( yes : 1, no : 0 )");
//			int par = sc.nextInt();
//				if (par == 0) {
//					System.out.println("놀이기구를 이용할 수 없습니다.");
//				}
//				else {
//					System.out.println("즐거운 시간 보내세요.");								
//				}
//		}
//						
//		else {
//			System.out.println("놀이기구를 이용할 수 있습니다.");
//		}
		
		
		//샘원답
		
		System.out.print("키 입력 : ");			
		double hei = sc.nextDouble();
	
		if (hei >= 120) {
			System.out.println("즐거운 시간 보내세요.");			
		}
		
		else {
			System.out.println("부모님과 함께 오셨나요? ( yes : 1, no : 0 )");
			int y = sc.nextInt();
				if (y == 0) {
					System.out.println("놀이기구를 이용할 수 없습니다.");
				}
				else {
					System.out.println("즐거운 시간 보내세요.");								
				}
		}
						
		
		
		
		

		
		
		
		
		
	}

}
