package test;

public class PersonTest {
    private String name;    //처음 선언할때는 사용할 수 있지만 따로 메서드를 불러서 초기화 시킬수 없다.
    float height;
    float weight;

    public PersonTest() {}

    public PersonTest(String name) {
        this.name = name;
    }

    public PersonTest(String name, float height, float weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
    public String gename() {
        return name;
    }

    public void chname(String name) {
        this.name = name;
    }

    public void info() {
        System.out.println("나의 신상정보: " + name + " " + height + " "  + weight);
    }
    
}
