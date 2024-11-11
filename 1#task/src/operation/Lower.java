package src.operation;

public class Lower implements Operations{
    @Override
    public String operate(String boringString) {
        return boringString.toLowerCase();
    }
}
