/**
 * Copyright (c) Experian, 2009. All rights reserved.
 */
package ir.amv.os.vaseline.samples.books.model.shared;

import ir.amv.os.vaseline.basics.apis.core.shared.base.dto.base.baseimpl.BaseDtoImpl;

import java.util.Set;

/**
 * @author Amir
 */
public class AuthorDto extends BaseDtoImpl<Long> {

    private String authorName;
    private Set<BookDto> books;

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(final String authorName) {
        this.authorName = authorName;
    }

    public Set<BookDto> getBooks() {
        return books;
    }

    public void setBooks(final Set<BookDto> books) {
        this.books = books;
    }
}
