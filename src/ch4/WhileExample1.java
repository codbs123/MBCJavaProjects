package ch4;

import java.util.Scanner;

public class WhileExample1 {
	
	public static void main(String[] args) {
		// while문 조건을 보고 실행
		// for문 보다 더 자유도 높은 반복문
		// for문은 초기화값, 조건, 증가값 기술하는 형식으로 문법 구성되어 있음
		// 하지만 while은 문법상 조건만 봄
		/*
		 * while(condition) {
		 * 	조건이 참일 때 실행 할 코드
		 * }
		 * 
		 */
		
		int i=0; // for문의 초기값
		
		while (i < 10) { // 조건식
			i++; // 증감값
			System.out.println(i);
		
		}
		
		// for (int i=0; i < 10; i++) System.out.println(i);
		
		// 무한 반복
		while (true) {
			System.out.println(i += 10000);
			if(i % 20000 == 0) {
				continue;  // 반복문에서 contiune를 만나면 조건식으로 이동
			}
			if (i < 0)
				break;  // 반복문에서 반복을 종료하고자 할 때 사용하는 키워드 // 오버플로가 일어나면 음수됨 그래서 멈춤
			
 		}
		
		// do - while
		// while 반복을 하는데 먼저 한번 실행하고 조건을 보는 반복문 // 잘사용 ㄴㄴ
		i = 0; 
		Scanner scan = new Scanner(System.in);
		
//		while ((i = scan.nextInt())!= 0) {
//			System.out.println("i가 0이 아닙니다");
//		}

		// do while
		do {
			System.out.print(">");
			i = scan.nextInt();
			System.out.println("i가 0이어도 일단 한번은 실행합니다");
		} while(i!=0);
		
		
		  // while문으로 위에 코드를 변경해서 동일하게 동작하게 만들어 보세요
	      //System.out.println("while문으로 변경한 코드 출력");

	    	  
	      
	      
		
		
	}
}
