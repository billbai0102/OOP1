public class Student {
    public String name;
    public int mark1;
    public int mark2;
    public double average;

    /**
     * Class constructor.
     *
     * @param n A String containing student's name.
     */
    public Student(String n) {
        name = n;
        mark1 = 0;
        mark2 = 0;
        average = 0.0;
    }

    /**
     * Sets student's mark1 and mark2
     *
     * @param An int containing student's mark1.
     * @param An int containing student's mark2.
     */
    public void setMarks(int x, int y) {
        mark1 = x;
        mark2 = y;
    }

    /**
     *Sets student's average to the average of mark1 and mark2.
     */
    public void calcAverage() {
        average = (mark1 + mark2) / 2;
    }

    /**
     * Returns student's name and average.
     *
     * @return A String containing student's name and average in a sentence.
     */
    public String message() {
        return name + ", you got an " + average;
    }

    /**
     * Application's entry point.
     */
    public static void main(String[] args) {
        //Question 2, Excersize 1
        Student[]stu = new Student[5];
        stu[0] = new Student("Armaan");
        stu[1] = new Student("Andrey");
        stu[2] = new Student("Adar");
        stu[3] = new Student("Aditya");
        stu[4] = new Student("Leo");
        for(int x = 0; x < stu.length; x++){
            stu[x].setMarks((int)(Math.random()*100) + 50,(int)(Math.random()*100) + 50);
            stu[x].calcAverage();
            //System.out.println(stu[x].message());
        }

        //Creates a new Student object array, and copies stu to it
        Student[]stu2 = new Student[10];
        for(int x = 0; x < stu.length; x++)
            stu2[x] = stu[x];

        //Filling out student 8
        stu2[7] = new Student("Harry");
        stu2[7].setMarks(100,70);

        //Runs methods on all objects, if they aren't null.
        for (Student student:stu2){
            if(student != null){
                    student.calcAverage();
                    System.out.println(student.message());
            }
        }

        //Uses a for-loop to calculate and run all methods for all objects.
        /*
        //Creates an instance of Student class. "s1" object.
        Student s1 = new Student("Armaan");
        s1.setMarks(100, 95);
        s1.calcAverage();
        //Creates an instance of Student class. "s2" object.
        Student s2 = new Student("Andrey");
        s2.setMarks(95, 90);
        s2.calcAverage();
        //Creates an instance of Student class. "s3" object.
        Student s3 = new Student("Adar");
        s3.setMarks(99, 93);
        s3.calcAverage();
        //Creates an instance of Student class. "s4" object.
        Student s4 = new Student("Aditya");
        s4.setMarks(96, 96);
        s4.calcAverage();
        //Creates an instance of Student class. "s5" object.
        Student s5 = new Student("Leo");
        s5.setMarks(100, 97);
        s5.calcAverage();
        //Uses the message() method to return the student's name and average in a sentence
        System.out.println(s1.message());
        System.out.println(s2.message());
        System.out.println(s3.message());
        System.out.println(s4.message());
        System.out.println(s5.message());
        */
    }
}
