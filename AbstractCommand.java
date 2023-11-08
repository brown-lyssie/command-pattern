abstract class AbstractCommand implements Command {
    private Cook cook;
    public AbstractCommand() {}
    abstract public void execute();
}