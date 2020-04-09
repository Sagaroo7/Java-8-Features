package java8Features.java8InterfaceChange.staticMethod;

public class StaticMethodImplement implements StaticMethodInterface {

//  Implementing abstract method
    @Override
    public void existingMethod(String str) {
        System.out.println("String is: " + str);
    }

    public static void main(String[] args) {

        StaticMethodImplement implement = new StaticMethodImplement();

//      Calling abstract method of interface
        implement.existingMethod("Java 8 new features!");

//      Calling Static method of interface
        StaticMethodInterface.staticMethod();

//      Calling Default method of interface
        implement.defMethod();
    }
}
