class MakeMilkshakeCommand extends AbstractCommand {
    Cook cook;
    public MakeMilkshakeCommand(Cook newCook) {
        this.cook = cook;
    }
    public void execute() {
        this.cook.makeMilkshake();
    }
}