package 학생성적;

public class Record {
    public static void main(String [] args) {
        Student a = new Student(1001, "Lee");
        a.addSubject("국어", 100);
        a.addSubject("수학", 50);

        Student b = new Student(1002, "Kim");
        b.addSubject("국어", 70);
        b.addSubject("수학", 85);
        b.addSubject("영어", 100);

        a.show_info();
        System.out.println("===================================");
        b.show_info();
    }
}
