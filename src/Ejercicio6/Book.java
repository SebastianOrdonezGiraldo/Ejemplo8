package Ejercicio6;

public class Book {
    private String author;
    private String title;
    private float price;

    public Book(String author, String title, float price) {
        this.author = author;
        this.title = title;
        this.price = price;
    }


    @Override
    public String toString() {
        return "Book" +
                "author" + author + '\'' +
                "title" + title + '\'' +
                "price" + price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
