public class Helicopter extends Aircraft {


    public Helicopter(){
        super();
    }
    public Helicopter(int maxSpeed, int speed, String name, boolean isFlying) {
        super(maxSpeed,speed, name, isFlying);

    }

    // unimplemented methods

    @Override
    public String takeOfType() {
        return "Vertical";
    }

    @Override
    public String landingType() {
        return "Vertical";
    }


    @Override
    public boolean aircraftLand() {
        return getIsFlying() && super.getSpeed() < super.getMaxSpeed();
    }

    @Override
    public boolean aircraftTakeOff() {
        return !getIsFlying() && super.getSpeed() > 0;
    }

    // setter and getter methods



    //toString

    @Override
    public String toString() {
        return super.toString();

    }
}

