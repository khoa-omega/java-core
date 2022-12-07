package entity;

public class Book extends Document {
    private String authorName;
    private int pageNumbers;

    public Book(int id, String nxb, int releaseNumber, String authorName, int pageNumbers) {
        super(id, nxb, releaseNumber);
        this.authorName = authorName;
        this.pageNumbers = pageNumbers;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPageNumbers() {
        return pageNumbers;
    }

    public void setPageNumbers(int pageNumbers) {
        this.pageNumbers = pageNumbers;
    }

    @Override
    public String toString() {
        return "Book{" +
                "authorName='" + authorName + '\'' +
                ", pageNumbers=" + pageNumbers +
                ", id=" + id +
                ", nxb='" + nxb + '\'' +
                ", releaseNumber=" + releaseNumber +
                '}';
    }
}
