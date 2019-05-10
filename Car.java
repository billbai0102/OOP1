public class Car {
    private String brand;
    private String model;
    private int kilometres;
    private double gas;
    private double tankCapacity;

    /**
     * Class constructor.
     *
     * @param b A String containing car's brand.
     * @param m A String containing car's model.
     * @param g A double containing car's current gas.
     * @param tCap A double containing car's tank capacity
     */
    public Car (String b, String m, double g, double tCap){
        brand  = b;
        model = m;
        kilometres = 0;
        gas = g;
        tankCapacity = tCap;
    }

    /**
     * Simulates the car driving.
     *
     * @param distance A double containing how much the car has driven
     *                 to be converted into gas used, and added to
     *                 kilometres.
     */
    public void drive(double distance){
        kilometres += distance;
        gas -= distance/5;
    }

    /**
     * Simulates filling the gas tank full.
     */
    public void gasUp(){
        gas = tankCapacity;
    }

    public String getInfo(){
        return brand + " " + model;
    }

    /**
     * Application's entry point.
     */
    public static void main(String[] args) {
        Car c1 = new Car("Ferrari", "LaFerrari", 50, 60);
        c1.drive(100);
        c1.gasUp();
        System.out.println(c1.getInfo());
        Car c2 = new Car("Maserati", "GranTurismo", 60, 60);
        c2.drive(30);
        c2.gasUp();
        System.out.println(c2.getInfo());
        Car c3 = new Car("Koenigsegg", "Agera RS1", 50, 70);
        c3.drive(0);
        c3.gasUp();
        System.out.println(c3.getInfo());
        Car c4 = new Car("Lamborghini", "Veneno", 43.5, 60);
        c4.drive(50);
        c4.gasUp();
        System.out.println(c4.getInfo());
        Car c5 = new Car("Porsche", "911 GT3 RS", 34, 45.5);
        c5.drive(120);
        c5.gasUp();
        System.out.println(c5.getInfo());
    }
}
