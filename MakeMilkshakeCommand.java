class MakeMilkshakeCommand extends AbstractCommand {
    Cook cook;
    public MakeMilkshakeCommand(Cook newCook) {
        this.cook = newCook;
    }
    public void execute() {
        this.cook.makeMilkshake();
    }
}