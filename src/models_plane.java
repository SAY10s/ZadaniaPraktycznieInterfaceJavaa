public class models_plane extends models_vehicle{
    private int numberOfSeats;

    public models_plane(int speed, String model, int numberOfSeats){
        super(speed, model);
        this.numberOfSeats = numberOfSeats;
    }
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "numberOfSeats = " + this.numberOfSeats + ", " + super.toString();
    }
}
