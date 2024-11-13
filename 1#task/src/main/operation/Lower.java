package src.main.operation;

import src.main.interfaces.OperationDecorator;
import src.main.interfaces.impl.*;

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
