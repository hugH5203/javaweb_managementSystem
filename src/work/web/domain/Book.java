package work.web.domain;

/**
 * @author HuangHai
 * @date 2020/12/21 14:11
 */
public class Book {
    private int bookid;
    private String bookName;
    private String author;
    private  String publish;
    private  double price;
    private String pubdate;
    private  String booktype;

    public Book() {
    }

    public Book(int bookid, String bookName, String author, String publish, double price, String pubdate, String booktype) {
        this.bookid = bookid;
        this.bookName = bookName;
        this.author = author;
        this.publish = publish;
        this.price = price;
        this.pubdate = pubdate;
        this.booktype = booktype;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookid=" + bookid +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", publish='" + publish + '\'' +
                ", price=" + price +
                ", pubdate='" + pubdate + '\'' +
                ", booktype='" + booktype + '\'' +
                '}';
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPubdate() {
        return pubdate;
    }

    public void setPubdate(String pubdate) {
        this.pubdate = pubdate;
    }

    public String getBooktype() {
        return booktype;
    }

    public void setBooktype(String booktype) {
        this.booktype = booktype;
    }
}
