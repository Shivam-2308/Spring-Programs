package example;

public class Student {
    int roll_num;
    String name;
    College college;

    public Student() {
    }

    public Student(int roll_num, String name, College college) {
        this.roll_num = roll_num;
        this.name = name;
        this.college=college;
    }

    public int getRoll_num() {
        return roll_num;
    }

    public void setRoll_num(int roll_num) {
        this.roll_num = roll_num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }
}
