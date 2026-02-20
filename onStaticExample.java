import java.util.Scanner;

class NonStaticExample {
    int n;  // non-static variable

    public void readAndPrint() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        System.out.println("Value without static: " + n);

        sc.close();
    }

    public static void main(String[] args) {
        NonStaticExample obj = new NonStaticExample();
        obj.readAndPrint();  // access non-static variable through object
    }
}
