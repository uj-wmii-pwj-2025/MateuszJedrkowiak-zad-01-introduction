package uj.wmii.pwj.introduction;

public class Reverser {

    public String reverse(String input) {
        if(input == null) {
            return null;
        }
        input = input.trim();
        StringBuilder result = new StringBuilder(input);
        for (int i = 0; i < input.length() / 2; i++) {
            char currChar = result.charAt(i);
            result.setCharAt(i, result.charAt(result.length() - i - 1));
            result.setCharAt(result.length() - i - 1, currChar);
        }

        return result.toString();
    }


    public String reverseWords(String input) {
        if(input == null) {
            return null;
        }
        input = input.trim();
        String[] words = input.split("\\s+");
        StringBuilder result = new StringBuilder();
        for(int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if( i!= 0) {
                result.append(" ");

            }
        }

        return result.toString();
    }

}
