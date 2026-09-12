package array.assigment_problems;

public class SeatDuplicationChecker {

    public static void checkDuplicateSeats(int[] seatNumbers) {
        if (seatNumbers == null || seatNumbers.length == 0) {
            System.out.println("No Duplicate Seats Found");
            return;
        }

        boolean foundDuplicate = false;
        // Tracking visited duplicates using primitive arrays without Collections
        boolean[] alreadyReported = new boolean[seatNumbers.length];

        for (int i = 0; i < seatNumbers.length; i++) {
            if (alreadyReported[i]) {
                continue;
            }
            boolean isDuplicate = false;
            for (int j = i + 1; j < seatNumbers.length; j++) {
                if (seatNumbers[i] == seatNumbers[j]) {
                    isDuplicate = true;
                    alreadyReported[j] = true;
                }
            }
            if (isDuplicate) {
                System.out.println("Duplicate Seat Number Found: " + seatNumbers[i]);
                foundDuplicate = true;
            }
        }

        if (!foundDuplicate) {
            System.out.println("No Duplicate Seats Found");
        }
    }

    public static void main(String[] args) {
        System.out.println("Test Case 1:");
        int[] test1 = {101, 102, 103, 102, 105};
        checkDuplicateSeats(test1);

        System.out.println("\nTest Case 2:");
        int[] test2 = {101, 102, 103, 104, 105};
        checkDuplicateSeats(test2);
    }
}
