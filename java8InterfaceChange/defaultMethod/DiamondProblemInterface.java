package java8InterfaceChange.defaultMethod;

public interface DiamondProblemInterface {

//  This is a default method
//  So we don't need to implement this method in the implementation
    default void defMethod()
    {
        System.out.println("Diamond Problem in default method.");
    }
}
