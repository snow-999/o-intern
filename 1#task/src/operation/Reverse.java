package src.operation;

public class Reverse {
    public String reversed(String boringString) {
        return "(" + new StringBuilder(boringString).reverse() + ")";
    }
}
