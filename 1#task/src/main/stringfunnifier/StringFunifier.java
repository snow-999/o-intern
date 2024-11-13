package src.main.stringfunnifier;

import src.main.interfaces.*;
import src.main.operation.*;
import java.util.List;
import src.main.interfaces.impl.*;

public class StringFunifier  {

    private String boringString;
    private int[] startIndexes;
    private int[] endIndexes;
    private List <Operations> funOperations;

    public StringFunifier(String boringString,List <Operations> funOperations , int[] startIndexes, int[] endIndexes) {
        this.boringString = boringString;
        this.startIndexes = startIndexes;
        this.endIndexes = endIndexes;
        this.funOperations = funOperations;
    }

    public String getFunnyString() {
        StringBuilder result = new StringBuilder();
        int lastEnd = 0;
        for (int i = 0; i < startIndexes.length; i++) {
            int start = startIndexes[i];
            int end = endIndexes[i];
            result.append(boringString, lastEnd, start);
            String subStr = boringString.substring(start, end + 1);
            String subOperationString = funOperations.get(i).operate(subStr);
            result.append("(").append(subOperationString).append(")");
            lastEnd = end + 1;
        }
        if (lastEnd < boringString.length()) {
            result.append(boringString.substring(lastEnd));
        }
        return result.toString();
    }
}
