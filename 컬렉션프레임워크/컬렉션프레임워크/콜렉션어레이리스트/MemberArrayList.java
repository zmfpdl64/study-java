package 컬렉션프레임워크.컬렉션프레임워크.콜렉션어레이리스트;
import 컬렉션프레임워크.컬렉션프레임워크.콜렉션.Member;
import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
    private ArrayList<Member> arrayList;

    public MemberArrayList() {
        arrayList = new ArrayList<Member>();
    }
    public void addMember(Member member) {
        arrayList.add(member);
    }
    public boolean removeMember(int memberid) {
        Iterator<Member> ir = arrayList.iterator();
        while(ir.hasNext()) {
            Member member = ir.next();
            int tempid = member.getmemid();
            if (memberid == tempid) {
                arrayList.remove(member);
                return true;
            }
        }
        
        System.out.println(memberid + "가 존재하지 않습니다.");
        return false;
    }
    public void showAllMember() {
        for(Member a: arrayList) {
            System.out.println(a);
        }
        System.out.println();
    }
    public ArrayList<Member> getArray() {
        return this.arrayList;
    }
    public static void main(String [] args) {
        MemberArrayList a = new MemberArrayList();
        a.showAllMember();
        a.addMember(new Member(1, "hyeon"));
        a.addMember(new Member(2, "woojin"));
        a.addMember(new Member(3, "bin"));
        a.addMember(new Member(4, "dol"));
        System.out.println("hello" + a.arrayList);
        for(Object b : a.arrayList) {
            System.out.println(b);
        }
        a.showAllMember();
        a.removeMember(2);
        a.showAllMember();
    }
}
