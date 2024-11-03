package src.stringfunnifier;

import java.util.ArrayList;
import java.util.Arrays;

public class StringFunifier {
    private String boringString;
    private int[] startIndexes;
    private int[] endIndexes;
    private String[]  funOperations;

    public StringFunifier(String boringString, String[]  funOperations, int[] startIndexes, int[] endIndexes) {
        this.boringString = boringString;
        this.startIndexes = startIndexes;
        this.endIndexes = endIndexes;
        this. funOperations =  funOperations;
    }

    public String getFunnyString() {
        StringBuilder result = new StringBuilder();
        int lastEnd = 0;
        for (int i = 0; i < startIndexes.length; i++) {
            int start = startIndexes[i];
            int end = endIndexes[i];
            String opration = funOperations[i];
            result.append(boringString, lastEnd, start);
            String subStr = boringString.substring(start, end + 1);
            if (opration.equals("REVERSE")) {
                result.append("(").append(new StringBuilder(subStr).reverse()).append(")");
            }
            if (opration.equals("UPPERCASE")) {
                String UpperStr = new String(subStr).toUpperCase();
                result.append("(").append(UpperStr).append(")");
            }
            if (opration.equals("SORT")) {
                char[] ch = subStr.toCharArray();
                for (int k = 0; k < ch.length; k++) {
                    Arrays.sort(ch);
                }
                String sortedStr = new String(ch);
                result.append("(").append(sortedStr).append(")");
            }
            if (opration.equals("LOWERCASE")) {
                String UpperStr = new String(subStr).toLowerCase();
                result.append("(").append(UpperStr).append(")");
            }
            if (opration.equals("COMPRESSION")) {
                int repeted = 1;
                for (int j = 0; j < subStr.length(); j++) {
                    if (j < subStr.length() - 1) {
                    if (subStr.charAt(j) == subStr.charAt(j+1)) {
                        repeted++;
                        }
                    }
                }
                String copmartionStr = new String(subStr.charAt(0) + "");
                result.append("(").append(copmartionStr).append(repeted).append(")");
            }

            lastEnd = end + 1;
        }
        if (lastEnd < boringString.length()) {
            result.append(boringString.substring(lastEnd));
        }
        return result.toString();
    }

}
