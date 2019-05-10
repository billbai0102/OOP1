public class AnimalOOP {
    public static void main(String[]args){
        Animal tiger = new Animal ("Tigger",200);
        Animal bear = new Animal("Winnie", 155.4);
        Animal donkey = new Animal("Eeyore",105.5);
        Animal elephant = new Animal("Lumpy",700);
        Animal pig = new Animal("Piglet",65.234);
        bear.feed("meat");
        bear.sleep();
    }
}
