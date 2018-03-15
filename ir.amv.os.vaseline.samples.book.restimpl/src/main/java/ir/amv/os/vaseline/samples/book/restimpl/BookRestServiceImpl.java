package ir.amv.os.vaseline.samples.book.restimpl;

import ir.amv.os.vaseline.basics.apis.core.server.base.exc.BaseVaselineServerException;
import ir.amv.os.vaseline.basics.apis.core.shared.base.dto.paging.PagingDto;
import ir.amv.os.vaseline.basics.apis.core.shared.base.exc.BaseVaselineClientException;
import ir.amv.os.vaseline.samples.book.rest.IBookRestService;
import ir.amv.os.vaseline.samples.book.service.api.IBookServiceApi;
import ir.amv.os.vaseline.samples.books.model.shared.BookDto;
import ir.amv.os.vaseline.security.apis.authentication.basic.server.IAuthenticationApi;
import ir.amv.os.vaseline.ws.rest.apis.basic.layerimpl.crud.IBaseImplementedCrudRestService;
import ir.amv.os.vaseline.ws.rest.apis.simplesearch.layerimpl.IBaseImplementedSimpleSearchRestService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.annotation.security.RolesAllowed;
import java.util.List;
import java.util.Map;

/**
 * @author Amir
 */
@Component(
        immediate = true,
        service = IBookRestService.class
)
public class BookRestServiceImpl
        implements IBookRestService,
        IBaseImplementedSimpleSearchRestService<BookDto, Long, IBookServiceApi>,
        IBaseImplementedCrudRestService<BookDto, Long, IBookServiceApi> {
    private IBookServiceApi bookService;
    private IAuthenticationApi authenticationApi;

    @Override
    public IBookServiceApi getService() {
        return bookService;
    }

    @Reference
    public void setBookService(final IBookServiceApi bookService) {
        this.bookService = bookService;
    }

    @Override
    public List<BookDto> getAll() throws BaseVaselineClientException {
        try {
            System.out.println("authenticationApi = " + authenticationApi.getCurrentUsername());
        } catch (BaseVaselineServerException e) {
            e.printStackTrace();
        }
        return IBaseImplementedSimpleSearchRestService.super.getAll();
    }

    @Override
    public List<BookDto> searchByExamplePaged(final Map<String, Object> objectMap) throws BaseVaselineClientException {
        return IBaseImplementedSimpleSearchRestService.super.searchByExample((BookDto)objectMap.get("example"),
                (PagingDto)objectMap.get("pagingDto"));
    }

    @Override
    public List<BookDto> testRolesAllowed() throws BaseVaselineClientException {
        return getAll();
    }

    @Reference
    public void setAuthenticationApi(final IAuthenticationApi authenticationApi) {
        this.authenticationApi = authenticationApi;
    }
}
