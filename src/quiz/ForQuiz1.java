package quiz;

public class ForQuiz1 {

	public static void main(String[] args) {
		// 문제1. 1~200 사이의 숫자 중에서 (2 또는 3의 배수)가 아닌 수 들의 총 합을 구하시오
		
		// for(int 초기화식; 조건식; 증감식;) {
		int sum = 0; // (초기화(처음에 집어넣는) 값) 
		for(int i = 1; i <= 200; i++) {
			if(i % 2 != 0 && i % 3 !=0) // (조건식) 2 또는 3의 배수가 아닌 것들 
				sum = sum + i; 
		}
		System.out.println("총 합(2 또는 3의 배수 제외한):" + sum);
		
		
		
		// 문제2. 랜덤 알파벳 대문자 50개를 생성해서 출력하는 프로그램을 만들어보셔
		// 10줄마다 줄바꿈도 실행해야 합니다
		// 출력 예) DFDQWAZCXV SADFSGWQVC
		
		// 1. 사용하는 함수(메서드) Math.random()을 활용해서 작업합니다
		// 2. char 자료의 특징을 생각해서 작업을 진행합니다
		// -정수자료 -1글자 출력(ASCII 코드참조)
		
		char a = 'A'; //65, 영문자 개수 : 26
		int b = 66;
		int z = 90;
		System.out.printf("a의 코드 값 : %d", (int)a); // a는 십진수로 97
		System.out.printf("b의 코드 값 출력 : %c", (char)b);
		System.out.printf("b의 코드 값 출력 : %c", (char)z);
		
		//math.random() -> 0.0 ~ 1.0 실수 값들
		// (int)(Math.random() * 10) + 10 -> 0 + 10 ~ 9 +10
		int ran = (int)(Math.random() *10); // 0 ~ 9 (10개)
		ran = (int)(Math.random() * 26); // 0 ~ 25 (26개)
		ran = (int)(Math.random() * 26) +65;  // 65 ~ 90 (26개)


		// 영문자(대) -> 50개 생성
		// 영문자 개수 모를 경우 처음과 끝만 알 경우도
		int symbol_size = 'z' - 'a' + 1; // 1은 처리, 나는 빼고 계산하기 25
		
		for(int i = 0; i < 50; i++) {
			char ch = (char)((int)(Math.random()*26) + 65); 
		// 또는 int ch = 'A'+((int)(Math.random()*26));
			System.out.printf("%c",(char)ch);
			if (i % 10 == 9) System.out.println();
		}
 	}

}
