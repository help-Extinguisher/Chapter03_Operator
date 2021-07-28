package ch03_1_operator_expression;

public class CompareOperatorExample1 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		
		System.out.printf("result1= " + result1 + "\n");
		System.out.printf("result2= " + result2 + "\n");
		System.out.printf("result3= " + result3 + "\n");
		
		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = (char1 < char2);
		System.out.printf("result4= " + result4 + "\n");
	}

}
