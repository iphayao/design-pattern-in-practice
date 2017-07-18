public class CeilingFanOffCommand implements Command {
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.mediem();
    }

    public void undo() {
        if(prevSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
        }
        else if(prevSpeed == CeilingFan.MEDIEM){
            ceilingFan.mediem();
        }
        else if(prevSpeed == CeilingFan.LOW) {
            ceilingFan.low();
        }
        else if(prevSpeed == CeilingFan.OFF) {
            ceilingFan.off();
        }
    }
}