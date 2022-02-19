package 컬렉션프레임워크.컬렉션프레임워크.콜렉션어레이리스트;

import 컬렉션프레임워크.컬렉션프레임워크.콜렉션.Member;

public class Test {
    public static void main(String [] args) {
        MemberArrayList a = new MemberArrayList();
        a.showAllMember();
        a.addMember(new Member(1, "hyeon"));
        a.addMember(new Member(2, "woojin"));
        a.addMember(new Member(3, "bin"));
        a.addMember(new Member(4, "dol"));
        System.out.println("hello" + a.getArray());
        for(Object b : a.getArray()) {
            System.out.println(b);
        }
        a.showAllMember();
        a.removeMember(2);
        a.showAllMember();
    }
}
