package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isPalindrome(int number){

        String num = String.valueOf(Math.abs(number));
        String reversed = new StringBuilder(num).reverse().toString();
        return num.equals(reversed);
    }


    public static boolean isPerfectNumber(int number){
    if(number <= 0){
        return false;
    }
    int sum = 0;
    for(int i=1; i<number ; i++){
        if(number %i == 0){
            sum += i ;
            }
        }
            return sum == number;
    }

    public static String numberToWords(int number){
    if(number < 0){
        return "Invalid Value";

    }
    String[] numberWords = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    StringBuilder result = new StringBuilder();
    String numStr = String.valueOf(number);
    for(int i=0; i<numStr.length(); i++ ){
        result.append(numberWords[numStr.charAt(i) - '0']).append(" ");
    }
        return result.toString().trim();
    }
}

