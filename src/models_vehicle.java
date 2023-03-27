public abstract class models_vehicle {
    private int speed;
    private String model;

    public models_vehicle(int speed, String model){
        this.model = model;
        this.speed = speed;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return
                "speed=" + speed +
                ", model='" + model + '\'';
    }

}
