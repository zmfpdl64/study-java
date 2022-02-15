package 다방_직원관계;

public class Relation {
    public static void main(String [] args) {
        Cafe a = new Cafe("별다방",4000, 5000, 0);
        Cafe b = new Cafe("콩다방",3500, 4500, 0);
        Employee c = new Employee("woojin", 10000);
        Employee d = new Employee("bin", 10000);
        //Makecard e = new Makecard();
        //Makecard f = new Makecard();
        //System.out.printf("%d %d\n", e.cardid, f.cardid);
        Makecard g = Makecard.getId();
        System.out.println(g.cardid);
        g.cardid = 1;
        System.out.println(g.cardid);
        c.payame(a);
        d.paylat(b);
        c.print_info();
        d.print_info();
        a.print_info();
        b.print_info();
    }
}
