package 컬렉션프레임워크.컬렉션프레임워크.Map;
import 컬렉션프레임워크.컬렉션프레임워크.콜렉션.*;

public class MemberTreeSetTest {
    public static void main(String [] args) {
        MemberTreeMap a = new MemberTreeMap();
        a.addmember(new Member(1, "woojin"));
        a.addmember(new Member(2, "jin"));
        a.addmember(new Member(3, "king"));
        a.addmember(new Member(4, "tang"));
        a.show_all();
        a.removemember(3);
        a.show_all();
    }
}
