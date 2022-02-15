package 싱글톤패턴;

public class Company {
    private static Company instance = new Company();
    public static Company getInstance() {   //객체가 생성되지 않아도 사용할 수 있는 함수이
        if(instance == null) {
            instance = new Company();
        }
        return instance;
    }
}
