public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }

    void simulate() {
        Quackable mallardDurk = new MallardDuck();
        Quackable redheadDuck = new RedheadDuck();
        Quackable duckCall = new DuckCall();
        Quackable rubberQuack = new RubberDuck();

        System.out.println("\nDuck Simulator");

        simulate(mallardDurk);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberQuack);
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}