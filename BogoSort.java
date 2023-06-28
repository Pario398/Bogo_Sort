import java.util.Scanner;

public class BogoSort {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a list of numbers: ");
            String[] input = scanner.nextLine().split(",");
            int[] arr = new int[input.length];
            for (int i = 0; i < input.length; i++)
                arr[i] = Integer.parseInt(input[i]);

            while (!isSorted(arr))
                shuffle(arr);

            System.out.print("Sorted array: ");
            for (int i = 0; i < arr.length; i++)
                System.out.print(arr[i] + " ");
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    static void shuffle(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = (int) (Math.random() * i);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++)
            if (arr[i] < arr[i - 1])
                return false;
        return true;
    }
}
