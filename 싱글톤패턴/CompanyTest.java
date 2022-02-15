package 싱글톤패턴;

public class CompanyTest {
    public static void main(String [] args) {
        Company a = Company.getInstance();  //컴퍼니 객체에 instance 변수값이 null이면 새로운 객체를 생성하여 a값에 반환한다.
        Company b = Company.getInstance();  //a에서 instance값에 객체를 생성시켰기 때문에 객체를 생성하지 않기 때문에
                                            //static에 저장되어있던 a의 객체의 주소가 b에 전달된다.
        System.out.println(a == b);         //그렇기에 a와 b의 주소가 동일하다.
    }
    
}
