package 싱글톤패턴;

public class CompanyTest {
    public static void main(String [] args) {
        Company a = Company.getInstance();
        Company b = Company.getInstance();
        System.out.println(a == b);
    }
    
}
