package com.company;

public class RemoveDuplicateWords {
    public static String removeDuplicateWords(String str) {
        // WRITE CODE HERE
        String[] words = str.trim().split(" ");
        StringBuilder subStringWithoutDublicate = new StringBuilder();
        for (String word : words) {
            if (subStringWithoutDublicate.toString().length() == 0) {
                subStringWithoutDublicate.append(word);
            } else if (subStringWithoutDublicate.toString().lastIndexOf(word) == -1) {
                subStringWithoutDublicate.append(" ");
                subStringWithoutDublicate.append(word);
            }
        }
        return(subStringWithoutDublicate.toString());
    }
    public static void main(String[] args) {
        String example = "один один три два два два";
        System.out.println(removeDuplicateWords(example)); // результат: "один три два"
    }

}
