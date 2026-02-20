class Car {
    int price;
    Car(int price) {
        this.price = price;
    }
}

class BMW extends Car {
    int inheritedPrice;
    BMW(int price) {
        super(price);
        inheritedPrice = price; // or super.price
    }
}

public class ParentCar {
    public static void main(String[] args) {
        BMW b = new BMW(5);
        System.out.println(b.inheritedPrice);
    }
}

