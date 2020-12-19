package com.showcase.problems.general;

/**
 Implement strstr(). Returns the index of the first occurrence of needle in haystack, or –1
 if needle is not part of haystack.
 *
 */
public class Strstr {

    /**
     * Big O
     * runtime: O(nm) // n-haystack length, m-needle length
     * space: O(1)
     **
     */
    public static int strStr(String haystack, String needle) {
        for(int i=0; i<=haystack.length(); i++) {
            for(int j=0; j<=needle.length(); j++) {
                if(j == needle.length())
                    return i;
                if(i+j == haystack.length())
                    return -1;
                if(haystack.charAt(i+j) != needle.charAt(j)) {
                    break;
                }
            }
        }
        return -1;
    }

    /**
     * other method
     * Big O
     * runtime: O(nm) // n-haystack length, m-needle length
     * space: O(1)
     */
    public static int strStr2(String haystack, String needle) {
        for (int i = 0; ; i++) {
            for (int j = 0; ; j++) {
                if (j == needle.length()) return i;
                if (i + j == haystack.length()) return -1;
                if (needle.charAt(j) != haystack.charAt(i + j)) break;
            }
        }
    }

}
