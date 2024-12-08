package code.preactic;

public class Random {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.a);
    }

}

class A {
    final int a;

    public A(){
        a = 78;
    }
}
