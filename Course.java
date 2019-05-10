public class Course {
    private String code;
    private String name;
    private String level;
    private float mark;
    private String status;
    private byte lates;
    private byte absences;

    public Course(String c, String n, String lev) {
        code = c;
        name = n;
        level = lev;
        mark = 0;
        status = "enrolled";
        absences = 0;
        lates = 0;
    }

    public String getMarkG() {
        if (mark > 89)
            return "A+";
        else if (mark > 84)
            return "A";
        else if (mark > 79)
            return "A-";
        else if (mark > 74)
            return "B+";
        else if (mark > 69)
            return "B";
        else if (mark > 64)
            return "C+;";
        else if (mark > 59)
            return "C";
        else if (mark > 54)
            return "D+";
        else if (mark >= 50)
            return "D";
        else
            return "F";
    }

    public float getMark(){
        return mark;
    }
    public String getStatus(){
        return status;
    }
    public String getLevel(){
        return level;
    }
    public String getCode(){
        return code;
    }
    public String getName(){
        return name;
    }
    public byte getLates(){
        return lates;
    }
    public byte getAbsences(){
        return absences;
    }
    public void addLates(byte num){
        lates += num;
    }
    public void addAbsences(byte num){
        absences += num;
    }
    public boolean setMark(float m){
        if(mark >= 0 && mark <=100){
            mark = m;
            return true;
        }else
            return false;
    }
    public boolean setStatus(String stat){
        if(stat.equals("completed")|| stat.equals("enrolled") || stat.equals("failed")){
            status = stat;
            return true;
        }else
            return false;
    }
}
