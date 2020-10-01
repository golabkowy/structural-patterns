package adapter;

public class Client {
    // The client means - our code, our classes, place where our interface is used and where we want to use other implementation but according to our interface.
    // So our Client wants to use OUR internalInterface
    private static final InternalInterface internal = new InternalInterfaceImplementation();
    private static final InternalInterface external = new Adapter(new Adaptee());

    // in this particular case you can see the difference between results based on passed argument internal or external. Both of them meet the TYPE condition.
    public static void doSth(InternalInterface interfaceInstance){
        interfaceInstance.someMethodA();
        interfaceInstance.someMethodB();
    }

    public static void main(String[] args) {
        internal.someMethodA();
        internal.someMethodB();

        external.someMethodA();
        external.someMethodB();

        doSth(internal);
        doSth(external);

    }
}
