package src.main.operation;

import src.main.interfaces.OperationDecorator;
import src.main.interfaces.impl.*;

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
