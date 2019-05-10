public class Airplane {
    private int gasLevel;
    private String landingGear;
    private String doorStatus;
    private int passengers;

    /**
     * Class constructor.
     *
     * @param doorStatus The door status of the plane, as a String.
     * @param passengers An int containing the plane's passenger count.
     */
    public Airplane(String doorStatus, int passengers) {
        gasLevel = 100;
        landingGear = "Down";
        this.doorStatus = doorStatus;
        this.passengers = passengers;
    }

    /**
     * Simulates the plane opening it's door,
     * setting doorStatus to "Opened".
     */
    public void openDoor() {
        doorStatus = "Opened";
    }

    /**
     * Closes the plane door, setting doorStatus
     * to "Closed".
     */
    public void closeDoor() {
        doorStatus = "Closed";
    }

    /**
     * Fills gas tank up, setting gasLevel
     * to 100(full).
     */
    public void fillUp() {
        gasLevel = 100;
    }

    /**
     * Simulates plane taking off, taking
     * 30% gas.
     */
    public void takeOff() {
        gasLevel -= 30;
    }

    /**
     * Sets landingGear to "Up".
     */
    public void doneTakeOff(){
        landingGear = "Up";
    }

    /**
     * Simulates plane in flight. Subtracts
     * gasUsed from gasLevel.
     * @param gasUsed An int containing how much
     *                gas the plane has used.
     */
    public void normalFlight(int gasUsed) {
        gasLevel -= gasUsed;
    }

    /**
     * Sets landing gear to "Down".
     */
    public void prepLanding() {
        landingGear = "Down";
    }

    /**
     * Subtracts 15% from the gas level.
     */
    public void land() {
        gasLevel -= 15;
    }

    /**
     * Adds pass to passengers, increasing anount of passengers on plane.
     *
     * @param pass An int containing how many passengers will be
     *             added to the total.
     */
    public void loadPass(int pass) {
        passengers += pass;
    }

    /**
     * Subtracts pass amount of passengers from the total.
     *
     * @param pass An int containing how many passengers will be
     *             subtracted from the total.
     */
    public void unloadPass(int pass) {
        passengers -= pass;
    }

    /**
     * Accessor method, used to get gasLevel.
     *
     * @return An int containing the gas level, gasLevel.
     */
    public int getGasLevel() {
        return gasLevel;
    }

    /**
     * Accessor method, used to get doorStatus.
     *
     * @return A String containing the door status, doorStatus.
     */
    public String getDoorStatus() {
        return doorStatus;
    }

    /**
     * Accessor method used to get number of passengers.
     *
     * @return An int that is passengers.
     */
    public int getPassengers() {
        return passengers;
    }

    /**
     * Gets the status of the landing gear.
     *
     * @return A String, landingGear.
     */
    public String getLandingGear() {
        return landingGear;
    }

    /**
     * Application's entry point.
     *
     * @param args
     */
    public static void main(String[] args) {
        Airplane Boeing747 = new Airplane("Closed", 25);
        Boeing747.openDoor();
        System.out.println("The doors have been " + Boeing747.getDoorStatus());
        Boeing747.loadPass(50);
        System.out.println("There are now " + Boeing747.getPassengers() + " passengers on board.");
        Boeing747.closeDoor();
        System.out.println("The doors have been " + Boeing747.getDoorStatus());
        Boeing747.fillUp();
        System.out.println("The fuel is at " + Boeing747.getGasLevel() + "%");
        Boeing747.takeOff();
        System.out.println("The plane has taken off. It's fuel is now at " + Boeing747.getGasLevel() + "%");
        Boeing747.doneTakeOff();
        System.out.println("The plane is now in air. It's landing gear are " + Boeing747.getLandingGear());
        Boeing747.normalFlight(30);
        System.out.println("The plane is in flight. It's gas is now at " + Boeing747.getGasLevel() + "%");
        Boeing747.prepLanding();
        System.out.println("The plane is about to land. It's landing gear are " + Boeing747.getLandingGear());
        Boeing747.land();
        System.out.println("The plane has landed. It's gas level is at " + Boeing747.getGasLevel() + "%");
        Boeing747.unloadPass(45);
        System.out.println("Passengers have been unloaded. There are " + Boeing747.getPassengers() + " Passengers left");
    }
}
