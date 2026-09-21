import java.io.FileReader;
import java.io.IOException;
public class fileread{
    public static void main(String[] args){
        try{
            FileReader reader = new FileReader("store.txt");
            int ch = reader.read();
            while(ch!=-1){
                System.out.print((char) ch);
                ch= reader.read();
            }
            reader.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}