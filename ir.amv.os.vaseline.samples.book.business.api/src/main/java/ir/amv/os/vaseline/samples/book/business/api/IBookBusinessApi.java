/**
 * Copyright (c) Experian, 2009. All rights reserved.
 */
package ir.amv.os.vaseline.samples.book.business.api;

import ir.amv.os.vaseline.business.apis.basic.layer.server.crud.IBaseCrudApi;
import ir.amv.os.vaseline.business.apis.simplesearch.layer.server.IBaseSimpleSearchApi;
import ir.amv.os.vaseline.samples.books.model.server.BookEntity;
import ir.amv.os.vaseline.samples.books.model.shared.BookDto;

/**
 * @author Amir
 */
public interface IBookBusinessApi
        extends
        IBaseCrudApi<BookEntity, Long>,
        IBaseSimpleSearchApi<BookEntity, BookDto, Long> {
}
