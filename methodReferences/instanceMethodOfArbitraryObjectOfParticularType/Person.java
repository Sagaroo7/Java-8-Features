package methodReferences.instanceMethodOfArbitraryObjectOfParticularType;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void printName()
    {
        System.out.println(name);
    }
}
