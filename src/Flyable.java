//Dorin Tihon
/**
 Flyable interface to define the methods that help cheking the status of the aircraft
 */
public interface Flyable {

    //aircraftFly() determine if aircraft is flying
    public boolean aircraftFly();

    //aircraftTakeOff() determine if aircraft is taking off
    public boolean aircraftTakeOff();

    //aircraftLand() determine if aircraft is landing
    public boolean aircraftLand();

}