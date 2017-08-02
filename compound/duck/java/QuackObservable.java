import java.util.*;

public interface QuackObservable {
    public void registerObservable(Observer observer);
    public void notifyObservable();
}