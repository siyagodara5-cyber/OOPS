import java.util.Scanner;

class Number {
    int m;
}

class B extends Number {
    int n;
    B() {
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        m = s.nextInt();  // super.m can be used but here m is clear
        System.out.println("Value of n is " + n);
        System.out.println("Value of m is " + m);
        s.close();
    }
}

public class Keyword {
    public static void main(String[] args) {
        new B();
    }
}
