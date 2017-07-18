public class GarageDoor {
    String name;
    
    public GarageDoor(String name) {
        this.name = name;
    }
    public void up() {
        System.out.println(name + " garage door is up");
    }

    public void down() {
        System.out.println(name + " garage door is down");
    }
}