public class Person {
    private String fname;
    private String lname;
    private String DOB;
    private double height;
    private double weight;

    /**
     * Class constructor.
     *
     * @param first A String carrying person's first name.
     * @param last A String carrying person's last name.
     * @param dob A String carrying person's DateOfBirth.
     * @param h A double carrying person's height.
     * @param w A double carrying person's weight.
     */
    public Person(String first, String last, String dob, double h, double w) {
        fname = first;
        lname = last;
        DOB = dob;
        height = h;
        weight = w;
    }

    /**
     * Set's the person's name.
     *
     * @param first A String containing person's first name.
     * @param last  A String containing person's last name.
     */
    public void setName(String first, String last) {
        fname = first;
        lname = last;
    }

    /**
     * Sets person's new weight.
     *
     * @param w A double containing the new weight for the person.
     * @return A boolean that returns true if setWeight is successful.
     */
    public boolean setWeight(double w) {
        if (w > 0) {
            weight = w;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Sets person's new height
     *
     * @param h A double containing the new height for the person.
     * @return A boolean that returns true if setHeight is successful.
     */
    public boolean setHeight(double h) {
        if (h > 0) {
            height = h;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Gets person's first and last name.
     *
     * @return A String containing person's first and last name.
     */
    public String getName() {
        return fname + " " + lname;
    }

    /**
     * Gets DateOfBirth
     *
     * @return A String containing person's DateOfBirth.
     */
    public String getDOB() {
        return DOB;
    }

    /**
     * Gets birth year.
     *
     * @return An int containing person's birth year.
     */
    public int getDOB_year() {
        return (int) Integer.parseInt(DOB.substring(6, 10));
    }

    /**
     * Gets birth month.
     *
     * @return An int containing person's birth month.
     */
    public int getDOB_month() {
        return (int) Integer.parseInt(DOB.substring(0, 2));
    }

    /**
     * Gets birth day.
     *
     * @return An int containing person's birth day.
     */
    public int getDOB_day() {
        return (int) Integer.parseInt(DOB.substring(3, 5));
    }

    /**
     * Gets height.
     *
     * @return An int containing person's height.
     */
    public double getHeight() {
        return height;
    }


    /**
     * Gets weight.
     *
     * @return An int containing person's weight.
     */
    public double getWeight() {
        return weight;
    }
}
