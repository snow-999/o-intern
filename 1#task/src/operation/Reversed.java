package src.operation;

public class Reversed implements Operations{
    @Override
    public String operate(String boringString) {
        return  new StringBuilder(boringString).reverse().toString();
    }
}
