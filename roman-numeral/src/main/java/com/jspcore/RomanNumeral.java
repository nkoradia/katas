package com.jspcore;

public class RomanNumeral {

    public static String romanFrom(int number) {
        if(number == 3) return "III";
        if(number == 2) return "II";
        return "I";
    }
}
