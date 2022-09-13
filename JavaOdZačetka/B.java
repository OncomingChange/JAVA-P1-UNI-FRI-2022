
public class B extends A {
    @Override
    public void f(A a) {
        System.out.println("B/A");
    }

    @Override
    public void f(B b) {
        System.out.println("B/B");
    }
}
