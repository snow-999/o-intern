package src.operation;

import src.interfaces.OperationDecorator;
import src.interfaces.Operations;

public class Upper extends OperationDecorator {
    public Upper (Operations operation) {
        super(operation);
    }
    @Override
    public String operate(String boringString) {
        boringString = super.operate(boringString);
        return boringString.toUpperCase();
    }
}
