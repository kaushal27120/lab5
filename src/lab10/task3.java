package lab10;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class task3 {
    public static void main(String[] args) throws IOException {

        int bajt;

        try (FileInputStream fis = new FileInputStream("test123.txt");
             FileOutputStream fos = new FileOutputStream("copy123.txt")
        ) {
           do{
               bajt = fis.read();
               if((char)bajt == ' ') bajt = '-';
               if(bajt != -1) fos.write(bajt);
           } while (bajt != -1);

            }catch (IOException e){
            System.out.println("Error IO");
        }




        }
}
