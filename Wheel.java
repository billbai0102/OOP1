public class Wheel {
    private String brand;
    private String model;
    private int size;
    private String season;
    private int KM_usage;
    private String tread_condition;

    public Wheel(String br, String mod, int siz, String sea) {
        brand = br;
        model = mod;
        size = siz;
        season = sea;
        KM_usage = 0;
        tread_condition = "new";
    }

    public void update_KM_usage(int km) {
        KM_usage = km;
        if(KM_usage <= 0)
            tread_condition = "New";
        else if(KM_usage > 0 && KM_usage <= 1000)
            tread_condition = "Good";
        else if (KM_usage > 1000 && KM_usage <= 10000)
            tread_condition = "Needs Changing";
        else if (KM_usage > 10000 && KM_usage <= 15000)
            tread_condition = "Bad";
        else
            tread_condition = "Dangerous";
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getSize() {
        return size;
    }

    public String getSeason() {
        return season;
    }

    public int getKM(){
        return KM_usage;
    }

    public String getTreadCondition(){
        return tread_condition;
    }
}
