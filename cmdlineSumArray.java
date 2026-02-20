public class cmdlineSumArray {
    public static void main(String[] args) {

        int size = Integer.parseInt(args[0]);
        int[] arr = new int[size];
        int sum = 0;

        // Store values and calculate sum at the same time
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(args[i + 1]);
            sum += arr[i];
        }

        System.out.println("Array elements are:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\nSum = " + sum);
    }
}
