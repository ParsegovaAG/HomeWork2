package com.company;

public class calculation {

        public static Double calc(String equation) {
                        // Write code here
            String[] wordArray = equation.split(" ");

            return switch (wordArray[1]) {
                case "+" -> Double.parseDouble(wordArray[0]) + Double.parseDouble(wordArray[2]);
                case "-" -> Double.parseDouble(wordArray[0]) - Double.parseDouble(wordArray[2]);
                case "*" -> Double.parseDouble(wordArray[0]) * Double.parseDouble(wordArray[2]);
                case "/" -> Double.parseDouble(wordArray[0]) / Double.parseDouble(wordArray[2]);
                default -> (0.0);
                // WRITE CODE HERE
            };


        }
        public static void main(String[] args) {
            String equation = "123123 + 123123";
            System.out.println(calc(equation)); // результат: 246246
        }
    }


