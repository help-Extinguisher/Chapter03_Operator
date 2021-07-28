package ch03_1_operator_expression;

public class LogicalOperatorExample {
	public static void main(String[] args) {
		int charCode ='A';
		
		if((charCode>=65) & (charCode<=90) ) {
			System.out.println("대문자아님?");
		}
		
		
		if((charCode>=97) & (charCode<=112) ) {
			System.out.println("소문자아님?");
		}
		
		
		if(!(charCode<48) & !(charCode>57) ) {
			System.out.println("0~9 숫자아님?");
		}
		
		int value = 6;
		
		if( (value%2==0) | (value%3==0) ) {
			System.out.println("2 또는 3의 배수 아님?");
		}
		
		
		if( (value%2==0) || (value%3==0) ) {
			System.out.println("2 또는 3의 배수 아님?");
		}
		

			
		}
		
		
	}

