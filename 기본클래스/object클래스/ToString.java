package 기본클래스.object클래스;

class Book {
    int booknumber;
    String bookTitle;

    Book(int bookNumber, String bookTitle) {    //default형 생성자
        this.booknumber = bookNumber;
        this.bookTitle = bookTitle;
    }
    @Override
    public String toString() {
        // return this.bookTitle;
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
    @Override
    public boolean equals(Object a) {
        if (this == a)
            return true;
        else
            return false;
    }
    @Override
    public int hashCode() {
        return this.booknumber;
    }
}


public class ToString {
    public static void main(String [] args) {
        String str1 = new String("abc");
        String str2 = new String("def");
        Book book1 = new Book(200, "개미");
        Book book3 = book1;
        Book book2 = new Book(200, "개미");
        if(book1.bookTitle == book2.bookTitle) {
            System.out.println("book1과 book2 제목이 같습니다.");
        }
        if(book1.equals(book3)){    //주소를 비교하여 동일한지 확인하는 코드
            System.out.println("book1과 book3는 동일합니다." + book1.equals(book3));
        }
        System.out.println(book1);
        System.out.println(book1.toString());
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        
    }
}
