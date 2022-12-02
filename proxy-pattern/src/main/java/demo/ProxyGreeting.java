package demo;

public class ProxyGreeting implements IGreeting{
    private FormalGreeting formalGreeting;

    public ProxyGreeting(FormalGreeting formalGreeting) {
        this.formalGreeting = formalGreeting;
    }

    @Override
    public String greet(String name) {
        String msg = """
                Hi, How're you doing?
                """;
        return formalGreeting.greet(name) + msg;
    }
}
