package com.company;

public class HasSameOccurences {

    public static char[] createAlphabet(){
        char[] alphabet = new char[26];
        for (int i = 0; i < 26; i++){
            alphabet[i] = (char)(97 + i);
        }
        return alphabet;
    }

    public static Boolean hasSameOccurences(String str) {
        // WRITE CODE HERE
        char[] alphabet = createAlphabet();
        int countOfPreviouslyXCharacter = 0;
        for(Character character : alphabet){
            int count = 0;

                for (int i = 0; i < str.length(); i++)
                {
                    if(str.charAt(i) == character)
                    {
                        count++;
                    }
                }

            if (countOfPreviouslyXCharacter == 0 && count!=0) {
            countOfPreviouslyXCharacter = count;
            }
            else if ((countOfPreviouslyXCharacter != 0) &&  (count!=0) && (count!=countOfPreviouslyXCharacter))
            {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        String sameOccurencesCount = "abcabc";
        System.out.println(hasSameOccurences(sameOccurencesCount)); // результат: true
        String diffOccurencesCount = "abca";
        System.out.println(hasSameOccurences(diffOccurencesCount)); // результат: false

    }
}
