package 컬렉션프레임워크.컬렉션프레임워크.Map;
import 컬렉션프레임워크.컬렉션프레임워크.콜렉션.Member;

public class MemberHashMapTest {
    public static void main(String [] args) {
        MemberHashMap a = new MemberHashMap();
        a.addMember(new Member(1, "woojin"));
        a.addMember(new Member(2, "jin"));
        a.addMember(new Member(3, "hyeon"));
        a.addMember(new Member(4, "king"));

        a.show_all();
        a.removeMember(4);
        a.show_all();
    }
}
