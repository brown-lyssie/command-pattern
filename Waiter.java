import java.util.ArrayList;
class Waiter {
    ArrayList<Command> commands = new ArrayList<Command>();
    public Waiter() {}
    public void orderUp() {
        int totalOrders = commands.size();
        //System.out.println(g);
        System.out.println("Executing " + totalOrders + " orders...");
        for (int i = 0; i < totalOrders; i++) {
            commands.get(0).execute();
            commands.remove(0);
        }
    }
    public void takeOrder(Command order) {
        commands.add(order);
    }
}