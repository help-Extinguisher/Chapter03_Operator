package ch03_1_operator_expression;

public class LogicalOperatorExample {
	public static void main(String[] args) {
		int charCode ='A';
		
		if((charCode>=65) & (charCode<=90) ) {
			System.out.println("�빮�ھƴ�?");
		}
		
		
		if((charCode>=97) & (charCode<=112) ) {
			System.out.println("�ҹ��ھƴ�?");
		}
		
		
		if(!(charCode<48) & !(charCode>57) ) {
			System.out.println("0~9 ���ھƴ�?");
		}
		
		int value = 6;
		
		if( (value%2==0) | (value%3==0) ) {
			System.out.println("2 �Ǵ� 3�� ��� �ƴ�?");
		}
		
		
		if( (value%2==0) || (value%3==0) ) {
			System.out.println("2 �Ǵ� 3�� ��� �ƴ�?");
		}
		

			
		}
		
		
	}

