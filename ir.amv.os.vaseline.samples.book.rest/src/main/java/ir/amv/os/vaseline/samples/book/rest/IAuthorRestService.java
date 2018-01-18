package ir.amv.os.vaseline.samples.book.rest;

import ir.amv.os.vaseline.samples.books.model.shared.AuthorDto;
import ir.amv.os.vaseline.ws.rest.apis.basic.layer.ro.IBaseReadOnlyRestService;

import javax.ws.rs.Path;

/**
 * @author Amir
 */
@Path("authors")
public interface IAuthorRestService
        extends IBaseReadOnlyRestService<AuthorDto, Long> {
}
