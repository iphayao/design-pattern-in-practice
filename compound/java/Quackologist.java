public class Quackologist implements Observer {
    public void update(QuackObservable duck) {
        System.out.println("Quackologiest: " + duck + " just quacked");
    }
}