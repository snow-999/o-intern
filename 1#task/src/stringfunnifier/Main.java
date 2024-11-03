package src.stringfunnifier;

public class Main {
    public static void main(String[] args) {
        String str = "ccchHJKkklmlmmml";
        int[] startIndexes = {1, 5, 7, 11, 13};
        int[] endIndexes = {3, 5, 10, 12, 14};
        String[] funOperations = {"REVERSE", "UPPERCASE", "SORT", "LOWERCASE", "COMPRESSION"};

        StringFunifier funifier = new StringFunifier(str, funOperations, startIndexes, endIndexes);
        String funnyString = funifier.getFunnyString();

        System.out.println(funnyString);
    }
}
