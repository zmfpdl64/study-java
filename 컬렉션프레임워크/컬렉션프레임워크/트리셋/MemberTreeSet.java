package 컬렉션프레임워크.컬렉션프레임워크.트리셋;
import java.util.TreeSet;
import java.util.Iterator;
import 컬렉션프레임워크.컬렉션프레임워크.콜렉션.Member;
public class MemberTreeSet {
    private TreeSet<Member> a = new TreeSet<Member>();  //Member클래스안에 순서를 관리하는 함수를 정의하지 않았기 때문에
    //TreeSet 클래스에서 사용할 수 가 없다. 만약 Member변수가 아니라 Integer String 등등의 기본 함수를 사용했다면 오류가 발생하지 않고
    //실행되었을 것이다.

    public void addmember(Member member) {
        a.add(member);
    }

    public boolean removemember(int memberid) {
        Iterator<Member> ir  = a.iterator();
        
        while(ir.hasNext()) {
            Member member = ir.next();
            if(member.getmemid() == memberid) {
                a.remove(member);
                return true;
            }
        }
        return false;
    }
    public void showAllMember() {
        for( Member c : a) {
            System.out.println(c);
        }
        System.out.println();
    }
}
