import java.io.Serializable;

public class Student implements Serializable {

    int id;
    String name;
    float marks;

    @Override
    public String toString() {
        return "Student []";
    }

    public Student(int id, String name, float marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }
    void printDetails(){
        System.out.println("Student ID: "+id);
        System.out.println("Student Name: "+name);
        System.out.println("Student Marks: "+marks);
    }
    
    
    
}
