import java.util.Scanner;

class Car {
    int modelYear;
    int mileage;

    Car(int modelYear, int mileage) {
        this.modelYear = modelYear;
        this.mileage = mileage;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Car myCar = new Car(sc.nextInt(), sc.nextInt());

        System.out.println("Model Year: " + myCar.modelYear);
        System.out.println("Mileage: " + myCar.mileage);

        sc.close();
    }
}
