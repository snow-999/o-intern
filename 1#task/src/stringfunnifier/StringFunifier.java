package src.stringfunnifier;

import src.operation.*;

public class StringFunifier  {

    private String boringString;
    private int[] startIndexes;
    private int[] endIndexes;
    private String[]  funOperations;

    public StringFunifier(String boringString, String[]  funOperations, int[] startIndexes, int[] endIndexes) {
        this.boringString = boringString;
        this.startIndexes = startIndexes;
        this.endIndexes = endIndexes;
        this.funOperations =  funOperations;
    }

    public String getFunnyString() {
        Copmare compare = new Copmare();
        Lower lower = new Lower();
        Reversed  rev = new Reversed();
        Sorted sort = new Sorted();
        Upper  upper = new Upper();
        StringBuilder result = new StringBuilder();
        int lastEnd = 0;
        for (int i = 0; i < startIndexes.length; i++) {
            int start = startIndexes[i];
            int end = endIndexes[i];
            String opration = funOperations[i];
            result.append(boringString, lastEnd, start);
            String subStr = boringString.substring(start, end + 1);
            if (opration.equals("REVERSE")) {
                result.append(rev.operate(subStr));
            }
            if (opration.equals("UPPERCASE")) {
                result.append(upper.operate(subStr));
            }
            if (opration.equals("SORT")) {
                result.append(sort.operate(subStr));
            }
            if (opration.equals("LOWERCASE")) {
                result.append(lower.operate(subStr));
            }
            if (opration.equals("COMPRESSION")) {
                result.append(compare.operate(subStr));
            }
            lastEnd = end + 1;
        }
        if (lastEnd < boringString.length()) {
            result.append(boringString.substring(lastEnd));
        }
        return result.toString();
    }
}
