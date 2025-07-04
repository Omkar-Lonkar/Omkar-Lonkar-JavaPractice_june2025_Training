import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class TestSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // //TODO: Serialize Student Object
        // Student student = new Student(100, "John Doe", 76.5f);
        // ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("C:\\Tony\\Coding\\Java\\Practice JAVA\\StudentClasses\\src\\File Handling\\serializing.txt"));
        // System.out.println("Serializing Student");
        // objectOutputStream.writeObject(student);
        // objectOutputStream.close();


        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C:\\Tony\\Coding\\Java\\Practice JAVA\\StudentClasses\\src\\File Handling\\serializing.txt"));
        System.out.println("De Serializing Student");
        Student objectFromFile = (Student) objectInputStream.readObject();
        objectFromFile.printDetails();
        objectInputStream.close();
    }
        
    }
