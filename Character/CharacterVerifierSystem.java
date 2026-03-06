package Character;

import java.util.Scanner;

public class CharacterVerifierSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        } 
        else if (Character.isAlphabetic(ch)) {

            if (Character.isUpperCase(ch)) {

                if (isVowel(ch))
                    System.out.println("Uppercase Vowel");
                else
                    System.out.println("Uppercase Consonant");

            } 
            else {

                if (isVowel(ch))
                    System.out.println("Lowercase Vowel");
                else
                    System.out.println("Lowercase Consonant");
            }
        } 
        else {
            System.out.println("Symbol");
        }

        sc.close();
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
