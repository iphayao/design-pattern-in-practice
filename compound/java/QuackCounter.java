public class QuackCounter implements Quackable {
    Quackable duck;
    Observable observable;
    static int numberOfQuacks;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
        observable = new Observable(this);
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

    public String toString() {
        return duck.toString();
    }
}