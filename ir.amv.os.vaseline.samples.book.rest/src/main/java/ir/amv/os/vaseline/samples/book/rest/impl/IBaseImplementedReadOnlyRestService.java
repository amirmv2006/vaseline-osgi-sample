package ir.amv.os.vaseline.samples.book.rest.impl;

import ir.amv.os.vaseline.basics.apis.core.shared.base.dto.base.IBaseDto;
import ir.amv.os.vaseline.basics.apis.core.shared.base.dto.paging.PagingDto;
import ir.amv.os.vaseline.basics.apis.core.shared.base.exc.BaseVaselineClientException;
import ir.amv.os.vaseline.service.apis.basic.layer.server.ro.IBaseReadOnlyService;
import ir.amv.os.vaseline.ws.common.apis.basic.layerimpl.ro.IBaseImplementedReadOnlyWebService;
import ir.amv.os.vaseline.ws.rest.apis.basic.layer.ro.IBaseReadOnlyRestService;

import java.io.Serializable;
import java.util.List;

/**
 * @author Amir
 */
public interface IBaseImplementedReadOnlyRestService<D extends IBaseDto<Id>, Id extends Serializable, Service extends
        IBaseReadOnlyService<D, Id>>
        extends IBaseReadOnlyRestService<D, Id>/*, IBaseImplementedReadOnlyWebService<D, Id>*/ {

    Service getService();

    @Override
    default D getById(Id id) throws BaseVaselineClientException {
        return getService().getById(id);
    }

    @Override
    default Long countAll() throws BaseVaselineClientException {
        return getService().countAll();
    }

    @Override
    default List<D> getAll() throws BaseVaselineClientException {
        return getService().getAll();
    }

    @Override
    default List<D> getAll(PagingDto pagingDto) throws BaseVaselineClientException {
        return getService().getAll(pagingDto);
    }
}