//Dorin Tihon
/**
 Aircraft abstract class to define the aircraft object to represent the aircraft general information
 by implementing the Flyable interface and defining methods to set the objects taking off and landing type
 */
public abstract class Aircraft implements Flyable{


    //Variables for Aircraft class
    private int speed;
    private String name;
    private boolean isFlying;
    private int maxSpeed;

    //Default constructor
    public Aircraft (){
        speed = 0;
        maxSpeed = 0;
        name = "No Name";
        isFlying = false;
    }

    //Parameter constructor
    public Aircraft(int maxSpeed, int speed, String name, boolean isFlying) {
        this.maxSpeed = maxSpeed;
        this.speed = speed;
        this.name = name;
        this.isFlying = isFlying;
    }

    //Interface method aircraftFly() which checks if the aircraft object is flying right now.
    //It returns true if the current speed matches with the maximum speed.
    public boolean aircraftFly() {
        if(speed == maxSpeed){
            isFlying = true;
            return true;
        }
        return false;
    }

    // abstract methods
    public abstract String takeOffType();
    public abstract String landingType();

    //Get and Set methods for variables in the Aircraft class
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public boolean getIsFlying() {
        return isFlying;
    }

    public void setIsFlying(boolean isFlying) {
        this.isFlying = isFlying;
    }

    public String getAircraftName() {
        return name;
    }
    public void setAircraftName(String planeName) {
        this.name = planeName;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }


    //toString method to print the Aircraft object information
    @Override
    public String toString() {
        return "Aircraft name: " + name + "\n" +
                "Current aircraft speed: " + speed + "\n" +
                "Aircraft maximum speed: " + maxSpeed + "\n" +
                "Is aircraft flying? " + aircraftFly();
    }


    //equals method
    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null) return false;
        if (this.getClass() == obj.getClass()) {
            Aircraft other = (Aircraft) obj;
            return name.equals(other.getAircraftName()) &&
                    speed == other.getSpeed() &&
                    isFlying == other.isFlying &&
                    maxSpeed == other.getMaxSpeed();
        }
        return false;
    }
}