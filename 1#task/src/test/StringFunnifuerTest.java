package src.test;

import org.junit.jupiter.api.Test;
import src.interfaces.OperationIMPL;
import src.interfaces.Operations;
import src.operation.*;
import src.stringfunnifier.StringFunifier;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StringFunnifuerTest {

    @Test
    void doesLowerWork() {
        Lower testLower = new Lower(new OperationIMPL());
        assertEquals("l", testLower.operate("L"));
    }
    @Test
    void doesSortedWork() {
        Sorted testSorted = new Sorted(new OperationIMPL());
        assertEquals("abcd", testSorted.operate("cdba"));
    }

    @Test
    void doesUpperWork() {
        Upper testUpper = new Upper(new OperationIMPL());
        assertEquals("A", testUpper.operate("a"));
    }
    @Test
    void doesGetFunnyWork() {
        String boringString = "ccchHJKkklmlmmml";
        String boringStringExpected = "c(hcc)H(J)K(kklm)(lm)(m1)l";
        int[] startIndexes = {1, 5, 7, 11, 13};
        int[] endIndexes = {3, 5, 10, 12, 14};
        List<Operations> funOperation = List.of(
                new Reversed(new Comparession(new OperationIMPL())),
                new Upper((new OperationIMPL())),
                new Comparession(new Upper(new Sorted(new OperationIMPL()))),
                new Comparession(new OperationIMPL()),
                new Reversed(new Upper(new Comparession(new OperationIMPL())))

        );
        StringFunifier funifier = new StringFunifier(boringString, funOperation, startIndexes, endIndexes);
        String funnyString = funifier.getFunnyString();
        assertEquals(boringStringExpected, funnyString);
    }
}
