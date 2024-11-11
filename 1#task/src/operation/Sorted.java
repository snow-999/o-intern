package src.operation;

import src.interfaces.OperationDecorator;
import src.interfaces.Operations;

import java.util.Arrays;

public class Sorted  extends OperationDecorator {
    public Sorted (Operations operation) {
        super(operation);
    }
    @Override
    public String operate(String boringString) {
        boringString = super.operate(boringString);
        char[] ch = boringString.toCharArray();
        for (int k = 0; k < ch.length; k++) {
            Arrays.sort(ch);
        }
        return new String(ch);
    }
}
