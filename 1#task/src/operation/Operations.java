package src.operation;

import java.util.Arrays;

public class Operations implements Copmare, Lower, Reversed, Sorted, Upper{
    @Override
    public String copression(String boringString) {
        StringBuilder result = new StringBuilder();
        int repeted = 1;
        for (int j = 0; j < boringString.length(); j++) {
            if (j < boringString.length() - 1) {
                if (boringString.charAt(j) == boringString.charAt(j+1)) {
                    repeted++;
                }
            }
        }
        String copmartionStr = boringString.charAt(0) + "";
        result.append("(").append(copmartionStr).append(repeted).append(")");
        return result.toString();
    }

    @Override
    public String TolowerCase(String boringString) {
        StringBuilder result = new StringBuilder();
        String UpperStr = boringString.toLowerCase();
        result.append("(").append(UpperStr).append(")");
        return result.toString();
    }

    @Override
    public String reversed(String boringString) {
        return "(" + new StringBuilder(boringString).reverse() + ")";
    }

    @Override
    public String _sort(String boringString) {
        StringBuilder result = new StringBuilder();
        char[] ch = boringString.toCharArray();
        for (int k = 0; k < ch.length; k++) {
            Arrays.sort(ch);
        }
        String sortedStr = new String(ch);
        result.append("(").append(sortedStr).append(")");
        return result.toString();
    }

    @Override
    public String toUpperCase(String boringString) {
        StringBuilder result = new StringBuilder();
        String UpperString = boringString.toUpperCase();
        result.append("(").append(UpperString).append(")");
        return result.toString();
    }
}
