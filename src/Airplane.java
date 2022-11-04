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
    public boolean planeFly() {
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
    public boolean planeLand() {
        return super.getCurrentSpeed()<10;
    }

    @Override
    public boolean planeTakeOff() {
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
