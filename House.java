public class House {
    private int street_num;
    private String street;
    private String city;
    private String province;
    private String postal_code;
    private double size;
    private boolean detached;
    private int stories;

    /**
     * Class constructor.
     *
     * @param n An int containing the house's street number.
     * @param s A String containing the house's street.
     * @param c A String containing the house's  city.
     * @param pv A String containing the house's province.
     * @param p A String containing the house's postal code.
     * @param si A double containing the house's size.
     * @param d A boolean that is true if the house is detached, false if not.
     * @param l An in containing the house's number of stories.
     */
    public House(int n, String s, String c, String pv, String p, double si, boolean d, int l) {
        street_num = n;
        street = s;
        city = c;
        province = pv;
        postal_code = p;
        size = si;
        detached = d;
        stories = l;
    }

    /**
     * Prints street_num, street, city, province, and postal_code
     * of the House object.
     */
    public void displayAddress(){
        System.out.println(street_num + " " + street);
        System.out.println(city + ", " + province);
        System.out.println(postal_code);
    }

    /**
     * Application's entry point.
     */
    public static void main(String[]args){
        House h1 = new House(100,"Tillplain","Toronto","Ontario", "M2N 4B6",123.321,true,3);
        h1.displayAddress();
        House h2 = new House(111,"Hillcrest","Toronto","Ontario", "A3A 3N8",124,false,2);
        h2.displayAddress();
        House h3 = new House(122,"Foresthill","Montreal","Quebec", "B4A 7G8",322.3,true,2);
        h3.displayAddress();
        House h4 = new House(133,"Rosedale","Ottawa","Ontario", "C2N 9J2",44.4,true,1);
        h4.displayAddress();
        House h5 = new House(144,"Jane","St.Johns","Newfoundland", "D6J 7A2",11111.1,false,100);
        h5.displayAddress();
    }
}
