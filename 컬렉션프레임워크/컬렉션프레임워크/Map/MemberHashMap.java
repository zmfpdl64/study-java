package 컬렉션프레임워크.컬렉션프레임워크.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;

import 컬렉션프레임워크.컬렉션프레임워크.콜렉션.Member;


public class MemberHashMap {
    private HashMap<Integer, Member> hashMap;
    
    public MemberHashMap() {
        hashMap = new HashMap<Integer, Member>();
    }

    public void addMember(Member member) {
        hashMap.put(member.getmemid(), member);
    }
    public boolean removeMember(int memberid) {
        if(hashMap.containsKey(memberid)) {
            hashMap.remove(memberid);
            return true;
        }
        System.out.println(memberid + "가 존재하지 않습니다.");
        return false;
    }
    public void show_all() {
        Iterator<Integer> ir = hashMap.keySet().iterator();
        while(ir.hasNext()) {
            int key = ir.next();
            Member member = hashMap.get(key);
            System.out.println(member);
        }
        System.out.println();
        ArrayList<Integer> d = new ArrayList<Integer>(hashMap.keySet());
        for(Object c : d) {
            System.out.println(c);
        }
    }
}
