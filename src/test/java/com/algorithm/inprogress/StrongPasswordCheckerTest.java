package com.algorithm.inprogress;

import com.algorithm.inprogress.StrongPasswordChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrongPasswordCheckerTest {

    @Test
    public void testStrongPasswordChecker() {

//        assertEquals(5, StrongPasswordChecker.strongPasswordChecker("a"));
//        assertEquals(3, StrongPasswordChecker.strongPasswordChecker("aA1"));
//        assertEquals(3, StrongPasswordChecker.strongPasswordChecker("aA1@"));
//        assertEquals(0, StrongPasswordChecker.strongPasswordChecker("1337C0d3"));
//        assertEquals(1, StrongPasswordChecker.strongPasswordChecker("13@37C0d3"));
        //assertEquals(2, StrongPasswordChecker.strongPasswordChecker("aaa111"));
        assertEquals(1, StrongPasswordChecker.strongPasswordChecker("aaa123"));
    }

}
