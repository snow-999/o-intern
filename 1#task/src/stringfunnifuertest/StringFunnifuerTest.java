package src.stringfunnifuertest;

import org.junit.jupiter.api.Test;
import src.operation.*;
import static org.junit.jupiter.api.Assertions.*;

public class StringFunnifuerTest {
    @Test
    void doesCompareWork(){
        Copmare testcompare = new Copmare();
        assertEquals("(s3)", testcompare.operate("sssl"));
    }
    @Test
    void doesLowerWork(){
        Lower testLower = new Lower();
        assertEquals("(l)", testLower.operate("l"));
    }
    @Test
    void doesSortedWork(){
        Sorted testSorted = new Sorted();
        assertEquals("(abcd)", testSorted.operate("cdba"));
    }
    @Test
    void doesReversedWork(){
        Reversed testReversed = new Reversed();
        assertEquals("(dcba)", testReversed.operate("abcd"));
    }
    @Test
    void doesUpperWork(){
        Upper testUpper = new Upper();
        assertEquals("(A)", testUpper.operate("a"));
    }
}
