public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIEM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;                                                                                                                      
    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
    }

    public void mediem() {
        speed = MEDIEM;
    }

    public void low() {
        speed = LOW;
    }

    public void on() {
        System.out.println(location + " ceiling fan is on");
    }

    public void off() {
        System.out.println(location + " ceiling fan is on");
    }

    public int getSpeed() {
        return speed;
    }
}