/**
 * Copyright (c) Experian, 2009. All rights reserved.
 */
package ir.amv.os.vaseline.samples.books.model.server;

import ir.amv.os.vaseline.basics.apis.dao.server.ent.BaseEntityImpl;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

/**
 * @author Amir
 */
@Entity
@Table(name = "SMP_AUTHOR")
@Access(AccessType.FIELD)
public class AuthorEntity extends BaseEntityImpl<Long> {

    @Column(unique = true)
    private String authorName;
    @OneToMany(mappedBy = "author")
    private Set<BookEntity> books;

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(final String authorName) {
        this.authorName = authorName;
    }

    public Set<BookEntity> getBooks() {
        return books;
    }

    public void setBooks(final Set<BookEntity> books) {
        this.books = books;
    }
}
