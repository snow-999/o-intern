package src.operation;

public class LowerCase {
    public String TolowerCase(String boringString){
        StringBuilder result = new StringBuilder();
        String UpperStr = boringString.toLowerCase();
        result.append("(").append(UpperStr).append(")");
        return result.toString();
    }
}
