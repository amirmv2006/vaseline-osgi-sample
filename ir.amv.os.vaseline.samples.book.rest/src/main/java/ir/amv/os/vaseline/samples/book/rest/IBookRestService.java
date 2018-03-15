package ir.amv.os.vaseline.samples.book.rest;

import ir.amv.os.vaseline.basics.apis.core.shared.base.dto.paging.PagingDto;
import ir.amv.os.vaseline.basics.apis.core.shared.base.exc.BaseVaselineClientException;
import ir.amv.os.vaseline.samples.books.model.shared.BookDto;
import ir.amv.os.vaseline.ws.rest.apis.basic.layer.base.multiparam.annot.JsonMultParam;
import ir.amv.os.vaseline.ws.rest.apis.basic.layer.base.multiparam.annot.JsonParam;
import ir.amv.os.vaseline.ws.rest.apis.basic.layer.crud.IBaseCrudRestService;
import ir.amv.os.vaseline.ws.rest.apis.basic.layer.ro.IBaseReadOnlyRestService;
import ir.amv.os.vaseline.ws.rest.apis.simplesearch.layer.IBaseSimpleSearchRestService;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Map;

/**
 * @author Amir
 */
@Path("/books")
public interface IBookRestService extends
        IBaseCrudRestService<BookDto, Long>, IBaseSimpleSearchRestService<BookDto, Long> {

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/query/page")
    List<BookDto> searchByExamplePaged(@JsonMultParam({
            @JsonParam(paramName = "example", paramType = BookDto.class),
            @JsonParam(paramName = "pagingDto", paramType = PagingDto.class)
    }) Map<String, Object> objectMap) throws BaseVaselineClientException;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/securedWithAnnotation")
    @RolesAllowed("book:read")
    List<BookDto> testRolesAllowed() throws BaseVaselineClientException;

}
