package com.algorithm.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CheckStringArrayEquivalentTest {

    @Test
    public void testArrayStringsAreEqual() {

        assertFalse(CheckStringArrayEquivalent.
                arrayStringsAreEqual(new String[]{"a", "cb"}, new String[]{"ab", "c"}));
        assertTrue(CheckStringArrayEquivalent.
                arrayStringsAreEqual(new String[]{"ab", "c"}, new String[]{"a", "bc"}));

    }

}
