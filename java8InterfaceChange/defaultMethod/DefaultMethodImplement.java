package java8InterfaceChange.defaultMethod;

public class DefaultMethodImplement implements DefMethodInterface, DiamondProblemInterface {

//  To avoid Diamond Problem, we have to override the method that we want to use
//  Otherwise it shows an error because both interface have same method name
//  So the JVM confused, which interface's method JVM has to call!
    @Override
    public void defMethod() {
        System.out.println("Newly added Default Method in Interface.");
        System.out.println("Avoid Diamond Problem by override this method.");
    }

    //  Implementing abstract method
    @Override
    public void existingMethod(String str) {

        System.out.println("String is: " + str);
    }

    public static void main(String[] args) {

        DefaultMethodImplement implement = new DefaultMethodImplement();

//      Calling the Abstract method of interface
        implement.existingMethod("Java 8 new features!");

//      Calling the Default method of interface
        implement.defMethod();
    }
}
