package com.showcase.problems.general;

import java.util.Stack;

/**
 Given a string containing just the characters '(' and ')',
 find the length of the longest valid (well-formed) parentheses substring.
 *
 */
public class LongestValidParentheses {

    /**
     * Big O
     * runtime: O(n)
     * space: O(1)
     *
     */
    //11.49
    public static int longestValidParentheses(String s) {

        //)()())
        Stack<String> stack  = new Stack();
        int returnCount = 0;
        int longest = 0;
        boolean isValid = true;

        for(int i=0; i< s.length(); i++) {
            if(s.charAt(i)=='('){
                if(stack.empty())
                    isValid = true;
                stack.push("(");
            } else if(s.charAt(i)==')') {
                if (!stack.empty()) {
                    isValid = true;
                    stack.pop();
                    longest++;
                    returnCount = longest;
                } else {
                    isValid = false;
                    if(returnCount < longest) {
                        returnCount = longest;
                    }
                    longest = 0;
                }
            }

//
//
//
//                    tempCount++;
//                    if(stack.empty()) {
//                        if(tempCount > longest)
//                            longest = tempCount;
//                        tempCount = 0;
//                    } else {
//                        if(tempCount > longest)
//                            longest = tempCount;
//                    }
//                }
            }

        return returnCount*2;
    }

}
