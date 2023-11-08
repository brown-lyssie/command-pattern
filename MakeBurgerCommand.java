class MakeBurgerCommand extends AbstractCommand {
    Cook cook;
    public MakeBurgerCommand(Cook newCook) {
        this.cook = newCook;
    }
    public void execute() {
        this.cook.makeBurger();
    }
}