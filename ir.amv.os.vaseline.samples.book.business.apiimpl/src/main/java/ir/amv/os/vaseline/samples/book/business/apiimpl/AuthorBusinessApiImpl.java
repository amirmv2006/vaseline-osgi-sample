/**
 * Copyright (c) Experian, 2009. All rights reserved.
 */
package ir.amv.os.vaseline.samples.book.business.apiimpl;

import ir.amv.os.vaseline.business.apis.basic.layerimpl.server.crud.IBaseImplementedCrudApi;
import ir.amv.os.vaseline.business.apis.simplesearch.layerimpl.server.IBaseImplementedSimpleSearchApi;
import ir.amv.os.vaseline.samples.book.business.api.IAuthorBusinessApi;
import ir.amv.os.vaseline.samples.books.dao.api.IAuthorDao;
import ir.amv.os.vaseline.samples.books.model.server.AuthorEntity;
import ir.amv.os.vaseline.samples.books.model.shared.AuthorDto;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Amir
 */
@Component(
        immediate = true,
        service = IAuthorBusinessApi.class
)
public class AuthorBusinessApiImpl implements
        IAuthorBusinessApi,
        IBaseImplementedCrudApi<AuthorEntity, Long, IAuthorDao>,
        IBaseImplementedSimpleSearchApi<AuthorEntity, AuthorDto, Long, IAuthorDao>{

    @Reference
    private IAuthorDao authorDao;

    public IAuthorDao getDao() {
        return authorDao;
    }

    public <Proxy> Proxy getProxy(final Class<Proxy> proxyClass) {
        return null;
    }

    public <Proxy> void setProxy(final Proxy proxy) {

    }
}