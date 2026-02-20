public class CmdLineArray {
    public static void main(String[] args) {

        int size = Integer.parseInt(args[0]);
        String[] arr = new String[size];

        // Store elements as Strings
        for (int i = 0; i < size; i++) {
            arr[i] = args[i + 1];
        }

        System.out.println("The elements of the array are:");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
}
