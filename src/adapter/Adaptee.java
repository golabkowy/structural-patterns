package adapter;

// Some external class - it can be library or other module in application. We would like to use some functionalities from it but with InternalInterface style
// You can compare this class to "English Electrical Socket"

public class Adaptee {
    public void someStrangeExternalMethodA() {
        System.out.println("External method A invokation");
    }

    public void someStrangeExternalMethodB() {
        System.out.println("External method B invokation");
    }
}
