//Dorin Tihon
/**
 Airplane class to define the airplane object to represent the airplane information
 which extends the Aircraft abstract class and getting the distance variable to be
 able to determine if the object is close to airport
 */
public class Airplane extends Aircraft{

    //Variables for Airplane object
    private int distance;

    //Default constructor
    public Airplane(){
        super();
        distance = 0;
    }

    //Parameter constructor
    public Airplane(int planeMaxSpeed, int distance, int speed, String name,  boolean isFlying) {
        super(planeMaxSpeed, speed, name, isFlying);

        this.distance = distance;
    }


    //takeOffType() is the abstract method to determine the take-off type of airplane object
    @Override
    public String takeOffType() {
        return "Gradual Horizontal Upwards";
    }

    //landingType() is the abstract method to determine the landing type of airplane object
    @Override
    public String landingType() {
        return "Gradual Horizontal Downwards";
    }


    //aircraftLand() interface method which checks if the airplane object is landing or not.
    @Override
    public boolean aircraftLand() {
        return getIsFlying() && distance <= 11;

    }

    //aircraftTakeoff() interface method which checks if the airplane object is taking off or not.
    @Override
    public boolean aircraftTakeOff() {
        return !getIsFlying() && distance <= 11;
    }



    //Get and Set methods for variables in the Airplane class
    public int getDistance() {
        return distance;
    }
    public void setDistance(int distance){
        this.distance = distance;
    }


    //toString method to print the Airplane object information
    @Override
    public String toString() {
        return super.toString()  + "\n" +
                "Airplane take off type: " + takeOffType() + "\n" +
                "Airplane landing type: " + landingType()  + "\n" +
                "Current distance from airport: " + distance + "\n" +
                "[Maximum allowed distance to take-off/land: 11]";
    }

    //equals method
    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null) return false;
        if (this.getClass() == obj.getClass()) {
            Airplane other = (Airplane) obj;
            return super.equals(other) &&
                    distance == other.getDistance();
        }
        return false;
    }
}

