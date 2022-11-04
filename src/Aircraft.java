public abstract class Aircraft implements Flyable{
    // data members

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

    // interface methods
    public boolean aircraftFly() {
        if(speed == maxSpeed){
            isFlying = true;
            return true;
        }
        return false;
    }

    // abstract methods
    public abstract String takeOfType();
    public abstract String landingType();

    // getter and setter methods


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


    //toString
    @Override
    public String toString() {
        return "Aircraft name: " + name + "\n" +
                "Current aircraft speed: " + speed + "\n";
    }
}