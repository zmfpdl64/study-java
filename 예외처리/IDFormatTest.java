package 예외처리;

public class IDFormatTest {
    private String userid;

    public String getid() {
        return this.userid;
    }
    public void setuserid(String userid) throws IDFormatException  {    //예외 처리할 클래스를 기입해줘야한다.
        if(userid == null) {
            throw new IDFormatException("문자를 채워주세요");
        }
        else if(userid.length() < 8 || userid.length() > 20) {
            throw new IDFormatException("8자 이상 20자 이하로 작성해주세요");
        }
        this.userid = userid;
    }

    public static void main(String [] args) {
        IDFormatTest a = new IDFormatTest();
        String userid = null;
        try{
            a.setuserid(userid);
        } catch(IDFormatException e) {
            System.out.println(e.getMessage());
            // e.printStackTrace();
            // System.out.println(e);
        }
        userid = "1234567";
        try {
            a.setuserid(userid);
        } catch(IDFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
