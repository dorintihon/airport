import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Simulator {
    public static void main(String [] args){
        ArrayList<Aircraft> ac=new ArrayList<Aircraft>();
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();

// 5 random objects
        for(int i=0;i<5;i++){
            int r=rand.nextInt(3)%2;

            if(r==0){
                Helicopter h=new Helicopter();
                System.out.print("Helicopter name : ");
                String name=sc.next();
                System.out.print("Top speed of Helicopter : ");
                double tspeed=sc.nextDouble();
                h.setName(name);;
                h.setTopSpeed(tspeed);
                h.setCurrentSpeed(1);
                ac.add(h);
            }
            else{
                Airplane ap=new Airplane();
                System.out.print("AirPlane name : ");
                String name=sc.next();
                System.out.print("Top speed of AirPlane : ");
                double tspeed=sc.nextDouble();
                ap.setName(name);
                ap.setTopSpeed(tspeed);
                ap.setCurrentSpeed(1);
                ac.add(ap);
            }
        }

// taking off
        for(int i=0;i<5;i++){
            Aircraft acraft=ac.get(i);

            if(acraft instanceof Helicopter){
                Helicopter h=(Helicopter) acraft;
                System.out.println(h.getName()+" [Helicopter] is taking off : "+h.isTakingOff());
            }
            if(acraft instanceof Airplane){
                Airplane h=(Airplane) acraft;
                System.out.println(h.getName()+" [Airplane] is taking off : "+h.isTakingOff());
            }
        }

        System.out.println();
        System.out.println();
// flying objects
        for(int i=0;i<5;i++){
            ac.get(i).setCurrentSpeed(rand.nextInt((int) ac.get(i).getTopSpeed()));
            Aircraft acraft=ac.get(i);

            if(acraft instanceof Helicopter){
                Helicopter h=(Helicopter) acraft;
                System.out.println(h.getName()+" [Helicopter] is flying : "+h.isFlying()+" [Current Speed is "+h.getCurrentSpeed()+" ]");
            }
            if(acraft instanceof Airplane){
                Airplane h=(Airplane) acraft;
                System.out.println(h.getName()+" [Airplane] is flying : "+h.isFlying()+" [Current Speed is "+h.getCurrentSpeed()+" ]");
            }
        }


        System.out.println();
        System.out.println();

// landing or not
        for(int i=0;i<5;i++){
            ac.get(i).setCurrentSpeed(rand.nextInt((int) (ac.get(i).getTopSpeed()/150.0)));
            Aircraft acraft=ac.get(i);

            if(acraft instanceof Helicopter){
                Helicopter h=(Helicopter) acraft;
                System.out.println(h.getName()+" [Helicopter] is Landing : "+h.isLanding()+" [Current Speed is "+h.getCurrentSpeed()+" ]");
            }
            if(acraft instanceof Airplane){
                Airplane h=(Airplane) acraft;
                System.out.println(h.getName()+" [Airplane] is Landing : "+h.isLanding()+" [Current Speed is "+h.getCurrentSpeed()+" ]");
            }
        }
    }
}
