package src.stringfunnifier;

import src.operation.*;

public class StringFunifier extends Operations {

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
        Operations op = new Operations();
        StringBuilder result = new StringBuilder();
        int lastEnd = 0;
        for (int i = 0; i < startIndexes.length; i++) {
            int start = startIndexes[i];
            int end = endIndexes[i];
            String opration = funOperations[i];
            result.append(boringString, lastEnd, start);
            String subStr = boringString.substring(start, end + 1);
            if (opration.equals("REVERSE")) {
                result.append(op.reversed(subStr));
            }
            if (opration.equals("UPPERCASE")) {
                result.append(op.toUpperCase(subStr));
            }
            if (opration.equals("SORT")) {
                result.append(op._sort(subStr));
            }
            if (opration.equals("LOWERCASE")) {
                result.append(op.TolowerCase(subStr));
            }
            if (opration.equals("COMPRESSION")) {
                result.append(op.copression(subStr));
            }
            lastEnd = end + 1;
        }
        if (lastEnd < boringString.length()) {
            result.append(boringString.substring(lastEnd));
        }
        return result.toString();
    }
}
