package src.main.operation;

import src.main.interfaces.OperationDecorator;
import src.main.interfaces.impl.*;

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
