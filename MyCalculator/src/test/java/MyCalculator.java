import java.util.Scanner;

public class MyCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to the MyCalculator!");

		double num1, num2;
		char operator;

		do {
			System.out.print("Enter first number: ");
			num1 = scanner.nextDouble();

			System.out.print("Enter second number: ");
			num2 = scanner.nextDouble();

			System.out.print("Enter an operator (+, -, *, /, %, ^, sin, cos, tan, sqrt): ");
			operator = scanner.next().charAt(0);

			double result;

			switch (operator) {
			case '+':
				result = num1 + num2;
				break;

			case '-':
				result = num1 - num2;
				break;

			case '*':
				result = num1 * num2;
				break;

			case '/':
				result = num1 / num2;
				break;

			case '%':
				result = num1 % num2;
				break;

			case '^':
				result = Math.pow(num1, num2);
				break;

			case 's':
				result = Math.sin(num1);
				break;

			case 'c':
				result = Math.cos(num1);
				break;

			case 't':
				result = Math.tan(num1);
				break;

			case 'q':
				result = Math.sqrt(num1);
				break;

			default:
				System.out.println("Invalid operator entered");
				return;
			}

			System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
			System.out.print("Do you want to continue? (y/n): ");
		} while (scanner.next().charAt(0) == 'y');

		System.out.println("Thank you for using the scientific calculator!");
	}
}
