package ir.amv.os.vaseline.samples.book.rest;

import ir.amv.os.vaseline.samples.books.model.shared.BookDto;
import ir.amv.os.vaseline.ws.rest.apis.basic.layer.ro.IBaseReadOnlyRestService;

import javax.ws.rs.Path;

/**
 * @author Amir
 */
@Path("/books")
public interface IBookRestService extends IBaseReadOnlyRestService<BookDto, Long> {

}
