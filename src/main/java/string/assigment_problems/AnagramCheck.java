package string.assigment_problems;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        // Assignment Problem: Anagram Check
        String s1 = "listen";
        String s2 = "silent";
        
        char[] arr1 = s1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] arr2 = s2.replaceAll("\\s", "").toLowerCase().toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        boolean isAnagram = Arrays.equals(arr1, arr2);
        System.out.println("Are \"" + s1 + "\" and \"" + s2 + "\" anagrams? " + isAnagram);
    }
}
