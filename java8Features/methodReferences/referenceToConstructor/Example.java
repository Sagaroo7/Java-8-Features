package java8Features.methodReferences.referenceToConstructor;

public class Example {

    public static void main(String[] args) {

//      Method reference to a Constructor
        MyInterface myInterface = Hello::new;
        myInterface.display("Hello World!");
    }
}
