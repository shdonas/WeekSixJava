package weeksix;

public class WeekSix {

    public static void main(String[] args) {
        Cars myImpala = new Cars("Toyota", "Impala", 2002, 4, 4, 5, 140, "Sedan");
        System.out.println("Make: " + myImpala.getMake());
        myImpala.setMake("Chevy");
        System.out.println("Make: " + myImpala.getMake());
        myImpala.setTopSpeed(120);
        System.out.println("speed: " + myImpala.getTopSpeed());
        myImpala.topSpeed();
        CommercialTransport bus = new CommercialTransport("Collins", "SchoolBus", 2020, 6, 1, 20, 80, "bus", "Mid");
        System.out.println(bus.getMake());
        System.out.println(bus.getStyle());
        Vehicle bike = new Cars("Yamaha", "ninja", 2018, 2, 0, 2, 180, "sports");
        acceptBike(bike);
    }

    public static void acceptBike(Vehicle v) {
        v.setModel("Suzuki");
        System.out.println(v.getModel());
        v.topSpeed();
        Cars tempBike = (Cars) v;
        tempBike.getDoors();
    }
}
