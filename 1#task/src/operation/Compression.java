package src.operation;

public class Compression {
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
}
