public class Text {

    String sentence1 = "Worldwide coronavirus infection toll hits 200,000 after doubling in less than two weeks.";
    String sentence2 = "Wimbledon is CANCELLED for the first time since World War II due to the coronavirus pandemic.";
    String sentence3 = "Tennis superstar Roger Federer donates £862,000 to 'vulnerable families' in his native Switzerland to help deal with coronavirus crisis.";


    public static String sentence4() {
        return "Coronavirus symptoms day-by-day: Worst-affected will be struggling to breathe within five days and need a ventilator by day eight.      ";
    }


    public static String sentence5() {
        return "Virtual reality video reveals how coronavirus damaged the lungs of a critically ill American patient in his 50s.";
    }



    public static String concatenate_sentence(String string1, String string2, String string3) {
         return string1.concat("\n").concat(string2).concat("\n").concat(string3);
        // or: return string1 + "\n" + string2+ "\n" + string3;
    }


    public void extractCharacters() {
        char first = this.sentence3.charAt(17);
        char second = this.sentence3.charAt(23);
        System.out.println("Extracted characters: " + first + second);
    }


    public void unicodeValues() {
        System.out.println("Unicode values: " + this.sentence3.codePointAt(17) + ", " + this.sentence3.codePointAt(23));
    }


    public void wordContainer() {
        String w1 = "COVID-19";
        String w2 = "Coronavirus";
        String w3 = "pandemic";
        String text = this.sentence1.concat(Text.sentence4());

        System.out.println("Is " + w1 + " part of sentence 1 or 4?" + "  " + text.contains(w1));
        System.out.println("Is " + w2 + " part of sentence 1 or 4?" + "  " + text.contains(w2));
        System.out.println("Is " + w3 + " part of sentence 1 or 4?" + "  " + text.contains(w3));
    }


    public void startEnd() {
        String w1 = "Wimbledon";
        String w2 = "crisis.";
        System.out.println("Does sentence 2 start with " + "'" + w1 +"'" + "?  " + this.sentence2.startsWith(w1));
        System.out.println("Does sentence 3 end with " + "'" + w2 +"'" + "?  " + this.sentence3.endsWith(w2));
    }


    public void indexOfWord() {
        System.out.println("Index of 'Switzerland' in sentence 3: " + this.sentence3.indexOf("Switzerland"));
        System.out.println("Index of 'ventilator' in sentence 4: " + Text.sentence4().indexOf("vent", 50));
        System.out.println("Last index of 'coronavirus' in sentence 5:  " + Text.sentence5().lastIndexOf("coronavirus"));
    }


    public void empty() {
        System.out.println("Is sentence1 an empty string?  " + this.sentence1.isEmpty());
    }

    public void sentenceLength() {
        int l1 = this.sentence1.length();
        int l2 = this.sentence3.length();
        int l3 = Text.sentence5().length();
        System.out.println("Number of characters in sentence 1:  " + l1);
        System.out.println("Number of characters in sentence 3:  " + l2);
        System.out.println("Number of characters in sentence 5:  " + l3);
    }


    public boolean match() {
        return this.sentence1.matches(this.sentence2);
       // return this.sentence1.regionMatches(true,10,this.sentence2,20,100);
    }


    public void replacement() {
        System.out.println("Replace 'CANCELLED' by 'cancelled':  " + this.sentence2.replace("CANCELLED","cancelled"));
        System.out.println("Replace 'coronavirus' by 'COVID-19': " + this.sentence2.replace("coronavirus","COVID-19"));
    }


    public void cwArray() {
        char[] ch = Text.sentence5().toCharArray();
        int index = 1;
        System.out.println("Char at " + index + ":  " + ch[index]);
        System.out.println("Sentence 5 has " + ch.length + " characters.");

        String[] words = Text.sentence5().split(" ");
        System.out.println("Char at " + index + ":  " + words[index]);
        System.out.println("Sentence 5 has " + words.length + " words.");

        String[] words1 = this.sentence3.split(" ");
        System.out.println("Who is the GOAT?  " + words1[2] + " " + words1[3]);
    }


    public void cases() {
        System.out.println("to lower case:  " + this.sentence3.toLowerCase());
        System.out.println("to upper case:  " + Text.sentence4().toUpperCase());
    }


    public String trimSentence() {
        String sentence4_new = Text.sentence4().trim();
        return sentence4_new;
    }


    public String reverse(String s) {
        StringBuilder sbuilder = new StringBuilder();
        for (int i = s.length() -1; i >=0; i--) {
            sbuilder.append(s.charAt(i));
        }
        return sbuilder.toString();
    }

}
