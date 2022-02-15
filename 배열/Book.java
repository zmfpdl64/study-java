package 배열;

public class Book {
    String name;
    String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public void setBookName(String name){
        this.name = name;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void showBookinfo() {
        System.out.println(name + " " + author);
    }
    
}
