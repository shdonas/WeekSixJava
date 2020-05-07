package weeksix;


public class Vehicle {

    private String make;
    private String model;
    private int year;
    private int wheel;
    private int doors;
    private int seat;
    private int topSpeed;

    public Vehicle(String make, String model, int year, int wheel, int doors, int seat, int topSpeed) {
        this.setMake(make);
        this.model = model;
        this.year = year;
        this.wheel = wheel;
        this.doors = doors;
        this.seat = seat;
        this.topSpeed = topSpeed;
    }

    // subcluss will override this method
    public void topSpeed() {
        System.out.println(this.make + " is fast enough!!");
    }

    // All the getters and Setters 
    protected final String getMake() {
        return make;
    }

    protected final void setMake(String make) {
        this.make = make;
    }

    protected final String getModel() {
        return model;
    }

    protected final void setModel(String model) {
        this.model = model;
    }

    protected final int getYear() {
        return year;
    }

    protected final void setYear(int year) {
        this.year = year;
    }

    protected final int getWheel() {
        return wheel;
    }

    protected final void setWheel(int wheel) {
        this.wheel = wheel;
    }

    protected final int getDoors() {
        return doors;
    }

    protected final void setDoors(int doors) {
        this.doors = doors;
    }

    protected final int getSeat() {
        return seat;
    }

    protected final void setSeat(int seat) {
        this.seat = seat;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

}
