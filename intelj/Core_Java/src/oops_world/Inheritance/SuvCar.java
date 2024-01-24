package oops_world.Inheritance;

public class SuvCar extends Car {
    public int seatrow;
    public int seatingcapacity;
    public SuvCar( int customerChoice,int seatsneeded, int startSpeed,int startGear)
    {
        super(startSpeed,
                startGear);
        this.seatrow=customerChoice;
        this.seatingcapacity= seatsneeded;
    }

    public int getSeatrow() {
        return seatrow;
    }

    public void setSeatrow(int seatrow) {
        this.seatrow = seatrow;
    }

    public int getSeatingcapacity() {
        return seatingcapacity;
    }

    public void setSeatingcapacity(int seatingcapacity) {
        this.seatingcapacity = seatingcapacity;
    }
}
