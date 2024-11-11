package src.operation;

import src.interfaces.OperationDecorator;
import src.interfaces.Operations;

public class Reversed extends OperationDecorator {
    public Reversed (Operations operation) {
        super(operation);
    }
    @Override
    public String operate(String boringString) {
        boringString = super.operate(boringString);
        return  new StringBuilder(boringString).reverse().toString();
    }
}
