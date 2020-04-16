
import java.util.Scanner;

public class ArithmeticCalculator {
	
	//As a developer, write a Java code to create a calculator to perform the four basic arithmetic operations (addition, subtraction, multiplication, and division).
	//Core Java concepts: Variables, data types, operators, type casting, control statements, class, objects, access specifiers, and core keywords like final, this, and static


	public static void main(String[] args) {
		double num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");

        /* We are using data type double so that user
         * can enter integer as well as floating point
         * value
         */
        num1 = scanner.nextDouble();
        System.out.print("Enter second number:");
        num2 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        scanner.close();
        double output;

        Calculator cal =new Calculator();
        switch(operator)
        {
            case '+':
            	output=cal.addition(num1, num2);
                break;

            case '-':
            	output = cal.subtraction(num1, num2);
                break;

            case '*':
            	output = cal.multiplication(num1, num2);
                break;

            case '/':
            	output = cal.division(num1, num2);
                break;

            /* If user enters any other operator or char apart from
             * +, -, * and /, then display an error message to user
             * 
             */
            default:
                System.out.printf("You have entered wrong operator");
                return;
        }
        System.out.print(output);
		
		
		
	}

}


class Calculator {
	
	double result;
	
	public double addition(double num1, double num2) {
		
		
		
		 return result=num1+num2;
	}
	
	public double subtraction(double num1, double num2) {
		return result=num1-num2;
	}
	
	public double multiplication(double num1, double num2) {
		return result=num1*num2;
	}
	
	public double division(double num1, double num2) {
		return result=num1/num2;
	}
	 
	 
}
 