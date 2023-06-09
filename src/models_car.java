public class models_car extends models_vehicle implements models_tunningable{
    private int numberOfDors;
    public models_car(int speed, String model, int numberOfDors){
        super(speed, model);
        this.numberOfDors = numberOfDors;
    }

    public void setNumberOfDors(int numberOfDors) {
        this.numberOfDors = numberOfDors;
    }

    public int getNumberOfDors() {
        return numberOfDors;
    }

    @Override
    public String toString() {
        return "numberOfDors = " + this.numberOfDors + ", " + super.toString();
    }

    @Override
    public void increaseSpeed(int speed) {
        this.speed = this.speed + speed;
    }
}
