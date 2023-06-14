import java.io.Serializable;

public class Serialization implements Serializable {
    int id;
    String name;
    public Serialization(int id,String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "student id : "+id+"student name : "+name;
    }
}
