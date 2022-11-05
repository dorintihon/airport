import java.util.ArrayList;
import java.util.Random;

//Dorin Tihon
/**
 Simulator class for testing the methods of other classes by creating 5 random objects with random parameters
 and to see if the objects act properly in dependence of parameters
 */
public class Simulator {

    //Main method
    public static void main(String [] args) {
        ArrayList<Aircraft> aircraftList = new ArrayList<>();
        Random rand = new Random();


        //Create 5 random objects and adding them to the aircraftList

        for (int i = 0; i < 5; i++) {

            //Generate a random number from 0 to 1 [0 for Helicopter, 1 for Airplane]
            int r = rand.nextInt(2);

            //Defining parameters for objects
            int maxSpeed;
            int distance;
            int speed;
            String name;

            //isFlying variable will generate randomly
            boolean isFlying = rand.nextBoolean();

            //if statement for Helicopter object
            if (r == 0) {
                maxSpeed = rand.nextInt(2, 3);
                speed = rand.nextInt(1,3);
                name = "Heli_0" + rand.nextInt(5);

                //for loop to check if an object with this name exists and generate another one if true
                for(Aircraft obj: aircraftList){
                    if (name.equals(obj.getAircraftName())){
                        name = "Heli_0" + rand.nextInt(5) + 1;
                    }
                }

                aircraftList.add(new Helicopter(maxSpeed,speed, name, isFlying));

            }
            //Statement for Airplane object
            else {
                maxSpeed = rand.nextInt(2, 3);
                distance = rand.nextInt(9,13);
                speed = rand.nextInt(1,3);
                name = "Plane_0" + rand.nextInt(5);

                //for loop to check if an object with this name exists and generate another one if true
                for(Aircraft obj: aircraftList){
                    if (name.equals(obj.getAircraftName())){
                        name = "Plane_0" + rand.nextInt(5) + 1;
                    }
                }

                aircraftList.add(new Airplane(maxSpeed, distance, speed, name, isFlying));

            }
        }


        //For loop to print the information about the objects on the list
        for (Aircraft aircraft : aircraftList) {

            if (aircraft instanceof Helicopter heli) {
                System.out.println(aircraft);

                //if statement to print the actual status of the helicopter object
                if (heli.aircraftFly()) {
                    System.out.printf("%s is flying", heli.getAircraftName());
                } else if (heli.aircraftLand()) {
                    System.out.printf("%s is landing to airport ", heli.getAircraftName());
                } else if (heli.aircraftTakeOff()) {
                    System.out.printf("%s is taking off from airport ", heli.getAircraftName());
                }
            }
            if (aircraft instanceof Airplane airplane) {
                System.out.println(aircraft);

                //if statement to print the actual status of the airplane object
                if (airplane.aircraftFly()) {
                    System.out.printf("%s is flying", airplane.getAircraftName());
                } else if (airplane.aircraftLand()) {
                    System.out.printf("%s is landing to airport", airplane.getAircraftName());
                } else if (airplane.aircraftTakeOff()) {
                    System.out.printf("%s is taking off from airport", airplane.getAircraftName());
                }
            }
            System.out.println();
            System.out.println();

        }

    }
    }

