package com.algorithm;

/**
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters
 * and ignoring cases.
 * For example,
 * "A man, a plan, a canal: Panama" is a palindrome.
 * "race a car" is not a palindrome.
 *
 */
public class Palindrome {

    /**
     * Big O
     * runtime: O(n)
     * space: O(1)
     *
     */
    public static boolean checkPalindrome(String str) {

        if (str.isEmpty())
            return true;

        int head = 0;
        int tail = str.length() - 1; //since head starts with zero

        while (head < tail) {
            while (head < tail && !isAlphaNumeric(str.charAt(head))) head++;
            while (head < tail && !isAlphaNumeric(str.charAt(tail))) tail--;
             if (Character.toLowerCase(str.charAt(head++)) !=
                     Character.toLowerCase(str.charAt(tail--))) {
                    return false;
                }
        }
        return true;
    }

    private static boolean isAlphaNumeric(char ch) {
        return (ch >= 'A' && ch <= 'Z') ||
                    (ch >= 'a' && ch <= 'z') ||
                    (ch >= '0' && ch <= '9');
   }

}
