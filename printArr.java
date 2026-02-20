import java.util.Scanner;
public class printArr {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();          // size of array
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)    // input
            arr[i] = sc.nextInt();

        for (int num : arr)           // output
            System.out.print(num + " ");

        sc.close();
    }
}


