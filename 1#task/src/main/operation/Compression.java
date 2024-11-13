package src.main.operation;

import src.main.interfaces.OperationDecorator;
import src.main.interfaces.impl.*;

public class Compression extends OperationDecorator {
    public Compression(Operations operation) {
        super(operation);
    }
    @Override
    public String operate(String boringString) {
        boringString = super.operate(boringString);
        StringBuilder copmartionStr = new StringBuilder();
        int repeted = 1;
        for (int j = 0; j < boringString.length(); j++) {
            if (j < boringString.length() - 1) {
                if (boringString.charAt(j) == boringString.charAt(j + 1)) {
                    repeted++;
                }
                if (boringString.charAt(j) != boringString.charAt(j + 1)) {
                    copmartionStr.append(boringString.charAt(j)).append(repeted);
                    repeted = 1;
                }
            }
            if (j == boringString.length() - 1) {
                copmartionStr.append(boringString.charAt(j)).append(repeted);
            }
        }
        return copmartionStr.toString();
    }
}