/**
 * Copyright (c) Experian, 2009. All rights reserved.
 */
package ir.amv.os.vaseline.samples.books.model.shared;

import ir.amv.os.vaseline.basics.apis.core.shared.base.dto.base.baseimpl.BaseDtoImpl;
import ir.amv.os.vaseline.samples.books.model.server.AuthorEntity;

/**
 * @author Amir
 */
public class BookDto extends BaseDtoImpl<Long> {

    private String bookName;
    private Integer publishYear;
    private AuthorDto author;

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

    public AuthorDto getAuthor() {
        return author;
    }

    public void setAuthor(final AuthorDto author) {
        this.author = author;
    }
}
