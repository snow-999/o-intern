package src.test;

import org.junit.jupiter.api.Test;
import src.main.interfaces.OperationDecorator;
import src.main.interfaces.impl.*;
import src.main.operation.*;
import src.main.stringfunnifier.StringFunifier;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StringFunnifuerTest {

    @Test
    void doesLowerWork() {
        Lower testLower = new Lower(new OperationImpl());
        assertEquals("l", testLower.operate("L"));
    }
    @Test
    void doesSortedWork() {
        Sorted testSorted = new Sorted(new OperationImpl());
        assertEquals("abcd", testSorted.operate("cdba"));
    }

    @Test
    void doesUpperWork() {
        Upper testUpper = new Upper(new OperationImpl());
        assertEquals("A", testUpper.operate("a"));
    }
    @Test
    void doesGetFunnyWork() {
        String boringString = "ccchHJKkklmlmmml";
        String boringStringExpected = "c(hcc)H(J)K(kklm)(lm)(m1)l";
        int[] startIndexes = {1, 5, 7, 11, 13};
        int[] endIndexes = {3, 5, 10, 12, 14};
        List<Operations> funOperation = List.of(
                new Reversed(new Compression(new OperationImpl())),
                new Upper((new OperationImpl())),
                new Compression(new Upper(new Sorted(new OperationImpl()))),
                new Compression(new OperationImpl()),
                new Reversed(new Upper(new Compression(new OperationImpl())))

        );
        StringFunifier funifier = new StringFunifier(boringString, funOperation, startIndexes, endIndexes);
        String funnyString = funifier.getFunnyString();
        assertEquals(boringStringExpected, funnyString);
    }
}
