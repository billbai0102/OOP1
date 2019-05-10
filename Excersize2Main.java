import java.util.Scanner;

public class Excersize2Main {
    public static void main(String[] args) {

        Person p1 = new Person("Julius", "Caesar", "07/13/0100", 1.80, 180);
        p1.setName("Random", "Name");
        p1.setWeight(100);
        p1.setHeight(25);
        System.out.println(p1.getName());
        System.out.println(p1.getDOB());
        System.out.println(p1.getDOB_year());
        System.out.println(p1.getDOB_month());
        System.out.println(p1.getDOB_day());
        System.out.println(p1.getWeight());
        System.out.println(p1.getHeight());

        Person p2 = new Person("Bob", "Jenkins", "01/10/2000", 1.50, 120);
        p2.setName("John", "Smith");
        p2.setWeight(100);
        p2.setHeight(100);
        System.out.println(p2.getName());
        System.out.println(p2.getDOB());
        System.out.println(p2.getDOB_year());
        System.out.println(p2.getDOB_month());
        System.out.println(p2.getDOB_day());
        System.out.println(p2.getWeight());
        System.out.println(p2.getHeight());



        Wheel w1 = new Wheel("Michelin", "AC101", 5, "Summer");
        w1.update_KM_usage(25000);
        System.out.println(w1.getBrand());
        System.out.println(w1.getModel());
        System.out.println(w1.getSize());
        System.out.println(w1.getSeason());
        System.out.println(w1.getKM());
        System.out.println(w1.getTreadCondition());

        Wheel w2 = new Wheel("Other Brand", "35010103", 5, "Winter");
        w2.update_KM_usage(100);
        System.out.println(w2.getBrand());
        System.out.println(w2.getModel());
        System.out.println(w2.getSize());
        System.out.println(w2.getSeason());
        System.out.println(w2.getKM());
        System.out.println(w2.getTreadCondition());



        Course c1 = new Course("ICS40","Intro to CS", "Grade 12");
        c1.setMark(54);
        c1.setStatus("enrolled");
        c1.addLates((byte)3);
        c1.addAbsences((byte)2);
        System.out.println(c1.getMarkG());
        System.out.println(c1.getMark());
        System.out.println(c1.getStatus());
        System.out.println(c1.getLevel());
        System.out.println(c1.getCode());
        System.out.println(c1.getName());
        System.out.println(c1.getLates());
        System.out.println(c1.getAbsences());

        Course c2 = new Course("ICS3U","Intro to CS", "Grade 11");
        c2.setMark(25);
        c2.setStatus("failed");
        c2.addLates((byte)3);
        c2.addAbsences((byte)2);
        System.out.println(c2.getMarkG());
        System.out.println(c2.getMark());
        System.out.println(c2.getStatus());
        System.out.println(c2.getLevel());
        System.out.println(c2.getCode());
        System.out.println(c2.getName());
        System.out.println(c2.getLates());
        System.out.println(c2.getAbsences());



        Vehicle v1 = new Vehicle("car", "Honda", "Civic",(short)2019,"Gray",(byte)4,65);
        v1.paint("Blue");
        v1.gasUp(100);
        v1.drive(5);
        System.out.println(v1.getType());
        System.out.println(v1.getManufact());
        System.out.println(v1.getModel());
        System.out.println(v1.getYear());
        System.out.println(v1.getColor());
        System.out.println(v1.getDoors());
        System.out.println(v1.getTankSize());

        Vehicle v2 = new Vehicle("SUV", "Cadillac", "Escalade",(short)2019,"Blue",(byte)4,100);
        v2.paint("Chrome");
        v2.gasUp(50);
        v2.drive(50);
        System.out.println(v2.getType());
        System.out.println(v2.getManufact());
        System.out.println(v2.getModel());
        System.out.println(v2.getYear());
        System.out.println(v2.getColor());
        System.out.println(v2.getDoors());
        System.out.println(v2.getTankSize());



        Account a1 = new Account(123456789,"savings",1000);
        a1.setInterest(0.05f);
        a1.calcInterest();
        a1.withdraw(30);
        a1.deposit(50);
        System.out.println(a1.getBalance());
        System.out.println(a1.getAccount());
        System.out.println(a1.getType());

        Account a2 = new Account(987654321,"chequing",1000);
        a2.setInterest(0.05f);
        a2.calcInterest();
        a2.withdraw(30);
        a2.deposit(50);
        System.out.println(a2.getBalance());
        System.out.println(a2.getAccount());
        System.out.println(a2.getType());

    }
}
