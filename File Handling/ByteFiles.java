import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteFiles {
    void readFiles() throws IOException{
        FileInputStream fileInputStream = new FileInputStream("C:\\Tony\\Coding\\Java\\Practice JAVA\\ArrayOfObjects\\File Handling\\text.txt");
        // byte[] fileBytes = fileInputStream.readAllBytes();
        // String text = String.valueOf(fileBytes);             //Can't read at once.
        // System.out.println(text);


        // for(byte fileByte: fileBytes){         //reads one-by-one
        //     System.out.print((char)fileByte);
        // }
        System.out.println("Reading Data from the file");
        int ch = 0;
        while((ch = fileInputStream.read()) != -1);{
            System.out.println((char) ch);
        }
        fileInputStream.close();
        
    }

    void writeFile() throws IOException{
        String msg = "This is data";
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Tony\\Coding\\Java\\Practice JAVA\\ArrayOfObjects\\File Handling\\data.txt");
        System.out.println("Writing Data from the file");
        fileOutputStream.write(msg.getBytes());
        fileOutputStream.close();
    }

    public static void main(String[] args) throws IOException {
        ByteFiles byteFiles = new ByteFiles();
        byteFiles.readFiles();  
        byteFiles.writeFile();
    }
}
