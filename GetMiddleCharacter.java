package com.company;

public class GetMiddleCharacter {

    public static String getMiddleCharacter(String str) {
        int x = str.length() % 2;
        return switch (x) {
            case 0 -> (str.substring(str.length() / 2 - 1, str.length() / 2 + 1));
            case 1 -> (str.substring((str.length() - 1) / 2, (str.length() - 1) / 2 + 1));
            default -> ("");
            // WRITE CODE HERE
        };
    }
    public static void main(String[] args) {
        String oddString = "слово";
        System.out.println(getMiddleCharacter(oddString)); // результат: "О"
        String evenString = "пять";
        System.out.println(getMiddleCharacter(evenString)); // результат: "ят"
    }
}
