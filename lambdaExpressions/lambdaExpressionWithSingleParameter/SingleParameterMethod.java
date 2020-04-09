package lambdaExpressions.lambdaExpressionWithSingleParameter;

import java.util.Scanner;

public class SingleParameterMethod {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int input = scanner.nextInt();

//      lambda expression with single parameter num
        MyFunctionalInterface functionalInterface = (num) -> num+5;
        System.out.println("Result: " + functionalInterface.incrementByFive(input));
    }
}
