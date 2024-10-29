package ch4;

public class ForExample2 {

	public static void main(String[] args) {
		// 다중 for문
		// 2중 for문
		for (int i = 0; i < 5; i++) { // 상위 for문
			for (int j = 0; j < 5; j++) { // 하위 for문
				// System.out.println("i가 "+i+"이고, j가 "+j+"인 경우");
				System.out.print(i+j+" ");
				
			}
		}

		// 3중 for문
		for (int i = 0; i < 10; i++) {
			System.out.println("=============== 바깥쪽 반복문 : "+i);
			for (int j = 0; j < 10; j++) {
					System.out.println("=============== 안쪽 반복문 : "+i+"-"+j);
					for (int k = 0; k < 10; k++) {
						System.out.println("+++ 제일 안쪽 반복문 : "+i+"-"+j+"-"+k);
					}
					
					
					
				}
			
		}
		// 예제1. 구구단을 출력해보자
	   // 2단 ~ 9단까지
		for(int dan = 2; dan <= 9; dan++) { // 2 ~ 9단
			System.out.println("===== "+dan+"단 =====");
			for (int gop = 1; gop <= 9; gop++)  {
				System.out.println(dan + "x" +gop+ "=" +(dan*gop));
				// 또는 이렇게 해도됨 System.out.printf("%d x %d = %d\n",dan, gop, dan*gop);
				
			}
			
		}
	
	// 예제2. 구구단 출력
	/* 
	 * 2 x 1 = 2  3 x 1 = 3  4 x 1 = 4
	 * 2 x 2 = 4  3 x 2 = 6  4 x 2 = 8
	 * ... 
	 */
		
		for(int gop = 1; gop <= 9; gop ++) { // 상위가 곱
			
			for (int dan = 2; dan <= 9; dan++)  {
				System.out.printf("%dx%d=%d\t", dan, gop, dan*gop);
			}
			System.out.println(); // 줄바꿈 하기 위해 넣은것
		}
				
		// 초기화 식에서 부동 소수점을 쓰는 float 타입을 사용하지 않도록 주의
		for(float x = 0.1f; x <= 1.0f; x+=0.1) {
			System.out.println(x);
		}
		
		
		
		
		
		
		
		
	
	} //main()

}//class	
	
	
	

    
