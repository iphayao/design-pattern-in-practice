public class GooseAdapter implements Quackable {
    Goose goose;
    Observable observable;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
        this.observable = new Observable(this);
    }

    public void quack() {
        goose.honk();
        notifyObservable();
    }

    public void registerObservable(Observer observer) {
        observable.registerObservable(observer);
    }
    public void notifyObservable() {
        observable.notifyObservable();
    }

    public String toString() {
        return "Goose pretending to be Duck";
    }
}