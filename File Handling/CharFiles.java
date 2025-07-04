import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharFiles {
    void readFile() throws IOException {
        FileReader fileReader = new FileReader("C:\\Tony\\Coding\\Java\\Practice JAVA\\ArrayOfObjects\\File Handling\\text.txt");
        int ch = 0;
        while ((ch = fileReader.read())!=-1) {
            System.out.print((char) ch);            
        }
        fileReader.close();
    }

    void writeFile() throws IOException{
        String msg = "This is char data";
        FileWriter fileWriter = new FileWriter("C:\\Tony\\Coding\\Java\\Practice JAVA\\ArrayOfObjects\\File Handling\\data.txt");
        System.out.println("Writing Data from the file");
        fileWriter.write(msg);
        fileWriter.close();
        
    }

    public static void main(String[] args) throws IOException {
        CharFiles charFiles = new CharFiles();
        charFiles.writeFile();
        charFiles.readFile();
    }
}