package com.showcase.problems.general;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrstrTest {

    @Test
    public void testStrstr() {

        assertEquals(1, Strstr.strStr("mississipi","iss"));
        assertEquals(-1, Strstr.strStr("master","vgf"));
        assertEquals(6, Strstr.strStr("canadasome","some"));
        assertEquals(2, Strstr.strStr("torontoron","ron"));
        assertEquals(0, Strstr.strStr("table","ta"));
        assertEquals(0, Strstr.strStr("",""));

        assertEquals(1, Strstr.strStr2("mississipi","iss"));
        assertEquals(-1, Strstr.strStr2("master","vgf"));
        assertEquals(6, Strstr.strStr2("canadasome","some"));
        assertEquals(2, Strstr.strStr2("torontoron","ron"));
        assertEquals(0, Strstr.strStr2("table","ta"));
        assertEquals(0, Strstr.strStr2("",""));
    }

}
