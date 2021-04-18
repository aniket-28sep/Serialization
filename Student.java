package searial;

import java.io.Serializable;

public class Student implements Serializable {
    public int rollNum;
    public String name;

    public Student(int roll, String name) {
        this.rollNum = roll;
        this.name = name;
    }

}
