class Customer {
    Waiter waiter;
    public Customer(Waiter w) {
        this.waiter = w;
    }
    public void createOrder(Command order) {
        waiter.takeOrder(order);
    }
}