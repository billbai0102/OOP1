public class Fraction {
    int numerator;
    int denominator;
    public Fraction (int nume, int denom) {
        numerator = nume; denominator = denom;
    }
    public int getNumerator () {
        return numerator;
    }
    public int getDenumerator () {
        return denominator;
    }
    public String toString () {
        return (numerator + " / " + denominator);
    }
}