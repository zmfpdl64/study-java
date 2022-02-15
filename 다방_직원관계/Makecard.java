package 다방_직원관계;

public class Makecard {
    private static Makecard serialnum = new Makecard();
    public int cardid;

    public Makecard() {
        
    }
    public Makecard(int cardid) {
        this.cardid = cardid;
    }
    public static Makecard getId() {
        if (serialnum == null){
            serialnum = new Makecard();
            serialnum.cardid = 10;
            System.out.println(serialnum.cardid);
        }
        return serialnum;
    }
    
}
