package src.operation;

public class Upper implements Operations {
    @Override
    public String operate(String boringString) {
        StringBuilder result = new StringBuilder();
        String UpperString = boringString.toUpperCase();
        result.append("(").append(UpperString).append(")");
        return result.toString();
    }
}
