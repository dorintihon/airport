import java.util.ArrayList;
import java.util.Random;


public class Simulator {
    public static void main(String [] args) {
        ArrayList<Aircraft> aircrafts = new ArrayList<>();
        Random rand = new Random();

// 5 random objects
        for (int i = 0; i < 5; i++) {
            int r = rand.nextInt(2);
            int maxSpeed;
            int distance;
            int speed;
            String name;
            boolean isFlying;

            if (r == 0) {
                maxSpeed = rand.nextInt(2, 3);
                speed = rand.nextInt(1,3);
                name = "Heli_0" + rand.nextInt(5);
                for(Aircraft obj: aircrafts){
                    if (name.equals(obj.getAircraftName())){
                        name = "Heli_0" + rand.nextInt(5) + 1;
                    }
                }
                isFlying = rand.nextBoolean();
                aircrafts.add(new Helicopter(maxSpeed,speed, name, isFlying));

            } else {
                maxSpeed = rand.nextInt(2, 3);
                distance = rand.nextInt(9,12);
                speed = rand.nextInt(1,3);
                name = "Plane_0" + rand.nextInt(5);
                for(Aircraft obj: aircrafts){
                    if (name.equals(obj.getAircraftName())){
                        name = "Plane_0" + rand.nextInt(5) + 1;
                    }
                }
                isFlying = rand.nextBoolean();
                aircrafts.add(new Airplane(maxSpeed, distance, speed, name, isFlying));

            }
        }

        //Print objects information
        for (Aircraft aircraft : aircrafts) {
            System.out.println(aircraft.toString());
        }

// taking off
        for (Aircraft acraft : aircrafts) {
            if (acraft instanceof Helicopter h) {
                if (h.aircraftFly()) {
                    System.out.println(h.getAircraftName() + " [Helicopter] is flying ");
                } else if (h.aircraftLand()) {
                    System.out.println(h.getAircraftName() + " [Helicopter] is landing ");
                } else if (h.aircraftTakeOff()) {
                    System.out.println(h.getAircraftName() + " [Helicopter] is taking off ");
                }
                System.out.println("Fly: " + h.aircraftFly());
                System.out.println("Max:" + h.getMaxSpeed());
                System.out.println("Current:" + h.getSpeed());

            }
            if (acraft instanceof Airplane a) {
                if (a.aircraftFly()) {
                    System.out.println(a.getAircraftName() + " [Airplane] is flying ");
                } else if (a.aircraftLand()) {
                    System.out.println(a.getAircraftName() + " [Airplane] is landing ");
                } else if (a.aircraftTakeOff()) {
                    System.out.println(a.getAircraftName() + " [Airplane] is taking off ");
                }
                System.out.println("Fly: " + a.aircraftFly());
                System.out.println("Max:" + a.getMaxSpeed());
                System.out.println("Current:" + a.getSpeed());

            }
        }

        System.out.println();
        System.out.println();

    }
    }

