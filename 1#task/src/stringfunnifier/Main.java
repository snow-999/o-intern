package src.stringfunnifier;

import src.operation.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String str = "ccchHJKkklmlmmml";
        int[] startIndexes = {1, 5, 7, 11, 13};
        int[] endIndexes = {3, 5, 10, 12, 14};
        List<Operations> funOperation = List.of(new Reversed(), new Upper(), new Sorted(), new Lower(), new Comparession());
        StringFunifier funifier = new StringFunifier(str, funOperation, startIndexes, endIndexes);
        String funnyString = funifier.getFunnyString();
        System.out.println(funnyString);
    }
}
