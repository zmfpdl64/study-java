package 기본클래스.Class클래스;

public class NewInstanceTest {
    public static void main(String [] args) throws ClassNotFoundException, InstantiationException
    , IllegalAccessException{
        Person person = new Person();
            System.out.println(person);

            Class pClass = Class.forName("기본클래스.Class클래스.Person");
            Person person2 = (Person)pClass.newInstance();
            System.out.println(person2);        

    }
}
