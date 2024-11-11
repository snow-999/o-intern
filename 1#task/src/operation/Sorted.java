package src.operation;

import java.util.Arrays;

public class Sorted  implements Operations{
    @Override
    public String operate(String boringString) {
        char[] ch = boringString.toCharArray();
        for (int k = 0; k < ch.length; k++) {
            Arrays.sort(ch);
        }
        return new String(ch);
    }
}
