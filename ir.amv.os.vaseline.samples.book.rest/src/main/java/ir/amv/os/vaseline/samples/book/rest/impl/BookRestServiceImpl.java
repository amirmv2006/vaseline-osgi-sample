package ir.amv.os.vaseline.samples.book.rest.impl;

import ir.amv.os.vaseline.basics.apis.core.shared.base.dto.base.IBaseDto;
import ir.amv.os.vaseline.basics.apis.core.shared.base.exc.BaseVaselineClientException;
import ir.amv.os.vaseline.samples.book.rest.IBookRestService;
import ir.amv.os.vaseline.samples.book.service.api.IBookServiceApi;
import ir.amv.os.vaseline.samples.books.model.shared.AuthorDto;
import ir.amv.os.vaseline.samples.books.model.shared.BookDto;
import ir.amv.os.vaseline.service.apis.basic.layer.server.ro.IBaseReadOnlyService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.io.Serializable;
import java.util.Collections;

/**
 * @author Amir
 */
@Component(
        immediate = true
)
public class BookRestServiceImpl
        implements IBookRestService, IBaseImplementedReadOnlyRestService<BookDto, Long, IBookServiceApi> {

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
