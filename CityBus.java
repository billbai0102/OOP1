public class CityBus {
    int gas;
    int passengers;
    String doorStatus;

    public CityBus(){
        gas = 100;
        passengers = 0;
        doorStatus = "Open";
    }

    public CityBus(int gas, int passengers, String doorStatus){
        this.gas = gas;
        this.passengers = passengers;
        this.doorStatus = doorStatus;
    }

    public void closeDoor(){
        doorStatus = "Closed";
    }

    public int setPassengers(int passengers){
        this.passengers += passengers;
        return this.passengers;
    }

    public void passOn(int number){
        passengers+=number;
    }

    public int getGasLevel(){
        return(gas);
    }

    public static void main(String[] args) {
        CityBus bus79 =new CityBus(100,100,"Open");

        System.out.println(bus79.getGasLevel());
        System.out.println(bus79.setPassengers(13));
        bus79.passOn(7);
        System.out.println("Passengers are " + bus79.passengers);
    }
}
