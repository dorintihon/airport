public class Helicopter extends Aircraft implements Flyable {

    public Helicopter(){
        super();
    }

    // unimplemented methods
    @Override
    public boolean isFlying() {
        return super.getCurrentSpeed()>=5;
    }

    @Override
    public String takeOfType() {
        return ("Vertical");
    }

    @Override
    public String landingType() {
        return ("Vertical");
    }

    @Override
    public boolean isLanding() {
        return super.getCurrentSpeed()<5;
    }

    @Override
    public boolean isTakingOff() {
        return super.getCurrentSpeed()>0;
    }

}

