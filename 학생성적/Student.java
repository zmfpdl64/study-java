package 학생성적;
import java.util.ArrayList;

public class Student {
    int studentid;
    String name;
    ArrayList<Subject> subjectList;

    public Student(int studentid, String name) {
        this.name = name;
        this.studentid = studentid;
        subjectList = new ArrayList<Subject>();
    }
    public void addSubject(String name, int score)  {
        Subject subject = new Subject();
        subject.setname(name);
        subject.setScore(score);
        subjectList.add(subject);
    }
    public void show_info() {
        int total = 0;
        for(Subject s : subjectList) {
            total += s.getscore();
            System.out.println(name +"이 " + s.getname() + "과목을" + s.getscore() + "점 맞았습니다");
            
        }
        System.out.println("학생 " + name + "의 총점은 " + total + " 입니다.");
    }
}
