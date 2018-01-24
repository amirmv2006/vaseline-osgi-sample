package ir.amv.os.vaseline.samples.book.restimpl;

import ir.amv.os.vaseline.samples.book.rest.IAuthorRestService;
import ir.amv.os.vaseline.samples.book.service.api.IAuthorServiceApi;
import ir.amv.os.vaseline.samples.books.model.shared.AuthorDto;
import ir.amv.os.vaseline.ws.rest.apis.basic.layerimpl.crud.IBaseImplementedCrudRestService;
import ir.amv.os.vaseline.ws.rest.apis.simplesearch.layerimpl.IBaseImplementedSimpleSearchRestService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Amir
 */
@Component(
        immediate = true,
        service = IAuthorRestService.class
)
public class AuthorRestServiceImpl
        implements IAuthorRestService,
        IBaseImplementedSimpleSearchRestService<AuthorDto, Long, IAuthorServiceApi>,
        IBaseImplementedCrudRestService<AuthorDto, Long, IAuthorServiceApi> {
    private IAuthorServiceApi authorService;

    @Override
    public IAuthorServiceApi getService() {
        return authorService;
    }

    @Reference
    public void setAuthorService(final IAuthorServiceApi authorService) {
        this.authorService = authorService;
    }
}
