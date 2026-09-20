import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class filehand{
    public static void main(String[] args){
        try{
            FileWriter writer = new FileWriter("store.txt");
            writer.write("My name is vrsk");
            writer.close();
            File file = new File("store.txt");
            System.out.println("The File is located at : " + file.getAbsolutePath());
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}