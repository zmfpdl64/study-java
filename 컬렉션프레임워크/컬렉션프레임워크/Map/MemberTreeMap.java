package 컬렉션프레임워크.컬렉션프레임워크.Map;
import 컬렉션프레임워크.컬렉션프레임워크.콜렉션.Member;
import java.util.Iterator;
import java.util.TreeMap;

public class MemberTreeMap {
    private TreeMap<Integer, Member> treeMap;
    public MemberTreeMap() {
        treeMap = new TreeMap<Integer, Member>();
    }
    public void addmember(Member member) {
        treeMap.put(member.getmemid(), member);
    }
    public boolean removemember(int memid) {
        if(treeMap.containsKey(memid)) {
            treeMap.remove(memid);
            return true;
        }
        System.out.println(memid + "가 없습니다.");
        return false;
    }
    public void show_all() {
        Iterator<Integer> ir = treeMap.keySet().iterator();
        while(ir.hasNext()) {
            Member member = treeMap.get(ir.next());
            System.out.println(member);
        }
        System.out.println();
    }
}
