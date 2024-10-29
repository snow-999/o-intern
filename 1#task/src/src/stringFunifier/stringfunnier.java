package stringFunifier;

import java.util.Arrays;

class StringFunifier {
    private String str;
    private int[] startIndexes;
    private int[] endIndexes;

    public StringFunifier(String str, int[] startIndexes, int[] endIndexes) {
        this.str = str;
        this.startIndexes = startIndexes;
        this.endIndexes = endIndexes;
    }

    public String getFunnyString() {
        StringBuilder result = new StringBuilder();
        int lastEnd = 0;
        for (int i = 0; i < startIndexes.length; i++) {
            int start = startIndexes[i];
            int end = endIndexes[i];
            result.append(str, lastEnd, start);
            String subStr = str.substring(start, end + 1);
            String revStr = new StringBuilder(subStr).reverse().toString();
            result.append("(").append(revStr).append(")");
            lastEnd = end + 1;
        }
        if (lastEnd < str.length()) {
            result.append(str.substring(lastEnd));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str = "abbccCDdBCCcc";
        int[] startIndexes = {1, 5, 7, 11};
        int[] endIndexes = {3, 5, 10, 12};

        StringFunifier funifier = new StringFunifier(str, startIndexes, endIndexes);
        String funnyString = funifier.getFunnyString();

        System.out.println(funnyString);
    }
}
