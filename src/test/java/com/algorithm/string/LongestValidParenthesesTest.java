package com.algorithm.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestValidParenthesesTest {

    @Test
    public void testIsPalindromeNumber() {

        assertEquals(2, LongestValidParentheses.longestValidParentheses("()"));
        assertEquals(4, LongestValidParentheses.longestValidParentheses(")()())"));
        assertEquals(0, LongestValidParentheses.longestValidParentheses(""));
        assertEquals(2, LongestValidParentheses.longestValidParentheses("()(()"));

    }

}
