package jasmin;

import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = scanner.nextInt();

        if (n < 2) {
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int l = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        boolean foundSecond = false;

        for (int i = 1; i < n; i++) {
            if (arr[i] > l) {
                secondLargest = l;
                l = arr[i];
                foundSecond = true;
            } else if (arr[i] < l && (!foundSecond || arr[i] > secondLargest)) {
                secondLargest = arr[i];
                foundSecond = true;
            }
        }

        if (foundSecond) {
            System.out.println("The second largest element is: " + secondLargest);
        } else {
            System.out.println("No second largest element found (all elements may be identical).");
        }
    }
}

