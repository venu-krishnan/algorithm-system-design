package com.algorithm;

/**
 Determine whether an integer is a palindrome. Do this without extra space.
 */
public class PalindromeNumber {

    /**
     * Big O
     * runtime: O(n)
     * space: O(1)
     *
     */
    public static boolean isPalindromeWithReverse(int number) {
        return number == reverse(number);
    }

    public static boolean isPalindrome(int number) {
        if(number<0) return false;
        int div = 1;
        while(number/div > 9){
            div = div * 10; //find out how many digits the number is
        }
        while(number!=0){
            int lastDigit = number%10;
            int firstDigit = number/div;
            if(firstDigit != lastDigit)
                return false;
            number = (number % div) / 10; //this will truncate first and last digit of number
            div = div/100; //since first and last digit is gone, it must be divisible by 100
        }
        return true;
    }


    private static int reverse(int number) {
        //12345
        int reverse = 0;
        while(number>0) {
            reverse = reverse * 10 + (number%10);
            number = number/10;
        }
        return reverse;
    }



}
