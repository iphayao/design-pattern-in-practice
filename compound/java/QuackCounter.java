public class QuackCounter implements Quackable {
    Quackable duck;
    static int numberOfQuacks;
    Observable observable;

    public QuackCounter() {
        observable = new Observable(this);
    }

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    public void quack() {
        duck.quack();
        notifyObservable();
        numberOfQuacks++;
    }

    public static int getQuacks() {
        return numberOfQuacks;
    }

    public void registerObservable(Observer observer) {
        observable.registerObservable(observer);
    }
    public void notifyObservable() {
        observable.notifyObservable();
    }
}