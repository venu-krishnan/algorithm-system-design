package com.algorithm.string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class PalindromeTest {

    @Test
    public void testCheckPalindrome() {

        assertTrue(Palindrome.checkPalindrome("madam"));
        assertTrue(Palindrome.checkPalindrome("mad1dam"));
        assertFalse(Palindrome.checkPalindrome("master"));

        assertTrue(Palindrome.checkPalindrome("maa;m2s2ma#a m"));
        assertTrue(Palindrome.checkPalindrome("A man, a plan, a canal: Panama"));
        assertTrue(Palindrome.checkPalindrome(""));
        assertTrue(Palindrome.checkPalindrome("."));

    }

}
