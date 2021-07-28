package ch03_1_operator_expression;

public class CompareOperatorExample2 {
	public static void main(String[] args) throws InterruptedException {
//		int v2 = 1;
//		double v3 = 1.0;
//		System.out.printf("%b" + (v2 == v3));
//		
//		double v4 = 0.1;
//		float v5 = 0.1f;
//		System.out.println(v4 == v5);
//		System.out.println((float)v4 == v5);
		
		int count = 10;
		while(count != 0) {	
			Thread.sleep(500);	
			System.out.println(count--);
		}
		
		System.out.println("카운트 끝");
	}

}

