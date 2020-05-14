
// Program to show how to check if a String is a palindrome or not.
// There is a palindrome if the original version and the reversed version of your input string are the same.


import java.util.Scanner;


public class Palindrome {

    //using recursion; return reversed string of input
    public static String reverse(String input) {
        if(input == null || input.isEmpty()) {
            return input;
        }

        return input.charAt(input.length() - 1)
                + reverse(input.substring(0, input.length() - 1));
    }


    //alternative: using for-loop
    public static String reverseString(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = input.length()-1; i >= 0; i--) {
            sb.append(input.charAt(i));
        }
        return sb.toString();
    }



    //test if the string is a palindrome or not
    //with recursion
    public static void palindromeTestA1(String text) {
        String rev = reverse(text);
        System.out.println(text + " reversed is: " + rev);

        if (text.equalsIgnoreCase(rev)) {
            System.out.println("Is " + text + " a palindrome?:"+ "   true");
        } else {
            System.out.println("Is " + text + " a palindrome?:" + "  false");
        }
    }

    //or:
    public static boolean palindromeTestA2(String text) {
        String reverse = reverse(text);
        if(text.equalsIgnoreCase(reverse)) {
            return true;
        }
        return false;
    }



    //under for-loop
    public static boolean palindromeTestB(String text) {
        String reverse = reverseString(text);
        if(text.equalsIgnoreCase(reverse)) {
            return true;
        }
        return false;
    }




    //Scanner object, for-loop, decision if palindrome or not in one method:
    public static void palindromeTestC() {
        String prompt = "Here you can test if your string is a palindrome. Please enter your string: ";
        System.out.print(prompt);

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        for (int i = input.length()-1; i >= 0; i--) {
            sb.append(input.charAt(i));
        }

        String result = sb.toString();
        System.out.println("The reversed string is: " + result);

        if (input.equalsIgnoreCase(result)) {
            System.out.println("Result: " + input + " is a palindrome.");
        } else {
            System.out.println("Result: " + input + " is not a palindrome.");
        }
    }
}
