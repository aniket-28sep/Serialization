import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
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

public class Persist {
    public static void main(String[] args) {
        try {
            Student s1 = new Student(1, "Aniket");
            Student s2 = new Student(2, "Kumar");
            FileOutputStream fout = new FileOutputStream("output.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.writeObject(s2);
            out.flush();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
