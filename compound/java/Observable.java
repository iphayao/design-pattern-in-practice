import java.util.*;

public class Observable implements QuackObservable {
    ArrayList<Observer> observers = new ArrayList<Observer>();
    QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    public void registerObservable(Observer observer) {
        observers.add(observer);
    }
    public void notifyObservable() {
        Iterator iterator = observers.iterator();
        while(iterator.hasNext()) {
            Observer observer = (Observer)iterator.next();
            observer.update(duck);
        }
    }
}