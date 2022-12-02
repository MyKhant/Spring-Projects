package demo;

public class Main {
    public static void main(String[] args) {
        IGreeting greeting = new ProxyGreeting(new FormalGreeting());
        System.out.println(greeting.greet("John"));
    }
}
