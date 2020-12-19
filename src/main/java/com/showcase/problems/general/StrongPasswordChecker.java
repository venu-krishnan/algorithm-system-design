package com.showcase.problems.general;

public class StrongPasswordChecker {

    /**
     * A password is considered strong if the below conditions are all met:
     *
     * It has at least 6 characters and at most 20 characters.
     * It contains at least one lowercase letter, at least one uppercase letter, and at least one digit.
     * It does not contain three repeating characters in a row (i.e., "...aaa..." is weak, but "...aa...a..." is strong, assuming other conditions are met).
     * Given a string password, return the minimum number of steps required to make password strong. if password is already strong, return 0.
     *
     * In one step, you can:
     *
     * Insert one character to password,
     * Delete one character from password, or
     * Replace one character of password with another character.
     */
    public static int strongPasswordChecker(String password) {

        int minimumReq = 0; //total 6 conditions

        //1
        if(password.length() < 6){
            minimumReq = 6 - password.length();
            return minimumReq;
        }

        System.out.println("0:"+minimumReq);

        if(password.length() >20)
            minimumReq++;

        System.out.println("1:"+minimumReq);
        //2
        if(!atleastOneChar(password, 'a','z'))
            minimumReq++;

        System.out.println("2:"+minimumReq);

        //3
        if(!atleastOneChar(password, 'A','Z'))
            minimumReq++;

        System.out.println("3:"+minimumReq);

        //4
        if(!atleastOneChar(password, '0','9'))
            minimumReq++;

        System.out.println("4:"+minimumReq);

        //5
        if(!noRepeatingChars(password))
            minimumReq++;

        System.out.println("5:"+minimumReq);

        //6
        if(!noOtherSpecialChar(password))
            minimumReq++;

        System.out.println("6:"+minimumReq);

        return minimumReq;
    }

    private static boolean atleastOneChar(String password, char start, char end){
        for(int i=0; i<password.length(); i++){
            if(password.charAt(i) >= start && password.charAt(i) <= end)
                return true;
        }
        return false;
    }

    private static boolean noRepeatingChars(String password) {
        int charsRepeated = 1;
        char ch = password.charAt(0);
        for(int i=1; i<password.length(); i++){
            if(ch == password.charAt(i)){
                charsRepeated++;
                if(charsRepeated==3){
                    return false;
                }
            } else {
                ch = password.charAt(i);
                charsRepeated = 1;
            }
        }
        return true;
    }

    private static boolean noOtherSpecialChar(String password){
        for(int i=0; i<password.length(); i++){
            if(!((password.charAt(i) >= 'a' && password.charAt(i) <= 'z') ||
                    (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') ||
                    (password.charAt(i) >= '0' && password.charAt(i) <= '9') ||
                    password.charAt(i) == '.' ||  password.charAt(i) == '!'
            ))
                return false;
        }
        return true;
    }


}
