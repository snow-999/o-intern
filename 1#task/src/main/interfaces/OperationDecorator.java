package src.main.interfaces;

import src.main.interfaces.impl.*;

public abstract class OperationDecorator implements Operations{
    private final Operations operation;

    public OperationDecorator(Operations operation)
    {
        this.operation = operation;
    }
    @Override
    public String operate(String boringString){
        return  operation.operate(boringString);
    }
}