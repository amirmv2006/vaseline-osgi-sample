package ir.amv.os.vaseline.samples.book.rest;

import ir.amv.os.vaseline.samples.books.model.shared.BookDto;
import ir.amv.os.vaseline.ws.rest.apis.basic.layer.crud.IBaseCrudRestService;
import ir.amv.os.vaseline.ws.rest.apis.basic.layer.ro.IBaseReadOnlyRestService;
import ir.amv.os.vaseline.ws.rest.apis.simplesearch.layer.IBaseSimpleSearchRestService;

import javax.ws.rs.Path;

/**
 * @author Amir
 */
@Path("/books")
public interface IBookRestService extends
        IBaseCrudRestService<BookDto, Long>, IBaseSimpleSearchRestService<BookDto, Long> {

}
