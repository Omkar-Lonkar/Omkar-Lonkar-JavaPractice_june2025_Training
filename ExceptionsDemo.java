import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//(hover on Filereader ->  quickfix) OR (ctrl+.) -> surround with try/catch
//     //var reader = new FileReader("file.txt");        //Checked exception: (FileNotFoundException) checks exception before compilation
// } 
// public static void show(){
//     sayHello(null);        //Unchecked exception: (FileNotFoundException) Runtime exception errors
// } 
// public static void sayHello(String name){
//     System.out.println(name.toUpperCase());
// }
// public static void main(String[] args) {

// }
public class ExceptionsDemo {
    public static void showfile() {
        // try{
        // var reader = new FileReader("file.txt");
        // System.out.println("File Opened");
        // } catch(FileNotFoundException ex){
        // System.out.println("File Not Found");
        // System.out.println(ex.getMessage());
        // }
        FileReader reader = null;
        try { // runs if no exception
            reader = new FileReader("file.txt");
        } catch (FileNotFoundException e) { // runs if exception
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch(Exception w){
            System.out.println("Some other exception");
        }

        finally { // runs always regardless to exception
            try {
                reader.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}