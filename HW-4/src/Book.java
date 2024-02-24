public class Book {
    private String nameBook;
    private Author author;
    private Integer yearOfPrinting;

    public Book(String nameBook, Author author, Integer yearOfPrinting) {
        this.nameBook = nameBook;
        this.author = author;
        this.yearOfPrinting = yearOfPrinting;
    }

    public String getNameBook() {
        return nameBook;
    }

    public Author getAuthor() {
        return author;
    }

    public Integer getYearOfPrinting() {
        return yearOfPrinting;
    }

    public void setYearOfPrinting(Integer yearOfPrinting) {
        this.yearOfPrinting = yearOfPrinting;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Книга { \n ");
        stringBuilder.append("Название :");
        stringBuilder.append(this.nameBook);
        stringBuilder.append(this.author);
        stringBuilder.append("\n Год выпуска: ");
        stringBuilder.append(this.yearOfPrinting);
        stringBuilder.append("\n}");
        return stringBuilder.toString();
    }
}
