/**
 * Copyright (c) Experian, 2009. All rights reserved.
 */
package ir.amv.os.vaseline.samples.book.service.api;

import ir.amv.os.vaseline.samples.books.model.shared.BookDto;
import ir.amv.os.vaseline.service.apis.basic.layer.server.crud.IBaseCrudService;
import ir.amv.os.vaseline.service.apis.simplesearch.layer.server.IBaseSimpleSearchService;

/**
 * @author Amir
 */
public interface IBookServiceApi
        extends IBaseSimpleSearchService<BookDto, Long>, IBaseCrudService<BookDto, Long> {
}
