package src.operation;

public  class Copmare implements Operations{
    @Override
    public String operate(String boringString) {
        StringBuilder result = new StringBuilder();
        StringBuilder copmartionStr = new StringBuilder();
        int repeted = 1;
        for (int j = 0; j < boringString.length(); j++) {
            if (j < boringString.length() - 1) {
                if (boringString.charAt(j) == boringString.charAt(j+1)) {
                    repeted++;
                }
                if (boringString.charAt(j) != boringString.charAt(j+1)) {
                    copmartionStr.append(boringString.charAt(j)).append(repeted);
                    repeted = 1;
                }
            }
            if (j == boringString.length() - 1) {
                copmartionStr.append(boringString.charAt(j)).append(1);
            }
        }

        result.append("(").append(copmartionStr).append(")");
        return result.toString();
    }
}