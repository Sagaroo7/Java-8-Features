package java8InterfaceChange.defaultMethod;

public interface DefMethodInterface {

//  This is a default method
//  So we don't need to implement this method in the implementation
    default void defMethod()
    {
        System.out.println("Newly added default method in Interface.");
    }

//  Already existing public and abstract method
//  We must need to implement this method in implementation classes
//  If you don't implement this method then it shows error when you implements your interface.
    void existingMethod(String str);
}
