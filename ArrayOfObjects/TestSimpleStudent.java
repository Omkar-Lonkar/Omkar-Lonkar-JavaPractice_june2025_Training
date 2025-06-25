public class TestSimpleStudent {
    public static void main(String[] args) {
        Student1 student = new Student1();
        // student.id = 10;
        // student.marks = 76.4f;
        // Student student = new Student( 10, "OM", 76f);  
        student.setId(10); 
        student.printDetails();
    }
}
