package src.operation;

public class UpperCase {
    public String toUpperCase(String boringString) {
        StringBuilder result = new StringBuilder();
        String UpperString = boringString.toUpperCase();
        result.append("(").append(UpperString).append(")");
        return result.toString();
    }
}
