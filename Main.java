public class Main {
  public static void main(String[] args) {
    //System.out.println("Hello World");
    Waiter waiter = new Waiter();
    Customer customer = new Customer(waiter);
    Cook cook = new Cook();
    MakeBurgerCommand burger = new MakeBurgerCommand(cook);
    MakeMilkshakeCommand milkshake = new MakeMilkshakeCommand(cook);
    customer.createOrder(burger);
    customer.createOrder(milkshake);
    customer.createOrder(burger);
    waiter.orderUp();
    customer.createOrder(burger);
    customer.createOrder(milkshake);
    waiter.orderUp();
  }
}