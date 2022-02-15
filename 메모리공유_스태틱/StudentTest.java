package 메모리공유_스태틱;

public class StudentTest {
    public String name;
    public int grade;
    private static int serialnum=100;
    public int studentid;

public StudentTest(String name){
    this.name = name;
    this.studentid = StudentTest.serialnum;
    serialnum++;
}
public void print_num() {
    System.out.println(serialnum + name);
}
public static void print_rand() {   //인스턴스가 생성되지 않았을때는 일반 변수는 사용할 수 없기 때문에 오류가 발생한다.
    System.out.println(serialnum);  //static함수에서 static형식의 변수를 사용하지 않는다면 오류가 발생한다.
}
}
