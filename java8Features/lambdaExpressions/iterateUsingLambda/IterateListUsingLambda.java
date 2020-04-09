package java8Features.lambdaExpressions.iterateUsingLambda;

import java.util.ArrayList;
import java.util.List;

public class IterateListUsingLambda {

    public static void main(String[] args) {

        List names = new ArrayList<>();
        names.add("Ajay");
        names.add("Ben");
        names.add("Cathy");
        names.add("Dinesh");
        names.add("Tom");

//        Iterate without using Lambda
//        Iterator iterator = names.iterator();
//        while (iterator.hasNext())
//        {
//            System.out.println(iterator.next());
//        }

        names.forEach(allName -> System.out.println(allName));
    }
}
