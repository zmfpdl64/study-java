package 컬렉션프레임워크.컬렉션프레임워크.트리셋;
import java.util.Comparator;

public class Member2 implements Comparator<Member2>{

    private int memid;
    private String name;

    public Member2 (int memid, String name) {
        this.memid = memid;
        this.name = name;
    }
    public int getid() {
        return this.memid;
    }
    public String getname() {
        return this.name;
    }
        
    @Override
    public int compare(Member2 o1, Member2 o2) {
        return o1.getid() - o2.getid();
    }
    
}
