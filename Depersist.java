import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Student implements Serializable {
    static final long serialVersionUID = 1L;
    public int rollNum;
    public String name;

    public Student(int roll, String name) {
        this.rollNum = roll;
        this.name = name;
    }

}

public class Depersist {
    public static void main(String[] args) {
        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("output.txt"));
            Student s1 = (Student) is.readObject();
            Student s2 = (Student) is.readObject();
            System.out.println(s1.name + " " + s2.name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
