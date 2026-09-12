package string.assigment_problems;

import java.util.Locale;

public class TypingSpeedAccuracyChecker {

    public static void checkTypingAccuracy(String original, String typed) {
        if (original == null || typed == null) {
            System.out.println("Invalid input strings.");
            return;
        }

        int total = original.length();
        if (total == 0) {
            System.out.println("Matched: 0/0 | Accuracy: 100.00% | No Mismatches");
            return;
        }

        int matched = 0;
        int firstMismatchPos = -1;
        char origChar = ' ';
        char typedChar = ' ';

        int minLen = Math.min(original.length(), typed.length());
        for (int i = 0; i < minLen; i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                matched++;
            } else if (firstMismatchPos == -1) {
                firstMismatchPos = i + 1; // 1-based position
                origChar = original.charAt(i);
                typedChar = typed.charAt(i);
            }
        }

        if (firstMismatchPos == -1 && original.length() != typed.length()) {
            firstMismatchPos = minLen + 1;
            origChar = original.length() > minLen ? original.charAt(minLen) : ' ';
            typedChar = typed.length() > minLen ? typed.charAt(minLen) : ' ';
        }

        double accuracy = ((double) matched / total) * 100.0;

        StringBuilder output = new StringBuilder();
        output.append("Matched: ").append(matched).append("/").append(total)
              .append(" | Accuracy: ").append(String.format(Locale.US, "%.2f%%", accuracy));

        if (firstMismatchPos != -1) {
            output.append(" | First Mismatch at position ").append(firstMismatchPos)
                  .append(" ('").append(origChar).append("' vs '").append(typedChar).append("')");
        } else {
            output.append(" | No Mismatches");
        }

        System.out.println(output.toString());
    }

    public static void main(String[] args) {
        System.out.println("Test Case 1:");
        checkTypingAccuracy("hello world", "hello worlt");

        System.out.println("\nTest Case 2:");
        checkTypingAccuracy("coding", "coding");
    }
}
