/**
 * Copyright (c) Experian, 2009. All rights reserved.
 */
package ir.amv.os.vaseline.samples.book.service.apiimpl;

import ir.amv.os.vaseline.basics.apis.core.server.base.exc.handler.ICoreExceptionHandler;
import ir.amv.os.vaseline.basics.apis.mapper.server.objmapper.IVaselineObjectMapper;
import ir.amv.os.vaseline.samples.book.business.api.IBookBusinessApi;
import ir.amv.os.vaseline.samples.book.service.api.IBookServiceApi;
import ir.amv.os.vaseline.samples.books.model.server.BookEntity;
import ir.amv.os.vaseline.samples.books.model.shared.BookDto;
import ir.amv.os.vaseline.service.apis.basic.layerimpl.server.crud.IBaseImplementedCrudService;
import ir.amv.os.vaseline.service.apis.simplesearch.layerimpl.server.IBaseImplementedSimpleSearchService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.validation.Validator;

/**
 * @author Amir
 */
@Component(
        immediate = true,
        service = IBookServiceApi.class
)
public class BookServiceApiImpl
        implements IBookServiceApi,
        IBaseImplementedSimpleSearchService<BookEntity, BookDto,Long, IBookBusinessApi>,
        IBaseImplementedCrudService<BookEntity, BookDto, Long, IBookBusinessApi>{

    private IBookBusinessApi bookBusinessApi;
    private IVaselineObjectMapper mapper;
    private Validator validator;
    private ICoreExceptionHandler coreExceptionHandler;

    @Override
    public IBookBusinessApi getApi() {
        return bookBusinessApi;
    }

    @Override
    public IVaselineObjectMapper getMapper() {
        return mapper;
    }

    @Override
    public Validator getValidator() {
        return validator;
    }

    @Override
    public ICoreExceptionHandler getCoreExceptionHandler() {
        return coreExceptionHandler;
    }

    @Reference
    public void setBookBusinessApi(final IBookBusinessApi bookBusinessApi) {
        this.bookBusinessApi = bookBusinessApi;
    }

    @Reference
    public void setCoreExceptionHandler(final ICoreExceptionHandler coreExceptionHandler) {
        this.coreExceptionHandler = coreExceptionHandler;
    }

    @Reference
    public void setMapper(final IVaselineObjectMapper mapper) {
        this.mapper = mapper;
    }

    @Reference
    public void setValidator(final Validator validator) {
        this.validator = validator;
    }
}
