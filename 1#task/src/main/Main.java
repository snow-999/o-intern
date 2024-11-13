package src.main;

import src.main.interfaces.impl.*;
import src.main.interfaces.*;
import src.main.operation.*;
import src.main.stringfunnifier.StringFunifier;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String str = "ccchHJKkklmlmmml";
        int[] startIndexes = {1, 5, 7, 11, 13};
        int[] endIndexes = {3, 5, 10, 12, 14};
        List<Operations> funOperation = List.of(
                new Reversed(new Compression(new OperationImpl())),
                new Upper((new OperationImpl())),
                new Compression(new Upper(new Sorted(new OperationImpl()))),
                new Compression(new OperationImpl()),
                new Reversed(new Upper(new Compression(new OperationImpl())))
        );
        StringFunifier funifier = new StringFunifier(str, funOperation, startIndexes, endIndexes);
        String funnyString = funifier.getFunnyString();
        System.out.println(funnyString);
    }
}
