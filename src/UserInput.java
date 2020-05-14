// To create some user input you can use the Scanner object with its methods.

import java.util.Scanner;

public class UserInput {

    public static void getInput(String prompt) {

        System.out.print(prompt);

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] sentences = input.split("\\.|\\!|\\?");
        String[] words = input.split(" ");
        char[] chars = input.toCharArray();


        if (sentences.length == 1) {
           // System.out.println("Your input has " + sentences.length + " sentence, " + words.length + " words and " + input.length() + " characters.");
            System.out.printf("Your input has %d sentence, %d words and %d characters.", sentences.length, words.length, input.length());
        } else {
           // System.out.println("Your input has " + sentences.length + " sentences, " + words.length + " words and " + chars.length + " characters.");
            System.out.printf("Your input has %d sentences, %d words and %d characters.", sentences.length, words.length, chars.length);
        }
    }
}
