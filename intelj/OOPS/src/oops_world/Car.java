package oops_world;

public class Car {

    int speed;
    int gear;
    public Car(int startSpeed,int startGear)
    {
        this.speed=startSpeed;
        this.gear=startGear;

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public void applyBrake(int decrement)
    {
        speed -=decrement;
    }
    public void speedUp(int increment)
    {
        speed +=increment;
    }

}
