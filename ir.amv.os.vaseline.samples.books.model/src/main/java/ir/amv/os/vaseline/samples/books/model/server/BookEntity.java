/**
 * Copyright (c) Experian, 2009. All rights reserved.
 */
package ir.amv.os.vaseline.samples.books.model.server;

import ir.amv.os.vaseline.basics.apis.dao.server.ent.BaseEntityImpl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Amir
 */
@Entity
@Table(name = "SMP_BOOK")
public class BookEntity extends BaseEntityImpl<Long> {

    @Column(unique = true)
    private String bookName;
    private Integer publishYear;
    @ManyToOne
    @JoinColumn(name = "BOOK_AUTHOR_ID")
    private AuthorEntity author;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(final String bookName) {
        this.bookName = bookName;
    }

    public Integer getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(final Integer publishYear) {
        this.publishYear = publishYear;
    }

    public AuthorEntity getAuthor() {
        return author;
    }

    public void setAuthor(final AuthorEntity author) {
        this.author = author;
    }
}
