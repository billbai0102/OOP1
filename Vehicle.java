public class Vehicle {
    private String type;
    private String manufacture;
    private String model;
    private short year;
    private String color;
    private byte numOfDoors;
    private float gasTankSize;
    private float gas;
    private int km;

    public Vehicle(String typ, String manu, String mod, short yea, String col, byte nDoors, float tankS) {
        type = typ;
        manufacture = manu;
        model = mod;
        year = yea;
        color = col;
        numOfDoors = nDoors;
        gasTankSize = tankS;
        gas = 0;
        km = 0;
    }

    public void paint(String colour) {
        color = colour;
    }

    public void gasUp(int litres) {
        if (gas + litres > gasTankSize)
            gas = gasTankSize;
        else
            gas += litres;
    }

    public boolean drive(int distance) {
        if (gas - distance > 0) {
            gas -= distance;
            km += distance;
            return true;
        }
        return false;
    }

    public String getType() {
        return type;
    }

    public String getManufact() {
        return manufacture;
    }

    public String getModel() {
        return model;
    }

    public short getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public byte getDoors() {
        return numOfDoors;
    }

    public float getTankSize() {
        return gasTankSize;
    }
}
