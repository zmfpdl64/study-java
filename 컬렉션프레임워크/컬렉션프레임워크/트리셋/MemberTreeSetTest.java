package 컬렉션프레임워크.컬렉션프레임워크.트리셋;
import 컬렉션프레임워크.컬렉션프레임워크.콜렉션.Member;

public class MemberTreeSetTest {
    public static void main(String [] args) {
        MemberTreeSet a = new MemberTreeSet();
        Member c = new Member(1, "woojin");
        Member d = new Member(2, "jin");
        String b = new String("abc");
        System.out.println(b.compareTo("bcd")); //이렇게 String클래스에서는 이미 정의되어있다.
        System.out.println(c.compareTo(d));
        a.addmember(c);
        
        // a.addmember(new Member(1, "woojin"));   //TreeSet을 사용할때 인수로 Member를 사용했는데 Member는 내가 정의한것이기 때문에
        // //추가적으로 compareTo함수를 재정의해줘야한다.
        // a.addmember(new Member(2, "jin"));
        // a.addmember(new Member(3, "soon"));
        // a.addmember(new Member(4, "hyeon"));
        // a.showAllMember();
        // a.removemember(4);
        // a.showAllMember();   
    }
}
