package oops_world;

public class Carmodel {
    public static void main(String[] args) {
        SuvCar suv=new SuvCar(3,7,30,1);
        System.out.println("Gear is:"+ suv.gear);
        System.out.println("Initial Speed:"+ suv.speed);
        System.out.println("Seat rows:"+suv.seatrow);
        System.out.println("No of seats:"+suv.seatingcapacity);
        suv.speedUp(15);
        System.out.println(" Speed:"+ suv.speed);
        System.out.println("Customer have chosen "+suv.seatrow +" row SUV car");

    }
}
