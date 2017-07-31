public class DuckCall implements Quackable {
    Observable observable;

    public DuckCall() {
        observable = new Observable(this);
    }

    public void quack() {
        System.out.println("Kwak");
        notifyObservable();
    }

    public void registerObservable(Observer observer) {
        observable.registerObservable(observer);
    }
    public void notifyObservable() {
        observable.notifyObservable();
    }
}