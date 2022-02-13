package com.company;

public class CapitalizeEachWord {

    public static String capitalize(String word) {
// WRITE CODE HERE
        word = word.substring(0, 1).toUpperCase() + word.substring(1);
        return word;
    }

    public static String capitalizeEachWord(String str) {
        // WRITE CODE HERE
        String[] words = str.trim().split(" ");
        StringBuilder subStringWithCapitalizeEachWord = new StringBuilder();
        for (String word : words)
        {
            subStringWithCapitalizeEachWord.append(" ");
            subStringWithCapitalizeEachWord.append(capitalize(word));
        }
        return(subStringWithCapitalizeEachWord.deleteCharAt(0).toString());


    }
    public static void main(String[] args) {
        String example = "Каждый охотник желает знать где сидит фазан";
        System.out.println(capitalizeEachWord(example)); // результат: "Каждый Охотник Желает Знать Где Сидит Фазан"
    }
}
