/**
 * Copyright (c) Experian, 2009. All rights reserved.
 */
package ir.amv.os.vaseline.samples.book.business.apiimpl;

import ir.amv.os.vaseline.business.apis.basic.layer.server.action.executor.IVaselineBusinessActionExecutor;
import ir.amv.os.vaseline.business.apis.basic.layerimpl.server.crud.IBaseImplementedCrudApi;
import ir.amv.os.vaseline.business.apis.simplesearch.layerimpl.server.IBaseImplementedSimpleSearchApi;
import ir.amv.os.vaseline.samples.book.business.api.IBookBusinessApi;
import ir.amv.os.vaseline.samples.books.dao.api.IBookDao;
import ir.amv.os.vaseline.samples.books.model.server.BookEntity;
import ir.amv.os.vaseline.samples.books.model.shared.BookDto;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Amir
 */
@Component(
        immediate = true,
        service = IBookBusinessApi.class
)
public class BookBusinessApiImpl
        implements
        IBookBusinessApi,
        IBaseImplementedCrudApi<BookEntity, Long, IBookDao>,
        IBaseImplementedSimpleSearchApi<BookEntity, BookDto, Long, IBookDao> {

    private IBookDao bookDao;
    private IVaselineBusinessActionExecutor businessActionExecutor;

    public IBookDao getDao() {
        return bookDao;
    }

    public <Proxy> Proxy getProxy(final Class<Proxy> proxyClass) {
        return null;
    }

    public <Proxy> void setProxy(final Proxy proxy) {

    }

    @Override
    public IVaselineBusinessActionExecutor getBusinessActionExecutor() {
        return businessActionExecutor;
    }

    @Reference
    public void setBookDao(final IBookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Reference
    public void setBusinessActionExecutor(final IVaselineBusinessActionExecutor businessActionExecutor) {
        this.businessActionExecutor = businessActionExecutor;
    }
}
