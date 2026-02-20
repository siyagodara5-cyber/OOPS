abstract class Sample {
    int a=10;
    void f(){
        System.out.println(a);
    }
    abstract void f2();
}

class Child extends Sample{
    void show(){
        super.f();
    }
    
}