import java.util.Scanner;

class StaticExample {
    static int n;  // static variable

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        System.out.println("Value using static: " + n);

        sc.close();
    }
}
