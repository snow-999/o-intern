package src.operation;

import java.util.Arrays;

public class Sort {
    public String _sort (String boringString){
        StringBuilder result = new StringBuilder();
        char[] ch = boringString.toCharArray();
        for (int k = 0; k < ch.length; k++) {
            Arrays.sort(ch);
        }
        String sortedStr = new String(ch);
        result.append("(").append(sortedStr).append(")");
        return result.toString();
    }
}
