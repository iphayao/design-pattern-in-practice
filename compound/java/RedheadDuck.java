public class RedheadDuck implements Quackable {
    Observable observable;

    public RedheadDuck() {
        observable = new Observable(this);
    }
    public void quack() {
        System.out.println("Quack");
        notifyObservable();
    }

    public void registerObservable(Observer observer) {
        observable.registerObservable(observer);
    }
    public void notifyObservable() {
        observable.notifyObservable();
    }
}