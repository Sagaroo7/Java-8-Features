package java8InterfaceChange.staticMethod;

public interface StaticMethodInterface {

//  This is a Default Method in Interface
//  So we don't need to implement this method in the implementation class
    default void defMethod()
    {
        System.out.println("Newly added Default Method in Interface.");
    }

//  This is Static Method in interface
//  It's similar to Default Method except that we can't override them
//  we don't need to implement this method in the implementation class like Default Method
    static void staticMethod()
    {
        System.out.println("Newly added Static Method in Interface.");
    }

//  Already existing public and abstract method
//  We must need to implement this method in implementation classes.
    void existingMethod(String str);
}
