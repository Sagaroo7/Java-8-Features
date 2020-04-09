package java8Features.methodReferences.instanceMethodOfObject;

public class InstanceMethodReference {

    public void myMethod()
    {
        System.out.println("Instance Method.");
    }

    public static void main(String[] args) {

        InstanceMethodReference instanceMethodReference = new InstanceMethodReference();

//      Method reference using the object of the class
        DisplayInterface displayInterface = instanceMethodReference::myMethod;

//      Calling the method of functional interface
        displayInterface.display();
    }
}
