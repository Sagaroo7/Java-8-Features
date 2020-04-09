package java8Features.methodReferences.instanceMethodOfObject1;

public class Comparator {

    public int compareMethod(Integer a, Integer b)       // Used wrapper class "Integer" to use their function
    {
        return a.compareTo(b);              // we can use "compareTo" function because we use wrapper class above
    }
}
