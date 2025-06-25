public class Student1 {
    int id;
    float[] marks;
    String name;
    float percentage;
    char grade;
    int sub;


    public Student1(){

    }
    public Student1(int id, int sub, float[] marks, String name) {
        this.id = id;
        this.sub = sub;
        this.marks = marks;
        this.name = name;
        
    }

    public void calculatePercentage(){
        float sum = 0;
        float maxMarks = sub*100;
        for(float mark : marks){
            sum = sum + mark;
            }
        percentage = (sum/maxMarks)*100;
        }

    public void calculateGrade(){
        if(percentage>=80)
            grade = 'A';
        else if(percentage>=60)
            grade = 'B';
        else if(percentage>=40)
            grade = 'C';
        else
            grade = 'F';
    }

    // public Student1() {

    // }

    // public int getId() {
    //     return id;
    // }

    // public void setId(int id) {
    //     this.id = id;
    // }

    // public float getMarks() {
    //     return marks;
    // }

    // public void setMarks(float marks) {
    //     this.marks = marks;
    // }

    // public String getName() {
    //     return name;
    // }

    // public void setName(String name) {
    //     this.name = name;
    // }

    void printDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        for(float mark:marks){
            System.out.println("Marks: " + mark);
        }
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);
    }
    public static void main(String[] args) {
        
    }
    public void setId(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setId'");
    }
}