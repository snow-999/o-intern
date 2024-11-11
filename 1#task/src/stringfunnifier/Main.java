package src.stringfunnifier;

import src.interfaces.OperationIMPL;
import src.interfaces.Operations;
import src.operation.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String str = "ccchHJKkklmlmmml";
        int[] startIndexes = {1, 5, 7, 11, 13};
        int[] endIndexes = {3, 5, 10, 12, 14};
        List<Operations> funOperation = List.of(
                new Reversed(new Comparession(new OperationIMPL())),
                new Upper((new OperationIMPL())),
                new Comparession(new Upper(new Sorted(new OperationIMPL()))),
                new Comparession(new OperationIMPL()),
                new Reversed(new Upper(new Comparession(new OperationIMPL())))
        );
        StringFunifier funifier = new StringFunifier(str, funOperation, startIndexes, endIndexes);
        String funnyString = funifier.getFunnyString();
        System.out.println(funnyString);
    }
}
