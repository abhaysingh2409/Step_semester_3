package string.class_problems;

public class PalindromeCheck {
    public static void main(String[] args) {
        // Class Problem: Palindrome Check
        String input = "madam";
        String reversed = new StringBuilder(input).reverse().toString();
        boolean isPalindrome = input.equalsIgnoreCase(reversed);
        System.out.println("Is \"" + input + "\" a palindrome? " + isPalindrome);
    }
}
