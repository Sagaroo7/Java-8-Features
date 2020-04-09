package methodReferences.instanceMethodOfArbitraryObjectOfParticularType;

import java.util.Arrays;
import java.util.List;

public class ArbitraryInstanceMethodReference {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(new Person("dan"), new Person("laura"));

//      Method Reference
        people.forEach(Person::printName);

//      Lambda Expression
        people.forEach(person -> person.printName());

//      Normal
        for (Person person: people)
        {
            person.printName();
        }
    }
}
