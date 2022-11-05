//Dorin Tihon
/**
 Helicopter class to define the helicopter object to represent the helicopter information
 which extends the Aircraft abstract class and getting no new variables
 */
public class Helicopter extends Aircraft {

    //Default constructor
    public Helicopter(){
        super();
    }

    //Parameter constructor
    public Helicopter(int maxSpeed, int speed, String name, boolean isFlying) {
        super(maxSpeed,speed, name, isFlying);

    }

    //takeOffType() is the abstract method to determine the take-off type of helicopter object
    @Override
    public String takeOffType() {
        return "Vertical upward";
    }

    //landingType() is the abstract method to determine the landing type of helicopter object
    @Override
    public String landingType() {
        return "Vertical downward";
    }

    //aircraftLand() interface method which checks if the helicopter object is landing or not.
    @Override
    public boolean aircraftLand() {
        return getIsFlying() && super.getSpeed() < super.getMaxSpeed();
    }

    //aircraftTakeoff() interface method which checks if the helicopter object is taking off or not.
    @Override
    public boolean aircraftTakeOff() {
        return !getIsFlying() && super.getSpeed() > 0;
    }


    //toString method to print the Helicopter object information
    @Override
    public String toString() {
        return super.toString()  + "\n" +
                "Helicopter take off type: " + takeOffType() + "\n" +
                "Helicopter landing type: " + landingType();

    }

    //equals method
    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null) return false;
        if (this.getClass() == obj.getClass()) {
            Helicopter other = (Helicopter) obj;
            return super.equals(other);
        }
        return false;
    }
}

