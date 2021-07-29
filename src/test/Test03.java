package test;

public class Test03 {

		
//		while문과 Math.radom()메소드를 이용해서 2개의 주사위를 던졌을 때
//		나오는 눈을 (눈1, 눈2)형태로 출력하고, 눈의 합이 5가 아니면 계속 주사위를 던지고,
//		눈의 합이 5이면 실행을 멈추는 코드를 작성해 보세요.
//		눈의 합이 5가 되는 조합은 (1,4), (4,1), (2,3), (3,2)입니다.
		
		
//		public class getFiveInDice {
//		   public static void main(String[] args) {
			      // code : 반복문 선언(무한루프이고 안에서 주사위의 눈 값이 5인 경우에 반복문을 탈출하는 문장을 써주어야 함)
			         // ■[hint1] : 주사위의 눈 값은 1~6이다.
			         // ■[hint2] : 랜덤은 0.0~1.0의 랜덤한 값을 생성하므로 생성된 값에 2가지 처리를 해주어야 함
			         // ■[hint3] : 만들어진 값은 double이므로 int로 형변환을 해주어야 함(Integer.parseInt 아님)
			         // code : 변수 a에 랜덤을 이용한 주사위 눈 값 생성
			         // code : 변수 b에 랜덤을 이용한 주사위 눈 값 생성

			         // ■[hint] : 형태에 맞게 "출력"해야 함
			         // code : 주사위 눈 a와 b를 (a, b) 형태로 콘솔에 출력

			         // ■[hint] : 조건문(if) 사용 / 조건이 true일 때 반복문을 탈출!!!
			         // code : 조건문 사용, a+b가 5일 때 탈출하게 해야 함(라인은 1줄or3줄이 나옴)
			      // code : 반복문 종료(스코프겠죠?)
			   
			   
//---------------------------------------------------------------------------------------------------
		
	public static void main(String[] args) {
		
		
				
		 while (true) {
			 int a = (int) (Math.random() * 6 + 1);
			 int b = (int) (Math.random() * 6 + 1);
			 int c = a+b;
			 
			 if (c != 5) {
				 System.out.println("(" + a + " , " + b + ")");
				 System.out.println("주사위의 합은 " + (a+b) + "입니다."); 
		 	 }
		 
			 if (c == 5) {
				 System.out.println("(" + a + " , " + b + ")");
				 System.out.println("눈의 합이 5가 나왔으므로 실행을 멈췄습니다.");
				 break;
			 }
		 }			   
	}
}




			





