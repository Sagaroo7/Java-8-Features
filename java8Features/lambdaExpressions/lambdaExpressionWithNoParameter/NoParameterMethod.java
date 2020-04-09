package java8Features.lambdaExpressions.lambdaExpressionWithNoParameter;

public class NoParameterMethod {

    public static void main(String args[]) {
        // lambda expression
        MyFunctionalInterface msg = () -> {
            return "Hello";
        };
        System.out.println(msg.sayHello());
    }
}

//  Note:
//  You can use methods from the interface without use of implement keyword