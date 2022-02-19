package 컬렉션프레임워크.컬렉션프레임워크.해쉬셋;
import java.util.HashSet;
import java.util.Iterator;
import 컬렉션프레임워크.컬렉션프레임워크.콜렉션.Member;

public class MemberHashSet {
    private HashSet<Member> hashset;

    public MemberHashSet() {
        hashset = new HashSet<Member> ();
    }
    public void addMember(Member member) {
        hashset.add(member);
    }
    public boolean removemember(int memberid) {
        Iterator<Member> ir = hashset.iterator();

        while(ir.hasNext()){
            Member member = ir.next();
            int tempid = member.getmemid();
            if(tempid == memberid) {
                hashset.remove(member);
                return true;
            }
        }
        System.out.println(memberid + " 멤버가 존재하지 않았습니다");
        return false;
    }
    public void showAllMember() {
        for ( Member c : hashset) {
            System.out.println(c);
        }
        System.out.println();
    }
}
