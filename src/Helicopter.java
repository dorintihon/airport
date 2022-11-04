public class Helicopter extends Aircraft implements Flyable {

    public Helicopter(){
        super();
    }

    // unimplemented methods
    @Override
    public boolean planeFly() {
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
    public boolean planeLand() {
        return super.getCurrentSpeed()<5;
    }

    @Override
    public boolean planeTakeOff() {
        return super.getCurrentSpeed()>0;
    }

}

