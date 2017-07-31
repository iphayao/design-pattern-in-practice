import java.util.*;

public class Flock implements Quackable {
    ArrayList<Quackable> quackers = new ArrayList<Quackable>();
    Observable observable;

    public Flock() {
        observable = new Observable(this);
    }
    public void add(Quackable quackar) {
        quackers.add(quackar);
    }

    public void quack() {
        Iterator iterator = quackers.iterator();
        while(iterator.hasNext()) {
            Quackable quacker = (Quackable)iterator.next();
            quacker.quack();
        }
    }

    public void registerObservable(Observer observer) {
        Iterator iterator = quackers.iterator();
        while(iterator.hasNext()) {
            Quackable quacker = (Quackable)iterator.next();
            quacker.registerObservable(observer);
        }
        //observable.registerObservable(observer);
    }
    public void notifyObservable() {
        observable.notifyObservable();
    }
}