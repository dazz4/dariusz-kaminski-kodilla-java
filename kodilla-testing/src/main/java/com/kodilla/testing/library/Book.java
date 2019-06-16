package com.kodilla.testing.library;

public class Book {
    String tittle;
    String author;
    int publicationYear;

    public Book(String tittle, String author, int publicationYear) {
        this.tittle = tittle;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTittle() {
        return tittle;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (publicationYear != book.publicationYear) return false;
        if (tittle != null ? !tittle.equals(book.tittle) : book.tittle != null) return false;
        return author != null ? author.equals(book.author) : book.author == null;
    }

    @Override
    public int hashCode() {
        int result = tittle != null ? tittle.hashCode() : 0;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + publicationYear;
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "tittle='" + tittle + '\'' +
                ", author='" + author + '\'' +
                ", publicationYear=" + publicationYear +
                '}';
    }
}
