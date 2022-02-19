package 컬렉션프레임워크.컬렉션프레임워크.콜렉션;

public class Member implements Comparable<Member> {
    private int memberid;
    private String name;

    public Member(int memberid, String name) {
        this.memberid = memberid;
        this.name = name;
    }
    public int getmemid() {
        return this.memberid;
    }
    public void setmemid(int id) {
        this.memberid = id;
    }
    public String getname() {
        return this.name;
    }
    public void setname(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name + " 회원님의 아이디는 " + memberid + "입니다.";
    }
    @Override
    public int hashCode() {
        return memberid;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member) {
            Member member = (Member)obj;
            if(this.memberid == member.memberid) {
                return true;
            }
            else
                return false;
        }
        return false;
    }
    @Override
    public int compareTo(Member member) {
        return (this.memberid - member.memberid) * (-1);
    }
}
