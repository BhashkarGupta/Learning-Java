import java.util.Scanner;

public class Calculator {
    public static void calculate(int firstNum, int secondNum, char operator) {
        switch (operator) {
            case '+':
                System.out.printf("%d %c %d = %d%n", firstNum, operator, secondNum, (firstNum + secondNum));
                break;
            case '-':
                System.out.printf("%d %c %d = %d%n", firstNum, operator, secondNum, (firstNum - secondNum));
                break;
            case '*':
                System.out.printf("%d %c %d = %d%n", firstNum, operator, secondNum, (firstNum * secondNum));
                break;
            case '/':
                System.out.printf("%d %c %d = %f%n", firstNum, operator, secondNum, (float) firstNum / secondNum);
                break;
            case '%':
                System.out.printf("%d %c %d = %d%n", firstNum, operator, secondNum, (firstNum % secondNum));
                break;
            case '^':
                System.out.printf("%d %c %d = %d%n", firstNum, operator, secondNum, (int) Math.pow(firstNum, secondNum));
                break;
            default:
                System.out.println("Invalid Operation!");
        }
    }

    public static void main(String[] args) {
        System.out.println("BASIC CALCULATOR!");
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNum = userInput.nextInt();

        System.out.println("Enter second number: ");
        int secondNum = userInput.nextInt();
        
        userInput.nextLine(); // Clear the input buffer

        System.out.println("Enter operation (+, -, *, /, %, ^): ");
        String operatorInput = userInput.nextLine();
        char operator = operatorInput.charAt(0);
        calculate(firstNum, secondNum, operator);

        userInput.close();
    }
}
