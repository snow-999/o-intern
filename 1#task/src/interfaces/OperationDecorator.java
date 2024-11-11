package src.interfaces;

public abstract class OperationDecorator implements Operations{
    private Operations operation;
    public OperationDecorator(Operations operation) {
        this.operation = operation;
    }
    @Override
    public String operate(String boringString){
        return  operation.operate(boringString);
    }
}