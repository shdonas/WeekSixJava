package weeksix;

public class Cars extends Vehicle {

    private String style;

    public Cars(String make, String model, int year, int wheel, int doors, int seat, int topSpeed, String style) {
        super(make, model, year, wheel, doors, seat, topSpeed);
        this.setStyle(style);
    }

    protected final String getStyle() {
        return style;
    }

    protected final void setStyle(String style) {
        this.style = style;
    }

    @Override
    public void topSpeed() {
        System.out.println(this.getMake() + " is fast. and Top speed is: " + this.getTopSpeed());
    }
}
