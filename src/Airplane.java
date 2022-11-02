public class Airplane extends Aircraft implements Flyable{
    private double takeoffDistance;
    private double landingDistance;

    public Airplane(){
        super();
        this.setTakeoffDistance(0);
        this.setLandingDistance(0);
    }

    // unimplemented methods
    @Override
    public boolean isFlying() {
        return super.getCurrentSpeed()>=10;
    }

    @Override
    public String takeOfType() {
        return ("Gradual Horizontal)");
    }

    @Override
    public String landingType() {
        return ("Gradual Horizontal)");
    }

    @Override
    public boolean isLanding() {
        return super.getCurrentSpeed()<10;
    }

    @Override
    public boolean isTakingOff() {
        return super.getCurrentSpeed()>0;
    }

    // setter and getter methods
    public double getTakeoffDistance() {
        return takeoffDistance;
    }

    public void setTakeoffDistance(double takeoffDistance) {
        this.takeoffDistance = takeoffDistance;
    }

    public double getLandingDistance() {
        return landingDistance;
    }

    public void setLandingDistance(double landingDistance) {
        this.landingDistance = landingDistance;
    }
}
