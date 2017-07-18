public class CeilingFanHighCommand implements Command {
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
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