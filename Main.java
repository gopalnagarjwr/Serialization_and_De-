import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        String file="serialization.txt";
        try {
            Serialization s=new Serialization(1001,"ram");
            FileOutputStream fos=new FileOutputStream(file);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(s);
            oos.flush();
            oos.close();
            System.out.println("sucessfully done");
        }catch (IOException e){
            e.printStackTrace();
        }

    }

}

