package string.assigment_problems;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        // Assignment Problem: Count Vowels and Consonants
        String input = "Hello World";
        int vowels = 0;
        int consonants = 0;
        
        String lower = input.toLowerCase();
        for (int i = 0; i < lower.length(); i++) {
            char ch = lower.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        
        System.out.println("String: " + input);
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
