package weeksix;


public class CommercialTransport extends Cars {

    public String size;

    public CommercialTransport(String make, String model, int year, int wheel,
            int doors, int seat, int topSpeed, String style, String size) {
        super(make, model, year, wheel, doors, seat, topSpeed, style);
        this.size = size;
    }

}
