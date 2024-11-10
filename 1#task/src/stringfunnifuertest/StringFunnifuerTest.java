package src.stringfunnifuertest;

import org.junit.jupiter.api.Test;
import src.operation.*;
import src.stringfunnifier.StringFunifier;

import static org.junit.jupiter.api.Assertions.*;

public class StringFunnifuerTest {
    @Test
    void doesCompareWork() {
        Copmare testcompare = new Copmare();
        assertEquals("(s3)", testcompare.operate("sssl"));
    }
    @Test
    void doesLowerWork() {
        Lower testLower = new Lower();
        assertEquals("(l)", testLower.operate("l"));
    }
    @Test
    void doesSortedWork() {
        Sorted testSorted = new Sorted();
        assertEquals("(abcd)", testSorted.operate("cdba"));
    }
    @Test
    void doesReversedWork() {
        Reversed testReversed = new Reversed();
        assertEquals("(dcba)", testReversed.operate("abcd"));
    }
    @Test
    void doesUpperWork() {
        Upper testUpper = new Upper();
        assertEquals("(A)", testUpper.operate("a"));
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
