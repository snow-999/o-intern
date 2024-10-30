package src.StringFunnifier;

public class Main {
    public static void main(String[] args) {
        String str = "abbccCDdBCCcc";
        int[] startIndexes = {1, 5, 7, 11};
        int[] endIndexes = {3, 5, 10, 12};

        StringFunifier funifier = new StringFunifier(str, startIndexes, endIndexes);
        String funnyString = funifier.getFunnyString();

        System.out.println(funnyString);
    }
}
