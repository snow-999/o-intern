package src.operation;

public class Upper implements Operations {
    @Override
    public String operate(String boringString) {
        return boringString.toUpperCase();
    }
}
