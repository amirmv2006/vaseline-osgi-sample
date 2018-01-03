/**
 * Copyright (c) Experian, 2009. All rights reserved.
 */
package ir.amv.os.vaseline.samples.books.dao.api;

import ir.amv.os.vaseline.data.apis.dao.basic.server.crud.IBaseCrudDao;
import ir.amv.os.vaseline.samples.books.model.server.BookEntity;

/**
 * @author Amir
 */
public interface IBookDao extends IBaseCrudDao<BookEntity, Long> {
}
