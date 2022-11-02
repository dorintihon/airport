public abstract class Aircraft {
    // data members
    private double topSpeed;
    private double currentSpeed;
    private String name;

    // constructor
    public Aircraft (){
        this.currentSpeed=0;
        this.topSpeed=0;
        this.name="";
    }

    // getter and setter methods
    public double getTopSpeed() {
        return topSpeed;
    }
    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
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