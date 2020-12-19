package com.showcase.problems.general;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class String2IntegerTest {

    @Test
    public void testAtoi() {

        char ch = '9';
        System.out.println((ch-'0') * 1);

        assertEquals(0, String2Integer.atoi("test"));
        assertEquals(1, String2Integer.atoi("1"));
        assertEquals(2, String2Integer.atoi("+2"));
        assertEquals(212321, String2Integer.atoi("+212321"));
        assertEquals(212322, String2Integer.atoi("   +212322   "));

//        assertEquals(2147483647, String2Integer.atoi("21474836460"));
//
//        assertEquals(212323, String2Integer.atoi("   +212323dscs   "));
//        assertEquals(2147483647, String2Integer.atoi("   +2147483648dscs   "));
//        assertEquals(2147483647, String2Integer.atoi("   +2147483648"));
//        assertEquals(2147483647, String2Integer.atoi("   +2147483647max"));
//        assertEquals(2147483647, String2Integer.atoi("   +3147483647max"));
//        assertEquals(-2147483648, String2Integer.atoi("   -2147483648max"));
//        assertEquals(-2147483648, String2Integer.atoi("   -2147483649fail"));
//        assertEquals(-2147483648, String2Integer.atoi("   -3147483649fail"));
//        assertEquals(0, String2Integer.atoi("   +-12"));
//        assertEquals(12345678, String2Integer.atoi("0000000000012345678"));
//        assertEquals(12345678, String2Integer.atoi("  0000000000012345678"));
        assertEquals(0, String2Integer.atoi("00000-42a1234"));
    }

}
