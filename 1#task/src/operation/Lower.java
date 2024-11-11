package src.operation;

import src.interfaces.OperationDecorator;
import src.interfaces.Operations;

public class Lower extends OperationDecorator {
    public Lower (Operations operation) {
        super(operation);
    }
    @Override
    public String operate(String boringString) {
        boringString = super.operate(boringString);
        return boringString.toLowerCase();
    }
}
