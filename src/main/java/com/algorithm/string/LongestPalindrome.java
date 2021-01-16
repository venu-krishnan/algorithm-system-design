package com.algorithm.string;

/**
 Given a string s, return the longest palindromic substring in s.

 Input: s = "babad"
 Output: "bab"
 Note: "aba" is also a valid answer.

 Input: s = "cbbd"
 Output: "bb"
 *
 */
public class LongestPalindrome {

    /**
     * Big O
     * runtime: O(n)
     * space: O(1)
     *
     */
    public static String longestPalindrome(String s) {
        if(s.length() == 0) return "";
        if(s.length() == 1) return s;

        String longestPalinStr = "";

        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j <= s.length(); j++){
                String temp = isPalindrome(s.substring(i, j));
                //System.out.println("output:"+temp);
                if(temp != null && longestPalinStr.length() < temp.length())
                    longestPalinStr = temp;
            }
        }
        return longestPalinStr;
    }

    public static String longestPalindromeDynamicProgramming(String s) {
        if(s.length() == 0) return "";
        if(s.length() == 1) return s;

        String longestPalinStr = "";
       // List<String>

        for(int i=s.length()-1; i>0; i--){
            for(int j=i-1; j > 0; j--){
                //System.out.println("i:"+(i-j)+" j:"+(j+1));
                //System.out.println(s.substring(j, i));

//                String temp = isPalindrome(s.substring(i-j, j+1));
//                System.out.println("output:"+temp);
//                if(temp != null && longestPalinStr.length() < temp.length())
//                    longestPalinStr = temp;
            }
        }
        return longestPalinStr;
    }

    // null if not palindrome
    // str palindrome
    private static String isPalindrome(String str) {
        System.out.println(str);
        int start = 0;
        int end = str.length() -1;
        while(start < end){
            if(str.charAt(start) != str.charAt(end))
                return null;
            start++;
            end--;
        }
        return str;
    }

}
