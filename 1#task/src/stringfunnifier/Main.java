package src.stringfunnifier;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import src.operation.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {
    public static void main(String[] args) {
        String str = "ccchHJKkklmlmmml";
        int[] startIndexes = {1, 5, 7, 11, 13};
        int[] endIndexes = {3, 5, 10, 12, 14};
        String[] funOperations = {"REVERSE", "UPPERCASE", "SORT", "LOWERCASE", "COMPRESSION"};

        StringFunifier funifier = new StringFunifier(str, funOperations, startIndexes, endIndexes);
        String funnyString = funifier.getFunnyString();

        System.out.println(funnyString);
    }
    @Test
    void doesGetFunnyWork() {
        String boringString = "ccchHJKkklmlmmml";
        String boringStringExpected = "c(hcc)H(J)K(kklm)(lm)(m1)l";
        int[] startIndexes = {1, 5, 7, 11, 13};
        int[] endIndexes = {3, 5, 10, 12, 14};
        String[] funOperations = {"REVERSE", "UPPERCASE", "SORT", "LOWERCASE", "COMPRESSION"};

        StringFunifier funifier = new StringFunifier(boringString, funOperations, startIndexes, endIndexes);
        String funnyString = funifier.getFunnyString();
        assertEquals(boringStringExpected, funnyString);
    }
}
