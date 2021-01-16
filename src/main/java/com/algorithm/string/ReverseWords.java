package com.algorithm.string;

/**
 Given an input string s, reverse the string word by word.
 For example, given s = "the sky is blue", return "blue is sky the". *
 */
public class ReverseWords {

    /**
     * Big O
     * runtime: O(n) // n is length of input string
     * space: O(n)

     * assumptions:
     *  empty str return empty str
     *  alphanumeric words only
     *  no leading or trialing spaces in output string
     *  multiple spaces between words, reduce to single space
     */
    public static String reverseWords(String string) {
        String reversedStr = "";
        String word = "";
        for(int i=0; i< string.length(); i++) {
            if (string.charAt(i) != ' ') {
                word = word + string.charAt(i);
            } else if (string.charAt(i) == ' ' && word.length() > 0) {
                if (reversedStr.length() > 0)
                    reversedStr = word + " " + reversedStr;
                else
                    reversedStr = word;
                word = "";
            }
        }
        if(word.length() >0)
            if(reversedStr.length() > 0)
                reversedStr = word + " " + reversedStr;
            else
                reversedStr = word;
        return reversedStr;
    }

    public static String reverseWordsFromBackwards(String string) {
        String reversedStr = "";
        String word = "";
        boolean isEmpty = true;
        for(int i=string.length()-1; i >= 0 ; i--) {
            if (string.charAt(i) != ' ') {
                word = string.charAt(i) + word;
            } else if (string.charAt(i) == ' ' && word.length() > 0) {
                if (isEmpty) {
                    reversedStr = word;
                    isEmpty = false;
                }
                else
                    reversedStr = reversedStr + " " + word;
                word = "";
            }
        }
        if(word.length() >0)
            if (isEmpty)
                reversedStr = word;
            else
                reversedStr = reversedStr + " " + word;
        return reversedStr;
    }

}
