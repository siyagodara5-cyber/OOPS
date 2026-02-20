class A {
    int sum(int a, int b) {
        return a + b;
    }
}

class B extends A {
    @Override
    int sum(int a, int b) {
        return a + b + 10;   // overriding
    }
}

class polymorphism {
    public static void main(String[] args) {
        A obj = new B();   // Runtime Polymorphism
        System.out.println(obj.sum(5, 7));
    }
}
