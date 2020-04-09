package functionalInterface.createFunctionalInterface;

public class UseOwnFunctionalInterface {

    public static void main(String[] args) {

        MyFunctionalInterface sum = (a, b) -> a + b;
        System.out.println("Result: " + sum.addMethod(11, 22));
    }
}
