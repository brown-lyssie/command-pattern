import java.util.ArrayList;
class Waiter {
    ArrayList<Command> commands = new ArrayList<Command>();
    public Waiter() {}
    public void orderUp() {
        //int g = commands.size();
        //System.out.println(g);
        //System.out.println("Executing " + commands.size().toString() + " orders...");
        for (int i = 0; i < commands.size(); i++) {
            commands.get(i).execute();
        }
    }
    public void takeOrder(Command order) {
        commands.add(order);
    }
}