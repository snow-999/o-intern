package src.operation;

public class Reversed implements Operations{
    public String operate(String boringString) {
        return "(" + new StringBuilder(boringString).reverse() + ")";
    }
}
