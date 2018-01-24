package ir.amv.os.vaseline.samples.book.restimpl;

import ir.amv.os.vaseline.samples.book.rest.IBookRestService;
import ir.amv.os.vaseline.samples.book.service.api.IBookServiceApi;
import ir.amv.os.vaseline.samples.books.model.shared.BookDto;
import ir.amv.os.vaseline.ws.rest.apis.basic.layer.base.IBaseRestService;
import ir.amv.os.vaseline.ws.rest.apis.basic.layerimpl.crud.IBaseImplementedCrudRestService;
import ir.amv.os.vaseline.ws.rest.apis.simplesearch.layerimpl.IBaseImplementedSimpleSearchRestService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

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

    @Override
    public IBookServiceApi getService() {
        return bookService;
    }

    @Reference
    public void setBookService(final IBookServiceApi bookService) {
        this.bookService = bookService;
    }
}
