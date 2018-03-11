/**
 * Copyright (c) Experian, 2009. All rights reserved.
 */
package ir.amv.os.vaseline.samples.book.business.api;

import ir.amv.os.vaseline.business.apis.basic.layer.server.crud.IBaseCrudApi;
import ir.amv.os.vaseline.business.apis.simplesearch.layer.server.IBaseSimpleSearchApi;
import ir.amv.os.vaseline.samples.books.model.server.AuthorEntity;
import ir.amv.os.vaseline.samples.books.model.shared.AuthorDto;
import ir.amv.os.vaseline.security.apis.authorization.basic.server.api.annot.ActionTreeName;

/**
 * @author Amir
 */
@ActionTreeName("author")
public interface IAuthorBusinessApi
        extends
        IBaseCrudApi<AuthorEntity, Long>,
        IBaseSimpleSearchApi<AuthorEntity, AuthorDto, Long>{
}
