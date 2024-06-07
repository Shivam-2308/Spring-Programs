package example;

public class College {
    int college_ID;
    String college_name;

    public College() {
    }

    public College(int college_ID, String college_name) {
        college_ID = college_ID;
        college_name = college_name;
    }

    public int getCollege_ID() {
        return college_ID;
    }

    public void setCollege_ID(int college_ID) {
        college_ID = college_ID;
    }

    public String getCollege_name() {
        return college_name;
    }

    public void setCollege_name(String college_name) {
        college_name = college_name;
    }

    @Override
    public String toString() {
        return "College{" +
                "college_ID=" + college_ID +
                ", college_name='" + college_name + '\'' +
                '}';
    }
}
