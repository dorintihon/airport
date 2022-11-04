public abstract class Aircraft {
    // data members
    private int maxSpeed;
    private int distance;
    private double currentSpeed;
    private String name;

    // constructor
    public Aircraft (){
        this.currentSpeed=0;
        this.maxSpeed =0;
        this.distance = 0;
        this.name="No Name";
    }

    // getter and setter methods

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
    public double getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getCurrentSpeed() {
        return currentSpeed;
    }
    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }


    // abstract methods
    public abstract String takeOfType();
    public abstract String landingType();
}