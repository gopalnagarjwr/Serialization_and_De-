import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class De_serialization{
    public static void main(String []args){
        String file="Serialization.txt";
        try {
            FileInputStream fis=new FileInputStream(file);
            ObjectInputStream ois=new ObjectInputStream(fis);
            Serialization s1=(Serialization) ois.readObject();
            System.out.println(s1);
            System.out.println(s1.id);
            System.out.println(s1.name);
        }catch (IOException |ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }
}
