package src.main.operation;

import src.main.interfaces.OperationDecorator;
import src.main.interfaces.impl.*;

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
