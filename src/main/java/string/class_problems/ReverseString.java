package string.class_problems;

public class ReverseString {
    public static void main(String[] args) {
        // Class Problem: Reverse String
        String input = "hello";
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
    }
}
