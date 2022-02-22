package _15자바입출력.직렬화;

import java.io.*;

class Dog implements Externalizable {
    String name;
    public Dog () {

    }
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(name);        
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = in.readUTF() +" pet";        
    }
    public String toString() {
        return name;
    }
    
}

public class ExternalizableTest {
    public static void main(String[] args) throws Exception {
        // Dog mydog = new Dog();
        // mydog.name = "멍멍이";
        
        // FileOutputStream a = new FileOutputStream("external.txt");
        // ObjectOutputStream b = new ObjectOutputStream(a);

        // try(a; b) {
        //     b.writeObject(mydog);
        // } catch(Exception e) {
        //     System.out.println(e);
        // }

        FileInputStream c = new FileInputStream("external.txt");
        ObjectInputStream d = new ObjectInputStream(c);
        try(c; d) {
            Dog dog = (Dog)d.readObject();
            System.out.println(dog);
        } catch(Exception e) {
            e.printStackTrace();
        }



    }
}
