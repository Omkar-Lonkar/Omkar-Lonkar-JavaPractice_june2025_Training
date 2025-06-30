import java.io.FileReader;
import java.io.IOException;

public class TestThrowsException{
    int divide(int a, int b) throws ArithmeticException{
        return a/b;
    }

    void readFile() throws IOException{
        FileReader fileReader = new FileReader("some-file"); 
        }
    
    public static void main(String[] args) throws IOException{
        TestThrowsException testThrowsException = new TestThrowsException();
        testThrowsException.divide(10, 0);
        testThrowsException.readFile();
    }
}
