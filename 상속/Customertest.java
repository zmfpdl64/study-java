package 상속;
import java.util.ArrayList;

public class Customertest {
    public static void main(String [] args) {
        ArrayList<Customer> customerlist = new ArrayList<Customer>();
        Customer a = new Customer();
        Customer b = new Customer();
        Customer c = new Customer();
        Customer d = new Customer();
        Customer e = new Customer();
        customerlist.add(a);
        customerlist.add(b);
        customerlist.add(c);
        customerlist.add(d);
        customerlist.add(e);

        for(Customer i : customerlist) {
            System.out.println(i.info());
        }
    }
}
