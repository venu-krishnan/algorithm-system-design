package com.algorithm;

import com.algorithm.PalindromeNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeNumberTest {

    @Test
    public void testIsPalindromeNumber() {

        assertFalse(PalindromeNumber.isPalindromeWithReverse(123456));
        assertFalse(PalindromeNumber.isPalindromeWithReverse(43215678));
        assertTrue(PalindromeNumber.isPalindromeWithReverse(321123));
        assertTrue(PalindromeNumber.isPalindromeWithReverse(1));
        assertTrue(PalindromeNumber.isPalindromeWithReverse(0));
        assertTrue(PalindromeNumber.isPalindromeWithReverse(1234554321));
        assertTrue(PalindromeNumber.isPalindromeWithReverse(123454321));

        assertFalse(PalindromeNumber.isPalindrome(123456));
        assertFalse(PalindromeNumber.isPalindrome(43215678));
        assertTrue(PalindromeNumber.isPalindrome(321123));
        assertTrue(PalindromeNumber.isPalindrome(3210123));
        assertTrue(PalindromeNumber.isPalindrome(3010103));
        assertTrue(PalindromeNumber.isPalindrome(1));
        assertTrue(PalindromeNumber.isPalindrome(0));
        assertTrue(PalindromeNumber.isPalindrome(1234554321));
        assertTrue(PalindromeNumber.isPalindrome(123454321));

    }

}
