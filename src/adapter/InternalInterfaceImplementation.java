package adapter;

public class InternalInterfaceImplementation implements InternalInterface{
    @Override
    public void someMethodA() {
        System.out.println("Internal method A invokation");
    }

    @Override
    public void someMethodB() {
        System.out.println("Internal method B invokation");

    }
}
