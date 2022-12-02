package cglib;

public class SpringCgProxy extends Config{
    private Config config;

    public SpringCgProxy(Config config) {
        this.config = config;
    }

    @Override
    public void test() {
        proxyTest();
        super.test();
    }
    private void proxyTest(){
        System.out.println("This is proxy test.");
    }
}
