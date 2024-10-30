package src.stringfunnifier;

public class StringFunifier {
    private String boringString;
    private int[] startIndexes;
    private int[] endIndexes;

    public StringFunifier(String str, int[] startIndexes, int[] endIndexes) {
        this.boringString = str;
        this.startIndexes = startIndexes;
        this.endIndexes = endIndexes;
    }

    public String getFunnyString() {
        StringBuilder result = new StringBuilder();
        int lastEnd = 0;
        for (int i = 0; i < startIndexes.length; i++) {
            int start = startIndexes[i];
            int end = endIndexes[i];
            result.append(boringString, lastEnd, start);
            String subStr = boringString.substring(start, end + 1);
            StringBuilder revStr = new StringBuilder(new StringBuilder(subStr).reverse().toString());
            result.append("(").append(revStr).append(")");
            lastEnd = end + 1;
        }
        if (lastEnd < boringString.length()) {
            result.append(boringString.substring(lastEnd));
        }
        return result.toString();
    }

}
