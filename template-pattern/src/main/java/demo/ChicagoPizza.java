package demo;

public class ChicagoPizza extends PizzaTemplate{
    @Override
    public void prepared() {
        System.out.println(this.getClass().getSimpleName()+"::prepared()");
    }

    @Override
    public void topping() {
        System.out.println(this.getClass().getSimpleName()+"::topping()");

    }

    @Override
    public void baked() {
        System.out.println(this.getClass().getSimpleName()+"::baked()");

    }

    @Override
    public void serve() {
        System.out.println(this.getClass().getSimpleName()+"::serve()");

    }

    @Override
    public void makePayment() {
        System.out.println(this.getClass().getSimpleName()+"::makePayment()");

    }
}
