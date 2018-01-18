package ir.amv.os.vaseline.samples.book.rest.impl;

import ir.amv.os.vaseline.samples.book.rest.IAuthorRestService;
import ir.amv.os.vaseline.samples.book.service.api.IAuthorServiceApi;
import ir.amv.os.vaseline.samples.books.model.shared.AuthorDto;
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
        implements IAuthorRestService, IBaseImplementedReadOnlyRestService<AuthorDto, Long, IAuthorServiceApi> {

    private IAuthorServiceApi authorService;

    @Reference
    public void setAuthorService(final IAuthorServiceApi authorService) {
        this.authorService = authorService;
    }

    @Override
    public IAuthorServiceApi getService() {
        return authorService;
    }

}
