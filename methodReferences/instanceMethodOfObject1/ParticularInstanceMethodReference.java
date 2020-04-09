package methodReferences.instanceMethodOfObject1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ParticularInstanceMethodReference {

    public static void main(String[] args) {

        final List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Comparator comparator = new Comparator();

//      Method Reference
        Collections.sort(list, comparator::compareMethod);

//      Lambda Expression
        Collections.sort(list, (a,b) -> comparator.compareMethod(a,b));
    }
}
