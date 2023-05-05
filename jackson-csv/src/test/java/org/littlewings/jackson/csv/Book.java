package org.littlewings.jackson.csv;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"isbn", "title", "price", "publishDate"})  // for CsvMapper#schemaFor
public class Book {
    String isbn;
    String title;
    int price;
    @JsonFormat(pattern = "yyyy-MM-dd")
    LocalDate publishDate;

    public static Book create(String isbn, String title, int price, LocalDate publishDate) {
        Book book = new Book();

        book.setIsbn(isbn);
        book.setTitle(title);
        book.setPrice(price);
        book.setPublishDate(publishDate);

        return book;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }
}
