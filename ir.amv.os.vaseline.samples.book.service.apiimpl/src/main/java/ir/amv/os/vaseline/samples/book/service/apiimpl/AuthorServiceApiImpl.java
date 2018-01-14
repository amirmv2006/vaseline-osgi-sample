/**
 * Copyright (c) Experian, 2009. All rights reserved.
 */
package ir.amv.os.vaseline.samples.book.service.apiimpl;

import ir.amv.os.vaseline.basics.apis.core.server.base.exc.handler.ICoreExceptionHandler;
import ir.amv.os.vaseline.basics.apis.mapper.server.objmapper.IVaselineObjectMapper;
import ir.amv.os.vaseline.samples.book.business.api.IAuthorBusinessApi;
import ir.amv.os.vaseline.samples.book.service.api.IAuthorServiceApi;
import ir.amv.os.vaseline.samples.books.model.server.AuthorEntity;
import ir.amv.os.vaseline.samples.books.model.shared.AuthorDto;
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
        service = IAuthorServiceApi.class
)
public class AuthorServiceApiImpl
        implements IAuthorServiceApi,
        IBaseImplementedSimpleSearchService<AuthorEntity, AuthorDto, Long, IAuthorBusinessApi>,
        IBaseImplementedCrudService<AuthorEntity, AuthorDto, Long, IAuthorBusinessApi> {
    private IAuthorBusinessApi authorBusinessApi;
    private IVaselineObjectMapper mapper;
    private Validator validator;
    private ICoreExceptionHandler coreExceptionHandler;

    @Override
    public IAuthorBusinessApi getApi() {
        return authorBusinessApi;
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
    public void setValidator(final Validator validator) {
        this.validator = validator;
    }

    @Reference
    public void setMapper(final IVaselineObjectMapper mapper) {
        this.mapper = mapper;
    }

    @Reference
    public void setCoreExceptionHandler(final ICoreExceptionHandler coreExceptionHandler) {
        this.coreExceptionHandler = coreExceptionHandler;
    }

    @Reference
    public void setAuthorBusinessApi(final IAuthorBusinessApi authorBusinessApi) {
        this.authorBusinessApi = authorBusinessApi;
    }
}
