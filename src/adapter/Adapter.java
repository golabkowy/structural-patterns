package adapter;

// So Adapter implements our InternalInterface to keep contract, but it use Adaptee methods within methods bodies.
// Like European electrical plug uses UK electrical socket

public class Adapter implements InternalInterface {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void someMethodA() {
        adaptee.someStrangeExternalMethodA();
    }

    @Override
    public void someMethodB() {
        adaptee.someStrangeExternalMethodB();
    }
}
