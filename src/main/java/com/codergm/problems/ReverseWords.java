package com.codergm.problems;

public class ReverseWords {
    public static void main(String[] args) {
        String str = "Hi my dears! I'm glad to introduce my friend - Kolin, who is your new CIO.";
        System.out.println(applyReverse(str));
    }

    public static String applyReverse(String s){
        String words[] = s.split(" ");
        String word;
        String result = "";
        String [] letters;
        for(int j = 0; j < words.length; j++){
            word = words[j];
            letters = word.split("");
            for(int i = letters.length - 1; i>=0; i-- ){
                result += letters[i];
            }
            result += " ";
        }

        return result;
    }
}
