import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CalculatorOne {
    public static void main(String[] args) {
        System.out.println("calculator");
        System.out.println("----------");
        while(true){
            System.out.println("Enter two number you want to calculate");
            Scanner sc = new Scanner(System.in);
            int operand_one = sc.nextInt();
            int operand_two = sc.nextInt();
            System.out.println("Choose the the operator for the given operation");
            System.out.println(" + : For Addition");
            System.out.println(" - : For Substraction");
            System.out.println(" * : For Multiplication");
            System.out.println(" / : For Division");
            String operator = sc.next();
            switch (operator) {
                case "+":
                    int add_result = (operand_one + operand_two);
                    System.out.println("The value after addition is " + add_result);
                    break;
                case "-":
                    int sub_result = (operand_one - operand_two);
                    System.out.println("The value after Substraction is " + sub_result);
                    break;
                case "*":
                    int mul_result = (operand_one * operand_two);
                    System.out.println("The value after Multiplication is " + mul_result);
                    break;
                case "/":
                    try {
                        int div_result = (operand_one / operand_two);
                        System.out.println("The value after Division is " + div_result);
                    } catch (ArithmeticException e) {
                        System.out.println("For division your denominator can't be Zero , try again ");
                    }
                    break;
                default:
                    System.out.println("You Have to select operator from the above mention, \n Try Again,Choose the correct operator this time!!");

            }
            System.out.println("Are you want to continue, \nYes or No");
            String input = sc.next();
            if(input.equalsIgnoreCase("no"))
            {
                System.out.println("Thanks for using the calculator");
                break;
            }
            sc.close();
        }

    }
}