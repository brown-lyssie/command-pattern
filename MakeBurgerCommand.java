class MakeBurgerCommand extends AbstractCommand {
    Cook cook;
    public MakeBurgerCommand(Cook newCook) {
        this.cook = cook;
    }
    public void execute() {
        this.cook.makeBurger();
    }
}