public class Animal {
    private String name;
    private boolean tired;
    private boolean hungry;
    private double weight;

    /**
     * Class constructor.
     *
     * @param n A String containing the Animal object's name.
     * @param w A double containing the Animal object's weight.
     */
    public Animal(String n, double w) {
        name = n;
        tired = true;
        hungry = true;
        weight = w;
    }

    /**
     * Simulates feeding an animal, by increasing weight.
     *
     * @param v A String containing what food is being fed.
     *          This String will determine how much weight the
     *          animal gains.
     */
    public void feed(String v) {
        hungry = false;
        if (v.equals("vegetables"))
            weight += 2;
        else if (v.equals("meat"))
            weight += 4;
        else
            weight += 1;
    }

    /**
     * Simulates sleeping, by turning tired to false, and
     * substracting weight.
     */
    public void sleep(){
        tired = false;
        weight -= 3;
    }

    /**
     * Application's entry point.
     */
    public static void main(String[]args){
        Animal tiger = new Animal ("Tigger",200);
        Animal bear = new Animal("Winnie", 155.4);
        Animal donkey = new Animal("Eeyore",105.5);
        Animal elephant = new Animal("Lumpy",700);
        Animal pig = new Animal("Piglet",65.234);

        bear.feed("meat");
        bear.sleep();
        tiger.feed("meat");
        tiger.sleep();
        donkey.feed("vegetables");
        donkey.sleep();
        elephant.feed("peanuts");
        elephant.sleep();
        pig.feed("candy");
        pig.sleep();
    }
}
