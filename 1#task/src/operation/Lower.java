package src.operation;

public class Lower implements Operations{
    @Override
    public String operate(String boringString) {
        StringBuilder result = new StringBuilder();
        String UpperStr = boringString.toLowerCase();
        result.append("(").append(UpperStr).append(")");
        return result.toString();
    }
}
