package java8Features.lambdaExpressions.iterateUsingLambda;

import java.util.ArrayList;
import java.util.List;

public class IterateCollectionsUsingLambda {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Rick");
        list.add("Negan");
        list.add("Daryl");
        list.add("Glenn");
        list.add("Carl");

        list.forEach(names -> System.out.println(names));
    }
}
