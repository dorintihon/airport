public class Airplane extends Aircraft{

    private final int distance;

    public Airplane(){
        super();
        distance = 0;
    }

    public Airplane(int planeMaxSpeed, int distance, int speed, String name,  boolean isFlying) {
        super(planeMaxSpeed, speed, name, isFlying);

        this.distance = distance;
    }

    // unimplemented methods

    @Override
    public String takeOfType() {
        return "Gradual Horizontal";
    }

    @Override
    public String landingType() {
        return "Gradual Horizontal";
    }


    @Override
    public boolean aircraftLand() {
        return getIsFlying() && distance <= 11;

    }

    @Override
    public boolean aircraftTakeOff() {
        return !getIsFlying() && distance <= 11;
    }

    // setter and getter methods



    //toString

    @Override
    public String toString() {
        return super.toString() +
                "Distance required to takeoff or land: " + distance + "\n";
    }
}

