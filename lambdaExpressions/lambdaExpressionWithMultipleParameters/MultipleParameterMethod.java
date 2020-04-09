package lambdaExpressions.lambdaExpressionWithMultipleParameters;

public class MultipleParameterMethod {

    public static void main(String[] args) {

        // lambda expression with multiple arguments
        StringConcat concat = (str1, str2) -> str1 + str2;
        System.out.println("\nResult: " + concat.sconcat("Hello ", "World"));
    }
}
