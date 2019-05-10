public class FractionTester {
    public static void main (String[] args) {
        Fraction myFraction;
        myFraction = new Fraction (3, 4);
        int numerator = myFraction.getNumerator ();
        int denumerator=myFraction.getDenumerator();
        System.out.println ("Numenator Value: " + numerator);
        System.out.println("Denumerator value: "+denumerator);
        System.out.println ("Fraction: " + myFraction);
    }
}