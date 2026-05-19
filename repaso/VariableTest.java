package repaso;

public class VariableTest {
	
	public static void main(String[] args) {
		// primitive variables
		//arithmetic operators
		var num1 = 1.0;
		int num2 = 2;
		//explicit conversion
		int result = (int)(num1 + num2);
		System.out.println(result);
		result = Calculator.sum((int)num1, num2);
		
		double result2 = num1 / num2;   
		result2 = Calculator.division(num1, num2);
		System.out.println(result2);
		
		System.out.println(Calculator.modulus(3.2f, 3));


		
		boolean stop = false;
		String color = "green";
		if(color == "green") {
			stop = false;
		}
		
		
		System.out.println(stop);
		// reference variables
		
	}
	
}
