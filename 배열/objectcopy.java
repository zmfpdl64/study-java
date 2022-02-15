package 배열;

public class objectcopy {
    public static void main(String [] args) {
        Book [] bookArray1 = new Book[3];
        Book [] bookArray2 = new Book[3];

        bookArray1[0] = new Book("태백산맥", "조정래");
        bookArray1[1] = new Book("데미안", "헤르만 헤세");
        bookArray1[2] = new Book("어떻게 살 것인가", "유시민");
        System.arraycopy(bookArray1, 0, bookArray2, 0, 3);

        for(int i = 0; i < bookArray2.length; i++) {
            bookArray2[i].showBookinfo();
        }

        System.out.println("=== Arrary1 ===");
        bookArray1[0].setBookName("나목");
        bookArray1[0].setAuthor("박완서");
        for(int i = 0; i < bookArray1.length; i++) {
            bookArray1[i].showBookinfo();
        }

        System.out.println("=== Array2 ===");
        for(int i = 0; i < bookArray2.length; i++){
            bookArray2[i].showBookinfo();       //array1을 수정했지만 array2까지 수정이 된 모습이다.
            //이유는 메모리 주소를 전달하여 복사하였기 때문이다. 즉 값이 2개로 복사가 된게 아니라 1개를 같이 쓰는것이다.
            //이것을 얕은 복사라한다.
            //이것과 반대로 깊은 복사는 아예 값을 변경하는것을 깊은 복사라한다.
        }
    }

}
