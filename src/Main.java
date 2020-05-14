import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Using StringBuilder class and methods
        Text txt = new Text();
        StringBuilder sb = new StringBuilder(txt.sentence1);

        sb.append("\n").append(txt.sentence2).append("\n");
        sb.append(Text.concatenate_sentence(txt.sentence3,Text.sentence4(),Text.sentence5()));
        System.out.println("Print text in StringBuilder:  " + sb);
        System.out.println("StringBuilder length:  " + sb.length());
        System.out.println("Text in reverse order:  " + sb.reverse());
        System.out.println("Number of unicode values within the whole text:  " + sb.codePointCount(0, sb.length()));




        //Using methods from Text.java

        txt.extractCharacters();
        txt.unicodeValues();
        txt.wordContainer();
        txt.startEnd();
        txt.indexOfWord();
        txt.empty();
        txt.sentenceLength();
        System.out.println("Is there a match between sentence 1 and sentence 2:  " + txt.match());
        txt.replacement();
        txt.cwArray();
        txt.cases();
        System.out.println(txt.trimSentence());
        System.out.println(txt.reverse(Text.sentence5()));
        System.out.println(txt.reverse(txt.sentence3));


        String s1 = Text.concatenate_sentence(Text.sentence4(), Text.sentence5(), txt.sentence1);
        System.out.println(s1);
        //System.out.println(s1.length());
        //System.out.println(s1.replace("coronavirus", "COVID-19"));
        //System.out.println(s1.toUpperCase());


        UserInput.getInput("Your sentence/sentences: ");



        System.out.println();
        Palindrome.palindromeTestA1("aba");
        System.out.println("Is your string a palindrome? " + Palindrome.palindromeTestA2("aba"));
        System.out.println("Is your string a palindrome? " + Palindrome.palindromeTestB("aba"));
        Palindrome.palindromeTestC();
    }
}
