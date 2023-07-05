package Output;

public class Test01 {

	public static void main(String[] args) {
		//IQ - Input / Output - 입출력
		//stream방식의 언어
		
		//System.out - 표준출력객체
		// - 자바에서 출력을 하기 위해 미리 만들어진 통로
		
		//.println() - 내용 출력 후 엔터
		//.print() - 내용만 출력
		//printf() - 잘 사용x - C언어 출력
		
		System.out.print(".print()");
		System.out.println(" - 내용만 출력");
		System.out.println("JAVA");
		
		//제어문자
		// - 특수한 기능을 하는 문자들
		// - 주로 콘솔창을 제어하는 문자이다
		// - 실행하고자 하는 위치에 적으면 된다.
		// - \뒤에 기능에 맞는 문자들을 적으면 된다.
		// - 약 30가지..
		
		System.out.println((int)'\n'); // \n 은 아스키코드 표에 10으로 저장된 값임.
		
		// \n (New Line, Line Feed)
		// - 커서를 다음줄로 이동시키는 제어문자
		System.out.println("가\n나");
		//예제 안녕하세요 JAVA시간
		//System.out.println("안녕하세요\nJAVA시간")
		
		// \t(tab)
		// - 커서를 탭 크기만큼 이동시키는 제어문자
		// - 주로 줄맞출때 사용한다.
		System.out.println("이름\t : 홍길동");
		System.out.println("전화번호\t : 010-1234-5678");

		//문자열에서 특수한 기능을 하는 문자들을 출력할때 지장이 생긴다.
		// \ 뒤에 적으면 문자로 인식이 된다.
		// "Hi"
		//System.out.println(""Hi""); //에러발생
		System.out.println("\"Hi\""); // \가 두번째 세번째 쌍따옴표를 문자열로 바꾸어 준 것.
		
		
		//예제
		//C:\Users\sghlo\Desktop\송가현_Allcare+\송가현_Allcare+
		System.out.println("C:\\Users\\sghlo\\Desktop\\송가현_Allcare+\\송가현_Allcare+");
		//앞에있는 역슬래시가 뒤의 역슬래시를 문자로 바꾸어 준 것
		
	}

}
