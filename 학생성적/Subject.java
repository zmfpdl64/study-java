package 학생성적;

public class Subject {
    private int score;
    private String subjectname;

    public void setScore(int score) {
        this.score = score;
    }
    public int getscore() {
        return this.score;
    }
    public String getname() {
        return this.subjectname;
    }
    public void setname(String name) {
        this.subjectname = name;
    }

}
